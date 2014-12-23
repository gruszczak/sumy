package sources;

import java.math.BigInteger;

public class CalculateClass {

	// --------------------------------/Блок расчета ОГЗ/-------------------/

	int dovorot, maxLength, dX, dY;
	double alpha, ro, mestoCeli;
	int arr_b0[] = { 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75 };
	int arr_x0[] = { 1107372, 1661208, 2215220, 2769457, 3323965, 3878777,
			4433921, 4989413, 5545260, 6101455, 6657985, 7214823, 7771934,
			8329274 };
	int arr_y0[] = { 329065, 322785, 314057, 302944, 289530, 273912, 256206,
			236544, 215074, 191956, 167365, 141487, 114521, 86075 };

	public boolean checkZZ(int yA, int yB) {
		yA = yA / 1000000;
		yB = yB / 1000000;
		if (yA == yB) {
			return false;
		} else {
			return true;
		}
	}

	private int calcDeltaX(int xA, int xB) {
		return xB - xA;
	}

	private int calcDeltaY(int yA, int yB) {
		return yB - yA;
	}

	private int calcDovorot(int xA, int yA, int xB, int yB) {
		BigInteger t_b_x, t_b_y, res, y, x;
		int dovorot, b_x, b_y;
		b_x = calcDeltaX(xA, xB);
		b_y = calcDeltaY(yA, yB);
		x = BigInteger.valueOf(b_x);
		t_b_x = x.multiply(x);
		y = BigInteger.valueOf(b_y);
		t_b_y = y.multiply(y);
		res = t_b_x.add(t_b_y);
		dovorot = sqrt(res).intValue();
		return dovorot;
	}

	private double calcMestoCeli(int hA, int hB, int dovorot) {
		double M = Math.atan2(hB - hA, dovorot);
		M = M * 9.5493;
		return M;
	}

	private double calcRo(int b_x, int b_y) {
		double ro;
		ro = Math.atan((float) b_y / (float) b_x) * 9.5493;
		return ro;
	}

	public void calculateOGZ(int xA, int yA, int xB, int yB, int hA, int hB) {
		dX = calcDeltaX(xA, xB);
		dY = calcDeltaY(yA, yB);
		dovorot = calcDovorot(xA, yA, xB, yB);
		mestoCeli = calcMestoCeli(hA, hB, dovorot);
		if (dX == 0) {
			if (Math.abs(yB) > Math.abs(yA)) {
				alpha = (float) 15.00;
				dovorot = Math.abs(dY);
			} else {
				alpha = (float) 45.00;
				dovorot = Math.abs(dY);
			}
		} else
			ro = calcRo(dX, dY);
		if (dX < 0) {
			alpha = 30 + ro;
		} else if (dX > 0) {
			if (ro < 0) {
				alpha = 60 + ro;
			} else {
				alpha = ro;
			}
		}
	}

	public int getDovorot() {
		return dovorot;
	}

	public double getMestoCeli() {
		return mestoCeli;
	}

	public double getAlpha() {
		return alpha;
	}

	// --------------------------------/ОГЗ/--------------------------------/

	// --------------------------------/Перевод из зоны в зону--------------/
	double X, Y, dLj;

	public void converZZ(int xA, int yA, int xB, int yB) {
		int k, ZZ, ZZa, ZZb, dZZ, i, x0, y0;
		double b0, dX, dX1, dX2, dX3, dX4, dX5, dX6, dX7, A, A1, A2;
		ZZa = yA / 1000000;
		ZZb = yB / 1000000;
		dZZ = ZZa - ZZb;
		if (dZZ < 0) {
			k = 1;
			if (dZZ == -1) {
				ZZ = ZZa + 1;
			} else {
				return;
			}
		} else {
			k = -1;
			if (dZZ == 1) {
				ZZ = ZZa - 1;
			} else {
				return;
			}
		}
		i = 1;
		dX = -1;
		while (dX < 0) {
			dX = arr_x0[i] - xA;
			i++;
		}
		i--;
		dX1 = xA - arr_x0[i - 1];
		if (dX1 > dX) {
			x0 = arr_x0[i];
			b0 = arr_b0[i] * 0.01745;
			y0 = arr_y0[i];
			dX2 = xA - x0;
		} else {
			x0 = arr_x0[i - 1];
			b0 = arr_b0[i - 1] * 0.01745;
			y0 = arr_y0[i - 1];
			dX2 = dX1;
		}
		dX3 = (dX2 / 111000) * 0.01745;
		dX4 = b0 + dX3;
		dX5 = Math.sin(dX4);
		dX6 = Math.cos(dX4);
		A = y0 - (Math.tan(Math.sin((dX3 / 2) + b0) * 0.0523598)) * dX2;
		dX7 = A - (yA % 1000000 - 500000) * k;
		A1 = dX7 * Math.sin(dX5 * 0.10472) + xA;
		A2 = dX6 * (Math.pow((dX7 / 111000), 2)) * 16 + A1;
		if (dX4 - 0.78539 > 0) {
			X = A2;
		} else {
			X = A2 + (dX5 - 0.7853982) * dX6 * (Math.pow(dX7 / 111000, 2)) * 21;
		}
		Y = ZZ
				* 1000000
				+ 500000
				- (A + (Math.cos(dX5 * 0.10472)) * dX7 + (dX6
						* (Math.pow(dX7 / 111000, 2)) * 101)) * k;
		dLj = dX5 * (-k);
	}

	public double getNew_xA() {
		return X;
	}

	public double getNew_yA() {
		return Y;
	}

	public double getCorrectAlpha() {
		return dLj;
	}

	// --------------------------------/Перевод из зоны в зону/-------------/

	// --------------------------------/Блок расчета ПГЗ/-------------------/

	double xB, yB, hB;

	public void calculatePGZ(int xA, int yA, int hA, double alpha,
			double dovorot, double mestoCeli) {
		double dX, dY, k = 0.10472;
		dX = dovorot * Math.cos(alpha * k);
		dY = dovorot * Math.sin(alpha * k);
		xB = xA + dX;
		yB = yA + dY;
		hB = (dovorot * Math.tan(mestoCeli * k)) + hA;
	}

	public double get_xB() {
		return xB;
	}

	public double get_yB() {
		return yB;
	}

	public double get_hB() {
		return hB;
	}

	// --------------------------------/ПГЗ/--------------------------------/

	// begin Корень квадратный для Biginteger-------------------/
	BigInteger sqrt(BigInteger n) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8"))
				.toString());
		while (b.compareTo(a) >= 0) {
			BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
			if (mid.multiply(mid).compareTo(n) > 0)
				b = mid.subtract(BigInteger.ONE);
			else
				a = mid.add(BigInteger.ONE);
		}
		return a.subtract(BigInteger.ONE);
	}

	// -----------------/Корень квадратный для Biginteger/------------------/

	// begin Визначення зближення меридіанів по географічних
	// координатах----------------/

	public double calculateMeridian(double b_grad, double b_min, double b_sec,
			double l_grad, double l_min, double l_sec) {
		double y = 0, L0, L, N;
		if (b_grad > 90 || l_grad > 360) {
			return 999999;
		} else {
			b_sec = b_sec / 60;
			b_min = (b_min + b_sec) / 60;
			b_grad = b_grad + b_min;

			l_sec = l_sec / 60;
			l_min = (l_min + l_sec) / 60;
			l_grad = l_grad + l_min;

			N = l_grad / 6 + 1;
			L0 = 6 * N - 3;
			L = (l_grad - L0) * 60;
			y = L * Math.sin(b_grad * 0.01745);
			y = y / 3.6;
		}
		return y;
	}

	// ------------------/Визначення зближення меридіанів по географічних
	// координатах/----------------/

	// begin Обернена засічка орієнтованим приладом (по обернених
	// дирекційних кутах)-------------------------/
	int X_OZOP, Y_OZOP, H_OZOP, dX_OZOP, dY_OZOP;
	boolean isBigDiferences = false;

	// Разобраться с расчетом высоты (не правильно считает)!!!
	public void calculateOZOP(int xA, int yA, int xB, int yB, int xC, int yC,
			double lA, double lB, double lC, double mA, int hA, boolean twoPoint) {
		double x1, x2, y1, y2, D;
		lA = lA * 0.10472;
		lB = lB * 0.10472;
		lC = lC * 0.10472;
		mA = mA * 0.10472;
		if (lA > Math.PI) {
			lA = lA - Math.PI;
		} else {
			lA = lA + Math.PI;
		}
		if (lB > Math.PI) {
			lB = lB - Math.PI;
		} else {
			lB = lB + Math.PI;
		}
		x1 = ((xA * Math.tan(lA) - yA) - (xB * Math.tan(lB) - yB))
				/ (Math.tan(lA) - Math.tan(lB));
		y1 = (x1 - xA) * Math.tan(lA) + yA;
		D = calcDovorot(xA, yA, (int) x1, (int) y1);
		H_OZOP = (int) (hA - D * Math.tan(mA));

		if (twoPoint) {
			X_OZOP = (int) x1;
			Y_OZOP = (int) y1;
		} else {
			if (lC > Math.PI) {
				lC = lC - Math.PI;
			} else {
				lC = lC + Math.PI;
			}

			x2 = ((xA * Math.tan(lA) - yA) - (xC * Math.tan(lC) - yC))
					/ (Math.tan(lA) - Math.tan(lC));
			y2 = (x2 - xA) * Math.tan(lA) + yA;
			// Сдлеать проверку на большое расхождение для dX, dY (переспросить)
			dX = (int) (x2 - x1);
			dY = (int) (y1 - y2);
			// проверка дельт и установка флага
			if (Math.abs(dX_OZOP) > 25 || Math.abs(dY_OZOP) > 25) {
				isBigDiferences = true;
			}
			X_OZOP = (int) ((x1 + x2) / 2);
			Y_OZOP = (int) ((y1 + y2) / 2);
		}
	}

	public int get_X_OZOP() {
		return X_OZOP;
	}

	public int get_Y_OZOP() {
		return Y_OZOP;
	}

	public int get_H_OZOP() {
		return H_OZOP;
	}

	public int get_dX_OZOP() {
		return dX_OZOP;
	}

	public int get_dY_OZOP() {
		return dY_OZOP;
	}

	public boolean get_isBigDiferences() {
		return isBigDiferences;
	}

	// -----------------/Обернена засічка орієнтованим приладом (по обернених
	// дирекційних кутах)/-------------------------/

	// begin Обернена засічка за виміряними кутами неорієнтованим
	// приладом/-------------------------/
	int X_OZZVKNP, Y_OZZVKNP, H_OZZVKNP, dX_OZZVKNP, dY_OZZVKNP;

	// Тут подкорректировать(пересмотреть) рассчет Х, У, Н!!!
	public void calculateOZZVKNP(int xA, int yA, int xB, int yB, int xC,
			int yC, double b1, double b2, double mA, int hA) {
		int dBC, dBA;
		double lBC, lBA, N, M, B, o, y, m, w, lA, lB, lC, pi = 3.14159;
		calculateOGZ(xB, yB, xC, yC, 0, 0);
		dBC = getDovorot();
		lBC = getAlpha();
		System.out.println("dBC = " + dBC);
		System.out.println("lBC = " + lBC);
		calculateOGZ(xB, yB, xA, yA, 0, 0);
		dBA = getDovorot();
		lBA = getAlpha();
		System.out.println("dBA = " + dBA);
		System.out.println("lBA = " + lBA);
		b1 = b1 * 0.10472;
		b2 = b2 * 0.10472;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		N = dBC * Math.sin(b1);
		System.out.println("N = " + N);
		M = dBA * Math.sin(b2);
		System.out.println("M = " + M);
		B = lBA - lBC;
		System.out.println("B = " + B);
		o = Math.atan(M / N);
		System.out.println("o = " + o);
		y = Math.tan(o + pi / 4);
		System.out.println("y = " + y);
		m = (2 * pi - B - b1 - b2) / 2;
		System.out.println("m = " + m);
		w = Math.atan((Math.tan(m)) / y);
		System.out.println("w = " + w);
		lA = w + m + lBA + pi;
		lB = lA + b1;
		lC = lB + b2;
		System.out.println("lA = " + lA);
		System.out.println("lB = " + lB);
		System.out.println("lC = " + lC);
		calculateOZOP(xA, yA, xB, yB, xC, yC, lA, lB, lC, mA, hA, false);
		X_OZZVKNP = get_X_OZOP();
		Y_OZZVKNP = get_Y_OZOP();
		H_OZZVKNP = get_H_OZOP();
		dX_OZZVKNP = get_dX_OZOP();
		dY_OZZVKNP = get_dY_OZOP();
	}

	public int get_X_OZZVKNP() {
		return X_OZZVKNP;
	}

	public int get_Y_OZZVKNP() {
		return Y_OZZVKNP;
	}

	public int get_H_OZZVKNP() {
		return H_OZZVKNP;
	}

	public int get_dX_OZZVKNP() {
		return dX_OZZVKNP;
	}

	public int get_dY_OZZVKNP() {
		return dY_OZZVKNP;
	}

	// -----------------/Обернена засічка за виміряними кутами неорієнтованим
	// приладом/-------------------------/

	// Перерахунок геодезичних координат в повні прямокутні координати та
	// повних прямокутних координат в геодезичні координати
	double a1 = 6367558, a2 = 16036.5, a3 = 16.8, a = 6378245, b = 0.006693422,
			c = 0.006738525;

	@SuppressWarnings("null")
	public void calculateGEODEZ_TO_PRYAM(int X, int Y) {
		int i = 1, Yo, n = 0;
		@SuppressWarnings("unused")
		double B, C, Br, Lo, Lr, Bg, Lg;
		double[] Bo = null;
		Bo[i] = X / a1;
		i++;
		Bo[i] = Bo[i - 1] + a2 / (a1 * Math.sin(2 * Bo[i - 1])) - a3
				/ (a1 * Math.sin(4 * Bo[i - 1]));
		while (!(Math.abs(Bo[i] - Bo[i - 1]) <= 0.00000001)) {
			i++;
			Bo[i] = Bo[i - 1] + a2 / (a1 * Math.sin(2 * Bo[i - 1])) - a3
					/ (a1 * Math.sin(4 * Bo[i - 1]));
		}
		B = Bo[i];
		Yo = Y - 500000; // Обрезать Y до семизначного!?
		C = Yo / (a * Math.sqrt(1 - b * Math.sin(B) * Math.sin(B)));
		Br = B
				- (C * C)
				/ (2 * Math.tan(B) * (1 + b * Math.cos(B) * Math.cos(B)) * (1 - C
						* C
						/ 12
						* ((5 + 3 * Math.tan(B) * Math.tan(B) + +b
								* Math.cos(B) * Math.cos(B) - 9 * c
								* Math.sin(B) * Math.sin(B)) - C
								* C
								/ 30
								* (61 + 90 * Math.tan(B) * Math.tan(B) + 45
										* Math.tan(B) * Math.tan(B)
										* Math.tan(B) * Math.tan(B)))));
		Lo = C
				/ Math.cos(B)
				* (1 - C
						* C
						/ 6
						* ((1 + c * Math.cos(B) * Math.cos(B) + 2 * Math.tan(B)
								* Math.tan(B)) - C
								* C
								/ 20
								* (6 + 25 * Math.tan(B) * Math.tan(B) + 24
										* Math.tan(B) * Math.tan(B)
										* Math.tan(B) * Math.tan(B))));
		Lr = n * Math.PI / 30 - Math.PI / 60 + Lo; // что за n !?
		Bg = Br / Math.PI * 180;
		Lg = Lr / Math.PI * 180;
		// Как переводить их к виду, как просят в алгоритме?!
	}
}
