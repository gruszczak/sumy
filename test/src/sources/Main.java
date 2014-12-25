package sources;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.Icon;
import javax.swing.UIManager;

//dfdsfdsfds
public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_meteoGP_1;
	private JTextField textField_meteoGP_2;
	private JTextField textField_meteoGP_3;
	private JTextField textField_meteoGP_4;
	private JTextField textField_meteoGP_5;
	private JTextField textField_meteoGP_6;
	private JTextField textField_meteoGP_7;
	private JTextField textField_meteoGP_8;
	private JTextField textField_meteoGP_9;
	private JTextField textField_meteoNB_1;
	private JTextField textField_meteoSR_4;
	private JTextField textField_meteoSR_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JLabel label_19;
	private JTextField textField_24;
	private JTextField textField_26;
	private JTextField textField_28;
	private JLabel label_21;
	private JLabel label;
	private JTextField textField_30;
	private JLabel label_1;
	private JTextField textField_31;
	private JLabel label_22;
	private JLabel lbliii;
	private JLabel label_24;
	private JLabel lbli_3;
	private JTextField textField_32;
	private JLabel lbli_2;
	private JLabel lbli_4;
	private JTextField textField_33;
	private JLabel lbli_5;
	private JLabel lblii_1;
	private JTextField textField_34;
	private JLabel label_26;
	private JPanel panel_1;
	private JLabel lbli_6;
	private JTextField textField_35;
	private JTextField textField_36;
	private JLabel label_25;
	private JLabel label_27;
	private JLabel label_28;
	private JTextField textField_37;
	private JTextField textField_25;
	private JTextField textField_27;
	private JTextField textField_29;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JLabel label_49;
	private JLabel label_50;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JLabel label_51;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JLabel label_53;
	private JButton button_1;
	private JButton button_2;
	private JPanel panel_meteoNablyzhBP2;
	private JLabel label_52;
	private JLabel label_54;
	private JTextField KP1;
	private JTextField X1;
	private JTextField Y1;
	private JTextField H1;
	private JLabel label_57;
	private JTextField KP2;
	private JTextField X2;
	private JTextField Y2;
	private JTextField H2;
	private JTextField KP8;
	private JTextField KP3;
	private JTextField X3;
	private JTextField Y3;
	private JTextField H3;
	private JTextField X4;
	private JTextField Y4;
	private JTextField H4;
	private JTextField KP5;
	private JTextField X5;
	private JTextField Y5;
	private JTextField H5;
	private JTextField KP6;
	private JTextField X6;
	private JTextField Y6;
	private JTextField H6;
	private JTextField KP_new_7;
	private JTextField KP7;
	private JTextField X7;
	private JTextField Y7;
	private JTextField H7;
	private JTextField OH;
	private JTextField dV0;
	private JLabel label_69;
	private JTextField Tz;
	private JLabel lblNewLabel;
	private JTextField Xb;
	private JTextField Yb;
	private JTextField hb;
	private JLabel lblX_7;
	private JLabel lblY_7;
	private JLabel lblH_7;
	private JTextField KB;
	private JTextField NB;
	private JLabel label_70;
	private JLabel label_71;
	private JLabel label_72;
	private JLabel label_73;
	private JLabel label_74;
	private JLabel label_75;
	private JLabel lblNewLabel_1;
	private JLabel label_76;
	private JTextField KA;
	private JTextField NA;
	private JTextField KG;
	private JTextField No;
	private JTabbedPane tabbedPane_TOPO;
	private JPanel panel_PGZ;
	private JPanel panel_OGZ;
	private JPanel panel_REVERSE;
	private JPanel panel_MERED;
	private JPanel panel_ZONE;
	private JPanel panel_CONVCOORD;
	private JPanel panel_SUNANGLE;
	private JTextField topo_pgz_Xa;
	private JTextField topo_pgz_Ya;
	private JPanel panel_imagePGZ;
	private JTextField topo_pgz_hA;
	private JTextField topo_pgz_alphaA;
	private JTextField topo_pgz_D;
	private JTextField topo_pgz_mA;
	private JTextField topo_pgz_Xb;
	private JTextField topo_pgz_Yb;
	private JTextField topo_pgz_hB;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private CalculateClass cs;
	private JTextField topo_ogz_alphaA;
	private JTextField topo_ogz_Xa;
	private JTextField topo_ogz_Ya;
	private JTextField topo_ogz_hA;
	private JTextField topo_ogz_mA;
	private JTextField topo_ogz_D;
	private JTextField topo_ogz_hB;
	private JTextField topo_ogz_Yb;
	private JTextField topo_ogz_Xb;
	private JPanel topo_convcoord_input;
	private JLabel lblXa;
	private JTextField topo_convcoord_Xa;
	private JLabel lblYa;
	private JTextField topo_convcoord_Ya;
	private JPanel panel_6;
	private JLabel label_77;
	private JTextField topo_zone_Xa;
	private JLabel label_78;
	private JTextField topo_zone_Ya;
	private JButton topo_zone_buttonCalc;
	private JPanel panel_7;
	private JLabel lblXb_1;
	private JTextField topo_zone_Xb;
	private JLabel lblYb_1;
	private JTextField topo_zone_Yb;
	private JLabel label_84;
	private JLabel label_85;
	private JPanel panel_8;
	private JLabel lblXa_1;
	private JTextField topo_zone_Xa_result;
	private JLabel lblYa_1;
	private JTextField topo_zone_Ya_result;
	private JButton topo_zone_buttonSave;
	private JLabel lblA;
	private JTextField topo_zone_dA_result;
	private JButton topo_convcoord_buttonCalcGEODEZ;
	private JButton topo_convcoord_buttonCalcSQUARE;
	private JLabel label_86;
	private JLabel label_93;
	private JPanel topo_convcoord_output;
	private JLabel label_94;
	private JTextField topo_convcoord_Xa_result;
	private JLabel label_95;
	private JTextField topo_convcoord_Ya_result;
	private JLabel topo_convcoord_input_title;
	private JLabel topo_convcoord_output_title;
	private JLabel label_96;
	private JLabel label_97;
	private JTextField topo_mered_B_grad;
	private JButton button_3;
	private JLabel label_99;
	private JPanel panel_9;
	private JLabel lblXa_2;
	private JTextField topo_mered_gamma_GEOresult;
	private JLabel label_98;
	private JLabel label_102;
	private JTextField topo_mered_B_minute;
	private JTextField topo_mered_B_sec;
	private JLabel lbliB;
	private JLabel lbliL;
	private JTextField topo_mered_L_grad;
	private JTextField topo_mered_L_minute;
	private JTextField topo_mered_L_sec;
	private JPanel panel_4;
	private JPanel panel_10;
	private JLabel label_104;
	private JPanel panel_11;
	private JLabel lblX_8;
	private JTextField topo_mered_gamma_X;
	private JLabel lblY_8;
	private JTextField topo_mered_gamma_Y;
	private JButton button_4;
	private JLabel label_105;
	private JPanel panel_12;
	private JLabel label_106;
	private JTextField topo_mered_gamma_SQUAREresult;
	private JLabel lblii;
	private JLabel label_107;
	private JLabel label_108;
	private JLabel label_109;
	private JLabel lbli_7;
	private JLabel lblii_2;
	private JPanel panel_imageREVERSE;
	private JLabel label_110;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setTitle("Art_Game");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		tabbedPane.addTab("БП", null, panel, null);
		panel.setLayout(null);
		
		label_54 = new JLabel("\u041A\u041E\u041C\u0410\u041D\u0414\u041D\u041E-\u0421\u041F\u041E\u0421\u0422\u0415\u0420\u0415\u0416\u041D\u0406 \u041F\u0423\u041D\u041A\u0422\u0418");
		label_54.setBounds(393, 36, 267, 14);
		label_54.setForeground(Color.RED);
		panel.add(label_54);
		
		label_52 = new JLabel("\u0411\u041E\u0419\u041E\u0412\u0418\u0419 \u041F\u041E\u0420\u042F\u0414\u041E\u041A \u0411\u0410\u0422\u0410\u0420\u0415\u0407");
		label_52.setBounds(405, 11, 182, 14);
		label_52.setForeground(Color.BLACK);
		panel.add(label_52);
		
		JLabel label_55 = new JLabel("\u041A\u0421\u041F \u0413\u0420\u0423\u041F\u0418");
		label_55.setBounds(30, 62, 92, 14);
		panel.add(label_55);
		
		KP1 = new JTextField();
		KP1.setBounds(20, 87, 86, 20);
		panel.add(KP1);
		KP1.setColumns(10);
		
		X1 = new JTextField();
		X1.setBounds(62, 118, 44, 20);
		panel.add(X1);
		X1.setColumns(10);
		
		Y1 = new JTextField();
		Y1.setBounds(62, 145, 44, 20);
		panel.add(Y1);
		Y1.setColumns(10);
		
		H1 = new JTextField();
		H1.setBounds(62, 176, 44, 20);
		panel.add(H1);
		H1.setColumns(10);
		
		JLabel lblX = new JLabel("X = ");
		lblX.setBounds(20, 121, 32, 14);
		panel.add(lblX);
		
		JLabel lblY = new JLabel("Y = ");
		lblY.setBounds(20, 148, 32, 14);
		panel.add(lblY);
		
		JLabel lblH = new JLabel("h = ");
		lblH.setBounds(20, 179, 32, 14);
		panel.add(lblH);
		
		JLabel label_56 = new JLabel("\u0410\u0440\u0442\u0438\u043B\u0435\u0440\u0456\u0439\u0441\u044C\u043A\u0430\r\n");
		label_56.setBounds(22, 232, 124, 20);
		panel.add(label_56);
		
		label_57 = new JLabel("\u0441\u0438\u0441\u0442\u0435\u043C\u0430");
		label_57.setBounds(42, 250, 80, 14);
		panel.add(label_57);
		
		JLabel label_58 = new JLabel("\u041A\u0421\u041F \u0414\u0418\u0412\u0406\u0417\u0406\u041E\u041D\u0423");
		label_58.setBounds(132, 62, 103, 14);
		panel.add(label_58);
		
		KP2 = new JTextField();
		KP2.setBounds(132, 87, 86, 20);
		panel.add(KP2);
		KP2.setColumns(10);
		
		X2 = new JTextField();
		X2.setBounds(174, 118, 44, 20);
		panel.add(X2);
		X2.setColumns(10);
		
		Y2 = new JTextField();
		Y2.setBounds(174, 145, 44, 20);
		panel.add(Y2);
		Y2.setColumns(10);
		
		H2 = new JTextField();
		H2.setBounds(174, 176, 44, 20);
		panel.add(H2);
		H2.setColumns(10);
		
		JLabel lblX_1 = new JLabel("X =");
		lblX_1.setBounds(132, 121, 32, 14);
		panel.add(lblX_1);
		
		JLabel lblY_1 = new JLabel("Y =");
		lblY_1.setBounds(132, 148, 32, 14);
		panel.add(lblY_1);
		
		JLabel lblH_1 = new JLabel("h =");
		lblH_1.setBounds(132, 179, 32, 14);
		panel.add(lblH_1);
		
		JLabel label_59 = new JLabel("\u0428\u0422\u0410\u0411 \u0414\u0418\u0412\u0406\u0417\u0406\u041E\u041D\u0423");
		label_59.setBounds(245, 61, 113, 14);
		panel.add(label_59);
		
		KP8 = new JTextField();
		KP8.setBounds(245, 87, 86, 20);
		panel.add(KP8);
		KP8.setColumns(10);
		
		JLabel label_60 = new JLabel("\u041A\u0421\u0411 \u0411\u0410\u0422\u0410\u0420\u0415\u0407");
		label_60.setBounds(368, 62, 80, 14);
		panel.add(label_60);
		
		KP3 = new JTextField();
		KP3.setBounds(362, 87, 86, 20);
		panel.add(KP3);
		KP3.setColumns(10);
		
		X3 = new JTextField();
		X3.setBounds(405, 118, 44, 20);
		panel.add(X3);
		X3.setColumns(10);
		
		Y3 = new JTextField();
		Y3.setBounds(405, 145, 44, 20);
		panel.add(Y3);
		Y3.setColumns(10);
		
		H3 = new JTextField();
		H3.setBounds(405, 176, 44, 20);
		panel.add(H3);
		H3.setColumns(10);
		
		JLabel lblX_2 = new JLabel("X =");
		lblX_2.setBounds(363, 121, 32, 14);
		panel.add(lblX_2);
		
		JLabel lblY_2 = new JLabel("Y =");
		lblY_2.setBounds(363, 148, 32, 14);
		panel.add(lblY_2);
		
		JLabel lblH_2 = new JLabel("h =");
		lblH_2.setBounds(363, 179, 32, 14);
		panel.add(lblH_2);
		
		JLabel label_61 = new JLabel("\u0411\u0421\u041F");
		label_61.setBounds(511, 62, 46, 14);
		panel.add(label_61);
		
		JTextField KP4 = new JTextField();
		KP4.setBounds(482, 87, 86, 20);
		panel.add(KP4);
		KP4.setColumns(10);
		
		X4 = new JTextField();
		X4.setBounds(524, 118, 44, 20);
		panel.add(X4);
		X4.setColumns(10);
		
		Y4 = new JTextField();
		Y4.setBounds(524, 145, 44, 20);
		panel.add(Y4);
		Y4.setColumns(10);
		
		H4 = new JTextField();
		H4.setBounds(524, 176, 44, 20);
		panel.add(H4);
		H4.setColumns(10);
		
		JLabel lblX_3 = new JLabel("X =");
		lblX_3.setBounds(482, 121, 32, 14);
		panel.add(lblX_3);
		
		JLabel lblY_3 = new JLabel("Y =");
		lblY_3.setBounds(482, 148, 32, 14);
		panel.add(lblY_3);
		
		JLabel lblH_3 = new JLabel("h =");
		lblH_3.setBounds(482, 179, 32, 14);
		panel.add(lblH_3);
		
		JLabel label_62 = new JLabel("\u041F\u0421\u041F");
		label_62.setBounds(614, 62, 46, 14);
		panel.add(label_62);
		
		KP5 = new JTextField();
		KP5.setBounds(598, 87, 86, 20);
		panel.add(KP5);
		KP5.setColumns(10);
		
		X5 = new JTextField();
		X5.setBounds(640, 118, 44, 20);
		panel.add(X5);
		X5.setColumns(10);
		
		Y5 = new JTextField();
		Y5.setBounds(640, 145, 44, 20);
		panel.add(Y5);
		Y5.setColumns(10);
		
		H5 = new JTextField();
		H5.setBounds(640, 176, 44, 20);
		panel.add(H5);
		H5.setColumns(10);
		
		JLabel lblX_4 = new JLabel("X =");
		lblX_4.setBounds(598, 121, 32, 14);
		panel.add(lblX_4);
		
		JLabel lblY_4 = new JLabel("Y =");
		lblY_4.setBounds(598, 148, 32, 14);
		panel.add(lblY_4);
		
		JLabel lblH_4 = new JLabel("h =");
		lblH_4.setBounds(598, 179, 32, 14);
		panel.add(lblH_4);
		
		JLabel label_63 = new JLabel("\u0421\u041D\u0410\u0420");
		label_63.setBounds(733, 62, 46, 14);
		panel.add(label_63);
		
		KP6 = new JTextField();
		KP6.setBounds(712, 87, 86, 20);
		panel.add(KP6);
		KP6.setColumns(10);
		
		X6 = new JTextField();
		X6.setBounds(753, 118, 44, 20);
		panel.add(X6);
		X6.setColumns(10);
		
		Y6 = new JTextField();
		Y6.setBounds(753, 145, 44, 20);
		panel.add(Y6);
		Y6.setColumns(10);
		
		H6 = new JTextField();
		H6.setBounds(753, 176, 44, 20);
		panel.add(H6);
		H6.setColumns(10);
		
		JLabel lblX_5 = new JLabel("X =");
		lblX_5.setBounds(711, 121, 32, 14);
		panel.add(lblX_5);
		
		JLabel lblY_5 = new JLabel("Y =");
		lblY_5.setBounds(711, 148, 32, 14);
		panel.add(lblY_5);
		
		JLabel lblH_5 = new JLabel("h =");
		lblH_5.setBounds(711, 179, 32, 14);
		panel.add(lblH_5);
		
		KP_new_7 = new JTextField();
		KP_new_7.setBounds(809, 59, 118, 20);
		panel.add(KP_new_7);
		KP_new_7.setColumns(10);
		
		KP7 = new JTextField();
		KP7.setBounds(826, 87, 86, 20);
		panel.add(KP7);
		KP7.setColumns(10);
		
		X7 = new JTextField();
		X7.setBounds(867, 118, 44, 20);
		panel.add(X7);
		X7.setColumns(10);
		
		Y7 = new JTextField();
		Y7.setBounds(867, 145, 44, 20);
		panel.add(Y7);
		Y7.setColumns(10);
		
		H7 = new JTextField();
		H7.setBounds(867, 176, 44, 20);
		panel.add(H7);
		H7.setColumns(10);
		
		JLabel lblX_6 = new JLabel("X =");
		lblX_6.setBounds(825, 121, 32, 14);
		panel.add(lblX_6);
		
		JLabel lblY_6 = new JLabel("Y =");
		lblY_6.setBounds(825, 148, 32, 14);
		panel.add(lblY_6);
		
		JLabel lblH_6 = new JLabel("h =");
		lblH_6.setBounds(825, 179, 32, 14);
		panel.add(lblH_6);
		
		JLabel label_64 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C");
		label_64.setBounds(142, 235, 62, 14);
		panel.add(label_64);
		
		JLabel label_65 = new JLabel("\u0431\u0430\u0442\u0430\u0440\u0435\u0439 \u0432 \u0430\u0434\u043D");
		label_65.setBounds(132, 250, 86, 14);
		panel.add(label_65);
		
		JLabel label_66 = new JLabel("\u041F\u043E\u0440\u044F\u0434\u043A\u043E\u0432\u0438\u0439 \u043D\u043E\u043C\u0435\u0440");
		label_66.setBounds(245, 235, 113, 14);
		panel.add(label_66);
		
		JLabel label_67 = new JLabel("\u0431\u0430\u0442\u0430\u0440\u0435\u0457 \u0432 \u0430\u0434\u043D");
		label_67.setBounds(255, 250, 92, 14);
		panel.add(label_67);
		
		JLabel label_68 = new JLabel("\u0412\u041E\u0413\u041D\u0415\u0412\u0410 \u041F\u041E\u0417\u0418\u0426\u0406\u042F \u0411\u0410\u0422\u0410\u0415\u0420\u0415\u0407 (\u0413\u0410\u0420\u041C\u0410\u0422)");
		label_68.setForeground(new Color(255, 0, 0));
		label_68.setBounds(546, 235, 311, 14);
		panel.add(label_68);
		
		OH = new JTextField();
		OH.setColumns(10);
		OH.setBounds(524, 250, 44, 20);
		panel.add(OH);
		
		JLabel lblAoh = new JLabel("aOH =");
		lblAoh.setBounds(482, 253, 44, 14);
		panel.add(lblAoh);
		
		JLabel dV = new JLabel("\u0394V0 \u0441\u0443\u043C =");
		dV.setBounds(578, 253, 64, 14);
		panel.add(dV);
		
		dV0 = new JTextField();
		dV0.setColumns(10);
		dV0.setBounds(640, 250, 44, 20);
		panel.add(dV0);
		
		label_69 = new JLabel("\u0422\u0437 =");
		label_69.setBounds(710, 253, 32, 14);
		panel.add(label_69);
		
		Tz = new JTextField();
		Tz.setColumns(10);
		Tz.setBounds(735, 250, 44, 20);
		panel.add(Tz);
		
		lblNewLabel = new JLabel("\u041A\u043E\u043E\u0440\u0434\u0438\u043D\u0430\u0442\u0438 \u0412\u043E\u0433\u043D\u0435\u0432\u043E\u0457 \u043F\u043E\u0437\u0438\u0446\u0456\u0457 \u0431\u0430\u0442\u0430\u0440\u0435\u0457");
		lblNewLabel.setBounds(546, 281, 220, 14);
		panel.add(lblNewLabel);
		
		Xb = new JTextField();
		Xb.setColumns(10);
		Xb.setBounds(524, 308, 44, 20);
		panel.add(Xb);
		
		Yb = new JTextField();
		Yb.setColumns(10);
		Yb.setBounds(616, 308, 44, 20);
		panel.add(Yb);
		
		hb = new JTextField();
		hb.setColumns(10);
		hb.setBounds(710, 308, 44, 20);
		panel.add(hb);
		
		lblX_7 = new JLabel("X =");
		lblX_7.setBounds(494, 311, 32, 14);
		panel.add(lblX_7);
		
		lblY_7 = new JLabel("Y =");
		lblY_7.setBounds(584, 311, 46, 14);
		panel.add(lblY_7);
		
		lblH_7 = new JLabel("h =");
		lblH_7.setBounds(684, 311, 46, 14);
		panel.add(lblH_7);
		
		KB = new JTextField();
		KB.setColumns(10);
		KB.setBounds(152, 275, 24, 20);
		panel.add(KB);
		
		NB = new JTextField();
		NB.setColumns(10);
		NB.setBounds(277, 275, 24, 20);
		panel.add(NB);
		
		label_70 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C");
		label_70.setBounds(35, 311, 62, 14);
		panel.add(label_70);
		
		label_71 = new JLabel("\u0430\u0434\u043D \u0432 \u0433\u0440\u0443\u043F\u0456");
		label_71.setBounds(33, 327, 64, 14);
		panel.add(label_71);
		
		label_72 = new JLabel("\u041F\u043E\u0440\u044F\u0434\u043A\u043E\u0432\u0438\u0439 \u043D\u043E\u043C\u0435\u0440");
		label_72.setBounds(113, 311, 122, 14);
		panel.add(label_72);
		
		label_73 = new JLabel("\u0430\u0434\u043D \u0432 \u0433\u0440\u0443\u043F\u0456");
		label_73.setBounds(132, 327, 63, 14);
		panel.add(label_73);
		
		label_74 = new JLabel("\u041A\u0456\u043B\u044C\u043A\u0456\u0441\u0442\u044C");
		label_74.setBounds(266, 311, 65, 14);
		panel.add(label_74);
		
		label_75 = new JLabel("\u0433\u0430\u0440\u043C\u0430\u0442 \u0432 \u0431\u0430\u0442\u0430\u0440\u0435\u0457");
		label_75.setBounds(245, 327, 102, 14);
		panel.add(label_75);
		
		lblNewLabel_1 = new JLabel("\u041D\u043E\u043C\u0435\u0440 \u043E\u0441\u043D\u043E\u0432\u043D\u043E\u0457");
		lblNewLabel_1.setBounds(368, 311, 92, 14);
		panel.add(lblNewLabel_1);
		
		label_76 = new JLabel("\u0433\u0430\u0440\u043C\u0430\u0442\u0438");
		label_76.setBounds(390, 327, 46, 14);
		panel.add(label_76);
		
		KA = new JTextField();
		KA.setColumns(10);
		KA.setBounds(55, 347, 24, 20);
		panel.add(KA);
		
		NA = new JTextField();
		NA.setColumns(10);
		NA.setBounds(152, 347, 24, 20);
		panel.add(NA);
		
		KG = new JTextField();
		KG.setColumns(10);
		KG.setBounds(277, 347, 24, 20);
		panel.add(KG);
		
		No = new JTextField();
		No.setColumns(10);
		No.setBounds(400, 347, 24, 20);
		panel.add(No);
		
		JPanel panel_meteo = new JPanel();
		tabbedPane.addTab("Метео", null, panel_meteo, null);
		panel_meteo.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane_meteo = new JTabbedPane(JTabbedPane.LEFT);
		panel_meteo.add(tabbedPane_meteo);
		
		JPanel panel_meteoNablyzh = new JPanel();
		tabbedPane_meteo.addTab("Складання бюлетеня \"Метеонаближений\" з ДМК", null, panel_meteoNablyzh, null);
		panel_meteoNablyzh.setLayout(null);
		
		JButton button_meteoNB = new JButton("\u0417\u0430\u0441\u0442\u043E\u0441\u0443\u0432\u0430\u0442\u0438");
		button_meteoNB.setForeground(new Color(255, 255, 255));
		button_meteoNB.setBackground(new Color(0, 0, 205));
		button_meteoNB.setBounds(300, 720, 125, 39);
		panel_meteoNablyzh.add(button_meteoNB);
		
		JLabel label_23 = new JLabel("\u041C\u0435\u0442\u0435\u043E\u043D\u0430\u0431\u043B\u0438\u0436\u0435\u043D\u0438\u0439");
		label_23.setForeground(Color.BLUE);
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_23.setBounds(10, 11, 300, 14);
		panel_meteoNablyzh.add(label_23);
		
		lbliii = new JLabel("\u0412\u0445i\u0434\u043Di \u0434\u0430\u043Di:");
		lbliii.setForeground(new Color(128, 0, 0));
		lbliii.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbliii.setBounds(144, 59, 95, 14);
		panel_meteoNablyzh.add(lbliii);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u041D\u0430\u0437\u0435\u043C\u043Di \u0434\u0430\u043Di \u0437 \u0414\u041C\u041A:", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 139, 347, 173);
		panel_meteoNablyzh.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{187, 44, 79, 0};
		gbl_panel_1.rowHeights = new int[]{33, 20, 20, 20, 20, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label_meteoNB_2 = new JLabel("\u0410\u0442\u043C\u043E\u0441\u0444\u0435\u0440\u043D\u0438\u0439 \u0442\u0438\u0441\u043A:");
		GridBagConstraints gbc_label_meteoNB_2 = new GridBagConstraints();
		gbc_label_meteoNB_2.anchor = GridBagConstraints.NORTH;
		gbc_label_meteoNB_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_meteoNB_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_meteoNB_2.gridx = 0;
		gbc_label_meteoNB_2.gridy = 1;
		panel_1.add(label_meteoNB_2, gbc_label_meteoNB_2);
		
		textField_meteoNB_1 = new JTextField();
		GridBagConstraints gbc_textField_meteoNB_1 = new GridBagConstraints();
		gbc_textField_meteoNB_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_meteoNB_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_meteoNB_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_meteoNB_1.gridx = 1;
		gbc_textField_meteoNB_1.gridy = 1;
		panel_1.add(textField_meteoNB_1, gbc_textField_meteoNB_1);
		textField_meteoNB_1.setText("000");
		textField_meteoNB_1.setColumns(10);
		
		label_24 = new JLabel("\u043C\u043C.\u0440\u0442.\u0441\u0442.");
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_24.insets = new Insets(0, 0, 5, 5);
		gbc_label_24.gridx = 2;
		gbc_label_24.gridy = 1;
		panel_1.add(label_24, gbc_label_24);
		
		lbli_2 = new JLabel("\u0422\u0435\u043C\u043F\u0435\u0440\u0430\u0442\u0443\u0440\u0430 \u043F\u043E\u0432i\u0442\u0440\u044F:");
		GridBagConstraints gbc_lbli_2 = new GridBagConstraints();
		gbc_lbli_2.anchor = GridBagConstraints.NORTH;
		gbc_lbli_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbli_2.insets = new Insets(0, 0, 5, 5);
		gbc_lbli_2.gridx = 0;
		gbc_lbli_2.gridy = 2;
		panel_1.add(lbli_2, gbc_lbli_2);
		
		textField_32 = new JTextField();
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.anchor = GridBagConstraints.NORTH;
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.gridx = 1;
		gbc_textField_32.gridy = 2;
		panel_1.add(textField_32, gbc_textField_32);
		textField_32.setText("000");
		textField_32.setColumns(10);
		
		lbli_3 = new JLabel("\u0433\u0440\u0430\u0434. \u0426\u0435\u043B\u044C\u0441i\u044F");
		GridBagConstraints gbc_lbli_3 = new GridBagConstraints();
		gbc_lbli_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbli_3.insets = new Insets(0, 0, 5, 5);
		gbc_lbli_3.gridx = 2;
		gbc_lbli_3.gridy = 2;
		panel_1.add(lbli_3, gbc_lbli_3);
		
		lbli_5 = new JLabel("\u041D\u0430\u043F\u0440\u044F\u043C\u043E\u043A \u0441\u0435\u0440\u0435\u0434\u043D\u044C\u043E\u0433\u043E \u0432i\u0442\u0440\u0443");
		GridBagConstraints gbc_lbli_5 = new GridBagConstraints();
		gbc_lbli_5.anchor = GridBagConstraints.NORTH;
		gbc_lbli_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbli_5.insets = new Insets(0, 0, 5, 5);
		gbc_lbli_5.gridx = 0;
		gbc_lbli_5.gridy = 3;
		panel_1.add(lbli_5, gbc_lbli_5);
		
		textField_33 = new JTextField();
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.anchor = GridBagConstraints.NORTH;
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.gridx = 1;
		gbc_textField_33.gridy = 3;
		panel_1.add(textField_33, gbc_textField_33);
		textField_33.setText("000");
		textField_33.setColumns(10);
		
		lbli_4 = new JLabel("\u0432\u0435\u043B\u0438\u043Ai \u043F.\u043A.");
		GridBagConstraints gbc_lbli_4 = new GridBagConstraints();
		gbc_lbli_4.anchor = GridBagConstraints.WEST;
		gbc_lbli_4.insets = new Insets(0, 0, 5, 5);
		gbc_lbli_4.gridx = 2;
		gbc_lbli_4.gridy = 3;
		panel_1.add(lbli_4, gbc_lbli_4);
		
		lblii_1 = new JLabel("\u0428\u0432\u0438\u0434\u043Ai\u0441\u0442\u044C \u0441\u0435\u0440\u0435\u0434\u043D\u044C\u043E\u0433\u043E \u0432i\u0442\u0440\u0443");
		GridBagConstraints gbc_lblii_1 = new GridBagConstraints();
		gbc_lblii_1.anchor = GridBagConstraints.NORTH;
		gbc_lblii_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblii_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblii_1.gridx = 0;
		gbc_lblii_1.gridy = 4;
		panel_1.add(lblii_1, gbc_lblii_1);
		
		textField_34 = new JTextField();
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.anchor = GridBagConstraints.NORTH;
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.insets = new Insets(0, 0, 5, 5);
		gbc_textField_34.gridx = 1;
		gbc_textField_34.gridy = 4;
		panel_1.add(textField_34, gbc_textField_34);
		textField_34.setText("000");
		textField_34.setColumns(10);
		
		label_26 = new JLabel("\u043C/\u0441");
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_26.gridx = 2;
		gbc_label_26.gridy = 4;
		panel_1.add(label_26, gbc_label_26);
		
		lbli_6 = new JLabel("\u0427\u0438\u0441\u043B\u043E \u043Ci\u0441\u044F\u0446\u044F:");
		lbli_6.setBounds(10, 102, 83, 14);
		panel_meteoNablyzh.add(lbli_6);
		
		textField_35 = new JTextField();
		textField_35.setText("00");
		textField_35.setColumns(10);
		textField_35.setBounds(95, 99, 39, 20);
		panel_meteoNablyzh.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setText("00");
		textField_36.setColumns(10);
		textField_36.setBounds(252, 99, 39, 20);
		panel_meteoNablyzh.add(textField_36);
		
		label_25 = new JLabel("\u0427\u0430\u0441 \u0437\u043D\u044F\u0442\u0442\u044F \u0434\u0430\u043D\u0438\u0445:");
		label_25.setBounds(144, 102, 110, 14);
		panel_meteoNablyzh.add(label_25);
		
		label_27 = new JLabel("\u0433\u043E\u0434\u0438\u043D");
		label_27.setBounds(300, 102, 44, 14);
		panel_meteoNablyzh.add(label_27);
		
		label_28 = new JLabel("\u0445\u0432\u0438\u043B\u0438\u043D");
		label_28.setBounds(392, 102, 44, 14);
		panel_meteoNablyzh.add(label_28);
		
		textField_37 = new JTextField();
		textField_37.setText("0");
		textField_37.setColumns(10);
		textField_37.setBounds(354, 99, 28, 20);
		panel_meteoNablyzh.add(textField_37);
		
		JButton button = new JButton("\u0421\u043A\u043B\u0430\u0441\u0442\u0438 \u0431\u044E\u043B\u0435\u0442\u0435\u043D\u044C");
		button.setBackground(new Color(0, 0, 205));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(125, 323, 151, 39);
		panel_meteoNablyzh.add(button);
		
		JLabel label_29 = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		label_29.setForeground(new Color(128, 0, 0));
		label_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_29.setBounds(159, 386, 95, 14);
		panel_meteoNablyzh.add(label_29);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 407, 347, 287);
		panel_meteoNablyzh.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label_46 = new JLabel("-");
		label_46.setBounds(281, 14, 12, 14);
		panel_5.add(label_46);
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField_25 = new JTextField();
		textField_25.setBounds(233, 11, 44, 20);
		panel_5.add(textField_25);
		textField_25.setText("00000");
		textField_25.setColumns(10);
		
		JLabel label_47 = new JLabel("-");
		label_47.setBounds(219, 14, 12, 14);
		panel_5.add(label_47);
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField_63 = new JTextField();
		textField_63.setBounds(170, 11, 44, 20);
		panel_5.add(textField_63);
		textField_63.setText("0000");
		textField_63.setColumns(10);
		
		JLabel label_48 = new JLabel("-");
		label_48.setBounds(156, 14, 12, 14);
		panel_5.add(label_48);
		label_48.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField_64 = new JTextField();
		textField_64.setBounds(108, 11, 44, 20);
		panel_5.add(textField_64);
		textField_64.setText("00000");
		textField_64.setColumns(10);
		
		JLabel label_18 = new JLabel("\u041C\u0435\u0442\u0435\u043E");
		label_18.setBounds(68, 14, 37, 14);
		panel_5.add(label_18);
		
		JLabel label_20 = new JLabel("- 02 -");
		label_20.setBounds(78, 39, 37, 20);
		panel_5.add(label_20);
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_27 = new JTextField();
		textField_27.setBounds(120, 41, 50, 20);
		panel_5.add(textField_27);
		textField_27.setText("00");
		textField_27.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(175, 41, 50, 20);
		panel_5.add(textField_29);
		textField_29.setText("00");
		textField_29.setColumns(10);
		
		textField_38 = new JTextField();
		textField_38.setBounds(229, 41, 50, 20);
		panel_5.add(textField_38);
		textField_38.setText("00");
		textField_38.setColumns(10);
		
		JLabel label_30 = new JLabel("-");
		label_30.setBounds(289, 45, 12, 14);
		panel_5.add(label_30);
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_31 = new JLabel("-");
		label_31.setBounds(289, 71, 12, 14);
		panel_5.add(label_31);
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField_39 = new JTextField();
		textField_39.setBounds(229, 67, 50, 20);
		panel_5.add(textField_39);
		textField_39.setText("00");
		textField_39.setColumns(10);
		
		textField_40 = new JTextField();
		textField_40.setBounds(175, 67, 50, 20);
		panel_5.add(textField_40);
		textField_40.setText("00");
		textField_40.setColumns(10);
		
		textField_41 = new JTextField();
		textField_41.setBounds(120, 67, 50, 20);
		panel_5.add(textField_41);
		textField_41.setText("00");
		textField_41.setColumns(10);
		
		JLabel label_32 = new JLabel("- 04 -");
		label_32.setBounds(78, 65, 37, 20);
		panel_5.add(label_32);
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_33 = new JLabel("-");
		label_33.setBounds(289, 123, 12, 14);
		panel_5.add(label_33);
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField_42 = new JTextField();
		textField_42.setBounds(229, 119, 50, 20);
		panel_5.add(textField_42);
		textField_42.setText("00");
		textField_42.setColumns(10);
		
		textField_43 = new JTextField();
		textField_43.setBounds(175, 119, 50, 20);
		panel_5.add(textField_43);
		textField_43.setText("00");
		textField_43.setColumns(10);
		
		textField_44 = new JTextField();
		textField_44.setBounds(120, 119, 50, 20);
		panel_5.add(textField_44);
		textField_44.setText("00");
		textField_44.setColumns(10);
		
		JLabel label_34 = new JLabel("- 12 -");
		label_34.setBounds(78, 117, 37, 20);
		panel_5.add(label_34);
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_35 = new JLabel("- 08 -");
		label_35.setBounds(78, 91, 37, 20);
		panel_5.add(label_35);
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_45 = new JTextField();
		textField_45.setBounds(120, 93, 50, 20);
		panel_5.add(textField_45);
		textField_45.setText("00");
		textField_45.setColumns(10);
		
		textField_46 = new JTextField();
		textField_46.setBounds(175, 93, 50, 20);
		panel_5.add(textField_46);
		textField_46.setText("00");
		textField_46.setColumns(10);
		
		textField_47 = new JTextField();
		textField_47.setBounds(229, 93, 50, 20);
		panel_5.add(textField_47);
		textField_47.setText("00");
		textField_47.setColumns(10);
		
		JLabel label_36 = new JLabel("-");
		label_36.setBounds(289, 97, 12, 14);
		panel_5.add(label_36);
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_37 = new JLabel("- 16 -");
		label_37.setBounds(78, 143, 37, 20);
		panel_5.add(label_37);
		label_37.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_48 = new JTextField();
		textField_48.setBounds(120, 145, 50, 20);
		panel_5.add(textField_48);
		textField_48.setText("00");
		textField_48.setColumns(10);
		
		textField_49 = new JTextField();
		textField_49.setBounds(175, 145, 50, 20);
		panel_5.add(textField_49);
		textField_49.setText("00");
		textField_49.setColumns(10);
		
		textField_50 = new JTextField();
		textField_50.setBounds(229, 145, 50, 20);
		panel_5.add(textField_50);
		textField_50.setText("00");
		textField_50.setColumns(10);
		
		JLabel label_38 = new JLabel("-");
		label_38.setBounds(289, 149, 12, 14);
		panel_5.add(label_38);
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_39 = new JLabel("-");
		label_39.setBounds(289, 175, 12, 14);
		panel_5.add(label_39);
		label_39.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_40 = new JLabel("-");
		label_40.setBounds(289, 201, 12, 14);
		panel_5.add(label_40);
		label_40.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_41 = new JLabel("-");
		label_41.setBounds(289, 227, 12, 14);
		panel_5.add(label_41);
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField_51 = new JTextField();
		textField_51.setBounds(229, 223, 50, 20);
		panel_5.add(textField_51);
		textField_51.setText("00");
		textField_51.setColumns(10);
		
		textField_52 = new JTextField();
		textField_52.setBounds(229, 197, 50, 20);
		panel_5.add(textField_52);
		textField_52.setText("00");
		textField_52.setColumns(10);
		
		textField_53 = new JTextField();
		textField_53.setBounds(229, 171, 50, 20);
		panel_5.add(textField_53);
		textField_53.setText("00");
		textField_53.setColumns(10);
		
		textField_54 = new JTextField();
		textField_54.setBounds(175, 171, 50, 20);
		panel_5.add(textField_54);
		textField_54.setText("00");
		textField_54.setColumns(10);
		
		textField_55 = new JTextField();
		textField_55.setBounds(175, 197, 50, 20);
		panel_5.add(textField_55);
		textField_55.setText("00");
		textField_55.setColumns(10);
		
		textField_56 = new JTextField();
		textField_56.setBounds(175, 223, 50, 20);
		panel_5.add(textField_56);
		textField_56.setText("00");
		textField_56.setColumns(10);
		
		textField_57 = new JTextField();
		textField_57.setBounds(120, 223, 50, 20);
		panel_5.add(textField_57);
		textField_57.setText("00");
		textField_57.setColumns(10);
		
		textField_58 = new JTextField();
		textField_58.setBounds(120, 197, 50, 20);
		panel_5.add(textField_58);
		textField_58.setText("00");
		textField_58.setColumns(10);
		
		textField_59 = new JTextField();
		textField_59.setBounds(120, 171, 50, 20);
		panel_5.add(textField_59);
		textField_59.setText("00");
		textField_59.setColumns(10);
		
		JLabel label_42 = new JLabel("- 20 -");
		label_42.setBounds(78, 169, 37, 20);
		panel_5.add(label_42);
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_43 = new JLabel("- 24 -");
		label_43.setBounds(78, 195, 37, 20);
		panel_5.add(label_43);
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_44 = new JLabel("- 30 -");
		label_44.setBounds(78, 221, 37, 20);
		panel_5.add(label_44);
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_45 = new JLabel("- 40 -");
		label_45.setBounds(78, 249, 37, 20);
		panel_5.add(label_45);
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_60 = new JTextField();
		textField_60.setBounds(120, 251, 50, 20);
		panel_5.add(textField_60);
		textField_60.setText("00");
		textField_60.setColumns(10);
		
		textField_61 = new JTextField();
		textField_61.setBounds(175, 251, 50, 20);
		panel_5.add(textField_61);
		textField_61.setText("00");
		textField_61.setColumns(10);
		
		textField_62 = new JTextField();
		textField_62.setBounds(229, 251, 50, 20);
		panel_5.add(textField_62);
		textField_62.setText("00");
		textField_62.setColumns(10);
		
		panel_meteoNablyzhBP2 = new JPanel();
		tabbedPane_meteo.addTab("Складання бюлетеня \"Метеонаближений\" з ВР-2", null, panel_meteoNablyzhBP2, null);
		
		JPanel panel_meteoSered = new JPanel();
		tabbedPane_meteo.addTab("Введення \"Метеосереднiй\"", null, panel_meteoSered, null);
		panel_meteoSered.setLayout(null);
		
		JLabel label_meteoSR_1 = new JLabel("\u041C\u0435\u0442\u0435\u043E");
		label_meteoSR_1.setBounds(10, 53, 37, 14);
		panel_meteoSered.add(label_meteoSR_1);
		
		textField_meteoSR_4 = new JTextField();
		textField_meteoSR_4.setText("00000");
		textField_meteoSR_4.setColumns(10);
		textField_meteoSR_4.setBounds(237, 50, 50, 20);
		panel_meteoSered.add(textField_meteoSR_4);
		
		textField_meteoSR_3 = new JTextField();
		textField_meteoSR_3.setText("00000");
		textField_meteoSR_3.setColumns(10);
		textField_meteoSR_3.setBounds(175, 50, 44, 20);
		panel_meteoSered.add(textField_meteoSR_3);
		
		JLabel label_2 = new JLabel("- 02 -");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(86, 79, 37, 20);
		panel_meteoSered.add(label_2);
		
		textField = new JTextField();
		textField.setText("00");
		textField.setColumns(10);
		textField.setBounds(128, 81, 50, 20);
		panel_meteoSered.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("00");
		textField_1.setColumns(10);
		textField_1.setBounds(183, 81, 50, 20);
		panel_meteoSered.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("00");
		textField_2.setColumns(10);
		textField_2.setBounds(237, 81, 50, 20);
		panel_meteoSered.add(textField_2);
		
		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_3.setBounds(297, 85, 12, 14);
		panel_meteoSered.add(label_3);
		
		JLabel label_4 = new JLabel("-");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_4.setBounds(297, 111, 12, 14);
		panel_meteoSered.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setText("00");
		textField_3.setColumns(10);
		textField_3.setBounds(237, 107, 50, 20);
		panel_meteoSered.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("00");
		textField_4.setColumns(10);
		textField_4.setBounds(183, 107, 50, 20);
		panel_meteoSered.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("00");
		textField_5.setColumns(10);
		textField_5.setBounds(128, 107, 50, 20);
		panel_meteoSered.add(textField_5);
		
		JLabel label_5 = new JLabel("- 04 -");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(86, 105, 37, 20);
		panel_meteoSered.add(label_5);
		
		JLabel label_6 = new JLabel("-");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_6.setBounds(297, 163, 12, 14);
		panel_meteoSered.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setText("00");
		textField_6.setColumns(10);
		textField_6.setBounds(237, 159, 50, 20);
		panel_meteoSered.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("00");
		textField_7.setColumns(10);
		textField_7.setBounds(183, 159, 50, 20);
		panel_meteoSered.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("00");
		textField_8.setColumns(10);
		textField_8.setBounds(128, 159, 50, 20);
		panel_meteoSered.add(textField_8);
		
		JLabel label_7 = new JLabel("- 12 -");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(86, 157, 37, 20);
		panel_meteoSered.add(label_7);
		
		JLabel label_8 = new JLabel("- 08 -");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(86, 131, 37, 20);
		panel_meteoSered.add(label_8);
		
		textField_9 = new JTextField();
		textField_9.setText("00");
		textField_9.setColumns(10);
		textField_9.setBounds(128, 133, 50, 20);
		panel_meteoSered.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("00");
		textField_10.setColumns(10);
		textField_10.setBounds(183, 133, 50, 20);
		panel_meteoSered.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("00");
		textField_11.setColumns(10);
		textField_11.setBounds(237, 133, 50, 20);
		panel_meteoSered.add(textField_11);
		
		JLabel label_9 = new JLabel("-");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_9.setBounds(297, 137, 12, 14);
		panel_meteoSered.add(label_9);
		
		JLabel label_10 = new JLabel("- 16 -");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(86, 183, 37, 20);
		panel_meteoSered.add(label_10);
		
		textField_12 = new JTextField();
		textField_12.setText("00");
		textField_12.setColumns(10);
		textField_12.setBounds(128, 185, 50, 20);
		panel_meteoSered.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("00");
		textField_13.setColumns(10);
		textField_13.setBounds(183, 185, 50, 20);
		panel_meteoSered.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("00");
		textField_14.setColumns(10);
		textField_14.setBounds(237, 185, 50, 20);
		panel_meteoSered.add(textField_14);
		
		JLabel label_11 = new JLabel("-");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_11.setBounds(297, 189, 12, 14);
		panel_meteoSered.add(label_11);
		
		JLabel label_12 = new JLabel("-");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_12.setBounds(297, 215, 12, 14);
		panel_meteoSered.add(label_12);
		
		JLabel label_13 = new JLabel("-");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_13.setBounds(297, 241, 12, 14);
		panel_meteoSered.add(label_13);
		
		JLabel label_14 = new JLabel("-");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_14.setBounds(297, 267, 12, 14);
		panel_meteoSered.add(label_14);
		
		textField_15 = new JTextField();
		textField_15.setText("00");
		textField_15.setColumns(10);
		textField_15.setBounds(237, 263, 50, 20);
		panel_meteoSered.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("00");
		textField_16.setColumns(10);
		textField_16.setBounds(237, 237, 50, 20);
		panel_meteoSered.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("00");
		textField_17.setColumns(10);
		textField_17.setBounds(237, 211, 50, 20);
		panel_meteoSered.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("00");
		textField_18.setColumns(10);
		textField_18.setBounds(183, 211, 50, 20);
		panel_meteoSered.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("00");
		textField_19.setColumns(10);
		textField_19.setBounds(183, 237, 50, 20);
		panel_meteoSered.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("00");
		textField_20.setColumns(10);
		textField_20.setBounds(183, 263, 50, 20);
		panel_meteoSered.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText("00");
		textField_21.setColumns(10);
		textField_21.setBounds(128, 263, 50, 20);
		panel_meteoSered.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText("00");
		textField_22.setColumns(10);
		textField_22.setBounds(128, 237, 50, 20);
		panel_meteoSered.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("00");
		textField_23.setColumns(10);
		textField_23.setBounds(128, 211, 50, 20);
		panel_meteoSered.add(textField_23);
		
		JLabel label_15 = new JLabel("- 20 -");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_15.setBounds(86, 209, 37, 20);
		panel_meteoSered.add(label_15);
		
		JLabel label_16 = new JLabel("- 24 -");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_16.setBounds(86, 235, 37, 20);
		panel_meteoSered.add(label_16);
		
		JLabel label_17 = new JLabel("- 30 -");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_17.setBounds(86, 261, 37, 20);
		panel_meteoSered.add(label_17);
		
		label_19 = new JLabel("- 40 -");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_19.setBounds(86, 289, 37, 20);
		panel_meteoSered.add(label_19);
		
		textField_24 = new JTextField();
		textField_24.setText("00");
		textField_24.setColumns(10);
		textField_24.setBounds(128, 291, 50, 20);
		panel_meteoSered.add(textField_24);
		
		textField_26 = new JTextField();
		textField_26.setText("00");
		textField_26.setColumns(10);
		textField_26.setBounds(183, 291, 50, 20);
		panel_meteoSered.add(textField_26);
		
		textField_28 = new JTextField();
		textField_28.setText("00");
		textField_28.setColumns(10);
		textField_28.setBounds(237, 291, 50, 20);
		panel_meteoSered.add(textField_28);
		
		label_21 = new JLabel("-");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_21.setBounds(297, 53, 12, 14);
		panel_meteoSered.add(label_21);
		
		label = new JLabel("-");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(223, 53, 12, 14);
		panel_meteoSered.add(label);
		
		textField_30 = new JTextField();
		textField_30.setText("0000");
		textField_30.setColumns(10);
		textField_30.setBounds(112, 50, 44, 20);
		panel_meteoSered.add(textField_30);
		
		label_1 = new JLabel("-");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_1.setBounds(161, 53, 12, 14);
		panel_meteoSered.add(label_1);
		
		textField_31 = new JTextField();
		textField_31.setText("00000");
		textField_31.setColumns(10);
		textField_31.setBounds(50, 50, 44, 20);
		panel_meteoSered.add(textField_31);
		
		label_22 = new JLabel("-");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_22.setBounds(98, 53, 12, 14);
		panel_meteoSered.add(label_22);
		
		JLabel lbli_1 = new JLabel("\u041C\u0435\u0442\u0435\u043E\u0441\u0435\u0440\u0435\u0434\u043Di\u0439");
		lbli_1.setForeground(Color.BLUE);
		lbli_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbli_1.setBounds(10, 11, 300, 14);
		panel_meteoSered.add(lbli_1);
		
		label_49 = new JLabel("-");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_49.setBounds(297, 294, 12, 14);
		panel_meteoSered.add(label_49);
		
		label_50 = new JLabel("-");
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_50.setBounds(297, 323, 12, 14);
		panel_meteoSered.add(label_50);
		
		textField_65 = new JTextField();
		textField_65.setText("00");
		textField_65.setColumns(10);
		textField_65.setBounds(237, 320, 50, 20);
		panel_meteoSered.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setText("00");
		textField_66.setColumns(10);
		textField_66.setBounds(183, 320, 50, 20);
		panel_meteoSered.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setText("00");
		textField_67.setColumns(10);
		textField_67.setBounds(128, 320, 50, 20);
		panel_meteoSered.add(textField_67);
		
		label_51 = new JLabel("- 50 -");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_51.setBounds(86, 318, 37, 20);
		panel_meteoSered.add(label_51);
		
		textField_68 = new JTextField();
		textField_68.setText("00");
		textField_68.setColumns(10);
		textField_68.setBounds(237, 350, 50, 20);
		panel_meteoSered.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setText("00");
		textField_69.setColumns(10);
		textField_69.setBounds(183, 350, 50, 20);
		panel_meteoSered.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setText("00");
		textField_70.setColumns(10);
		textField_70.setBounds(128, 350, 50, 20);
		panel_meteoSered.add(textField_70);
		
		label_53 = new JLabel("- 60 -");
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_53.setBounds(86, 348, 37, 20);
		panel_meteoSered.add(label_53);
		
		button_2 = new JButton("\u0417\u0430\u0441\u0442\u043E\u0441\u0443\u0432\u0430\u0442\u0438");
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(new Color(0, 0, 205));
		button_2.setBounds(300, 400, 125, 39);
		panel_meteoSered.add(button_2);
		
		JPanel panel_meteoPopravky = new JPanel();
		tabbedPane_meteo.addTab("Введення готових поправок", null, panel_meteoPopravky, null);
		panel_meteoPopravky.setLayout(null);
		
		textField_meteoGP_1 = new JTextField();
		textField_meteoGP_1.setBackground(Color.YELLOW);
		textField_meteoGP_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_meteoGP_1.setText("5");
		textField_meteoGP_1.setColumns(10);
		textField_meteoGP_1.setBounds(67, 55, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_1);
		
		JLabel label_meteoGP_1 = new JLabel("d");
		label_meteoGP_1.setBounds(10, 58, 45, 14);
		panel_meteoPopravky.add(label_meteoGP_1);
		
		textField_meteoGP_2 = new JTextField();
		textField_meteoGP_2.setBackground(Color.YELLOW);
		textField_meteoGP_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_meteoGP_2.setText("8");
		textField_meteoGP_2.setColumns(10);
		textField_meteoGP_2.setBounds(153, 55, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_2);
		
		textField_meteoGP_3 = new JTextField();
		textField_meteoGP_3.setBackground(Color.YELLOW);
		textField_meteoGP_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_meteoGP_3.setText("11");
		textField_meteoGP_3.setColumns(10);
		textField_meteoGP_3.setBounds(239, 55, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_3);
		
		JLabel label_meteoGP_2 = new JLabel("\u0394 d");
		label_meteoGP_2.setBounds(10, 86, 45, 14);
		panel_meteoPopravky.add(label_meteoGP_2);
		
		textField_meteoGP_4 = new JTextField();
		textField_meteoGP_4.setColumns(10);
		textField_meteoGP_4.setBounds(67, 83, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_4);
		
		textField_meteoGP_5 = new JTextField();
		textField_meteoGP_5.setColumns(10);
		textField_meteoGP_5.setBounds(153, 83, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_5);
		
		textField_meteoGP_6 = new JTextField();
		textField_meteoGP_6.setColumns(10);
		textField_meteoGP_6.setBounds(239, 83, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_6);
		
		JLabel label_meteoGP_3 = new JLabel("\u0394 \u03C3");
		label_meteoGP_3.setBounds(10, 114, 45, 14);
		panel_meteoPopravky.add(label_meteoGP_3);
		
		textField_meteoGP_7 = new JTextField();
		textField_meteoGP_7.setColumns(10);
		textField_meteoGP_7.setBounds(67, 111, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_7);
		
		textField_meteoGP_8 = new JTextField();
		textField_meteoGP_8.setColumns(10);
		textField_meteoGP_8.setBounds(153, 111, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_8);
		
		textField_meteoGP_9 = new JTextField();
		textField_meteoGP_9.setColumns(10);
		textField_meteoGP_9.setBounds(239, 111, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_9);
		
		JLabel lbli = new JLabel("\u0413\u043E\u0442\u043E\u0432i \u043F\u043E\u043F\u0440\u0430\u0432\u043A\u0438");
		lbli.setForeground(Color.BLUE);
		lbli.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbli.setBounds(10, 11, 300, 14);
		panel_meteoPopravky.add(lbli);
		
		button_1 = new JButton("\u0417\u0430\u0441\u0442\u043E\u0441\u0443\u0432\u0430\u0442\u0438");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 0, 205));
		button_1.setBounds(300, 160, 125, 39);
		panel_meteoPopravky.add(button_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("ПП", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Пристрiлка", null, panel_3, null);
		
		JPanel panel_TOPO = new JPanel();
		tabbedPane.addTab("ТОПО задачi", null, panel_TOPO, null);
		panel_TOPO.setLayout(new GridLayout(0, 1, 0, 0));
		
		tabbedPane_TOPO = new JTabbedPane(JTabbedPane.LEFT);
		panel_TOPO.add(tabbedPane_TOPO);
		
		Image myPicture = null;
		myPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/pgz.png"));
		
		Image myPicture1 = null;
		myPicture1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/zasichku.png"));
		
		panel_PGZ = new JPanel();
		tabbedPane_TOPO.addTab("Пряма геодезична задача", null, panel_PGZ, null);
		panel_PGZ.setLayout(null);
		
		final JPopupMenu topo_pgz_popupMenu = new JPopupMenu();
		topo_pgz_popupMenu.setSize(39, 25);
		topo_pgz_popupMenu.setLocation(0, 0);
		addPopup(panel_PGZ, topo_pgz_popupMenu);
		
		JButton pgz_pop_Button1 = new JButton("\u041A\u0421\u041F \u0413\u0420\u0423\u041F\u0418");
		buttonGroup.add(pgz_pop_Button1);
		topo_pgz_popupMenu.add(pgz_pop_Button1);
		
		JButton pgz_pop_Button2 = new JButton("\u041A\u0421\u041F \u0414\u0418\u0412I\u0417I\u041E\u041D\u0423");
		buttonGroup.add(pgz_pop_Button2);
		topo_pgz_popupMenu.add(pgz_pop_Button2);
		
		JButton pgz_pop_Button3 = new JButton("\u041A\u0421\u041F \u0411\u0410\u0422\u0410\u0420\u0415I");
		buttonGroup.add(pgz_pop_Button3);
		topo_pgz_popupMenu.add(pgz_pop_Button3);
		
		JButton pgz_pop_Button4 = new JButton("\u0411\u0421\u041F");
		buttonGroup.add(pgz_pop_Button4);
		topo_pgz_popupMenu.add(pgz_pop_Button4);
		
		JButton pgz_pop_Button5 = new JButton("\u041F\u0421\u041F");
		buttonGroup.add(pgz_pop_Button5);
		topo_pgz_popupMenu.add(pgz_pop_Button5);
		
		JButton pgz_pop_Button6 = new JButton("\u0421\u041D\u0410\u0420");
		buttonGroup.add(pgz_pop_Button6);
		topo_pgz_popupMenu.add(pgz_pop_Button6);
		
		JButton pgz_pop_Button7 = new JButton("\u0412\u041E\u0413\u041D\u0415\u0412\u0410 \u041F\u041E\u0417\u0418\u0426I\u042F");
		buttonGroup.add(pgz_pop_Button7);
		topo_pgz_popupMenu.add(pgz_pop_Button7);
		
		JLabel topo_pgz_labelCaption = new JLabel("\u041F\u0440\u044F\u043C\u0430 \u0433\u0435\u043E\u0434\u0435\u0437\u0438\u0447\u043D\u0430 \u0437\u0430\u0434\u0430\u0447\u0430");
		topo_pgz_labelCaption.setForeground(Color.BLUE);
		topo_pgz_labelCaption.setFont(new Font("Tahoma", Font.PLAIN, 14));
		topo_pgz_labelCaption.setBounds(10, 11, 300, 14);
		panel_PGZ.add(topo_pgz_labelCaption);
		
		JLabel topo_pgz_lbl3 = new JLabel("\u0412\u0445i\u0434\u043Di \u0434\u0430\u043Di:");
		topo_pgz_lbl3.setForeground(new Color(128, 0, 0));
		topo_pgz_lbl3.setFont(new Font("Tahoma", Font.BOLD, 14));
		topo_pgz_lbl3.setBounds(444, 28, 95, 14);
		panel_PGZ.add(topo_pgz_lbl3);
		
		JLabel label_topo_pgz_Xa = new JLabel("Xa=");
		label_topo_pgz_Xa.setBounds(339, 101, 28, 14);
		panel_PGZ.add(label_topo_pgz_Xa);
		
		topo_pgz_Xa = new JTextField();
		topo_pgz_Xa.setText("0");
		topo_pgz_Xa.setColumns(10);
		topo_pgz_Xa.setBounds(369, 98, 39, 20);
		panel_PGZ.add(topo_pgz_Xa);
		
		JLabel label_topo_pgz_Ya = new JLabel("Ya=");
		label_topo_pgz_Ya.setBounds(426, 101, 28, 14);
		panel_PGZ.add(label_topo_pgz_Ya);
		
		topo_pgz_Ya = new JTextField();
		topo_pgz_Ya.setText("0");
		topo_pgz_Ya.setColumns(10);
		topo_pgz_Ya.setBounds(453, 98, 39, 20);
		panel_PGZ.add(topo_pgz_Ya);
		
		JButton topo_pgz_buttonCalc = new JButton("\u041E\u0431\u0447\u0438\u0441\u043B\u0438\u0442\u0438");
		topo_pgz_buttonCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cs = new CalculateClass();
				int xA, yA, hA, xB, yB, hB;
				double alpha, dovorot, mestoCeli;
				xA =Integer.valueOf(topo_pgz_Xa.getText());
				yA =Integer.valueOf(topo_pgz_Ya.getText());
				hA =Integer.valueOf(topo_pgz_hA.getText());
				alpha = Double.valueOf(topo_pgz_alphaA.getText());
				dovorot = Double.valueOf(topo_pgz_D.getText());
				mestoCeli = Double.valueOf(topo_pgz_mA.getText());
				cs.calculatePGZ(xA, yA, hA, alpha, dovorot, mestoCeli);
				xB = (int) cs.get_xB();
				yB = (int) cs.get_yB();
				hB = (int) cs.get_hB();
				topo_pgz_Xb.setText(String.valueOf(xB));
				topo_pgz_Yb.setText(String.valueOf(yB));
				topo_pgz_hB.setText(String.valueOf(hB));
			}
		});
		topo_pgz_buttonCalc.setForeground(Color.WHITE);
		topo_pgz_buttonCalc.setBackground(new Color(0, 0, 205));
		topo_pgz_buttonCalc.setBounds(426, 225, 151, 39);
		panel_PGZ.add(topo_pgz_buttonCalc);
		
		JLabel topo_pgz_lbl4 = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		topo_pgz_lbl4.setForeground(new Color(128, 0, 0));
		topo_pgz_lbl4.setFont(new Font("Tahoma", Font.BOLD, 14));
		topo_pgz_lbl4.setBounds(444, 293, 95, 14);
		panel_PGZ.add(topo_pgz_lbl4);
		
		panel_imagePGZ = new JPanel();
		panel_imagePGZ.setBorder(new LineBorder(Color.GRAY, 2));
		panel_imagePGZ.setBounds(10, 54, 300, 321);
		panel_PGZ.add(panel_imagePGZ);
		panel_imagePGZ.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel lblPgzimage = new JLabel(new ImageIcon(myPicture));
		panel_imagePGZ.add(lblPgzimage);
		lblPgzimage.setText("");
		lblPgzimage.setBackground(Color.WHITE);
		
		
		JLabel label_topo_pgz_hA = new JLabel("hA=");
		label_topo_pgz_hA.setBounds(513, 101, 28, 14);
		panel_PGZ.add(label_topo_pgz_hA);
		
		topo_pgz_hA = new JTextField();
		topo_pgz_hA.setText("0");
		topo_pgz_hA.setColumns(10);
		topo_pgz_hA.setBounds(542, 98, 39, 20);
		panel_PGZ.add(topo_pgz_hA);
		
		JLabel topo_pgz_lbl1 = new JLabel("\u041A\u043E\u043E\u0440\u0434\u0438\u043D\u0430\u0442\u0438 \u0442\u043E\u0447\u043A\u0438 \u0410:");
		topo_pgz_lbl1.setForeground(Color.BLUE);
		topo_pgz_lbl1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		topo_pgz_lbl1.setBounds(339, 73, 300, 14);
		panel_PGZ.add(topo_pgz_lbl1);
		
		JLabel topo_pgz_lbl2 = new JLabel("\u041F\u043E\u043B\u044F\u0440\u043Di \u043A\u043E\u043E\u0440\u0434\u0438\u043D\u0430\u0442\u0438 \u0442\u043E\u0447\u043A\u0438 B:");
		topo_pgz_lbl2.setForeground(Color.BLUE);
		topo_pgz_lbl2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		topo_pgz_lbl2.setBounds(339, 147, 300, 14);
		panel_PGZ.add(topo_pgz_lbl2);
		
		JLabel label_topo_pgz_alphaA = new JLabel("alpha A=");
		label_topo_pgz_alphaA.setBounds(339, 175, 69, 14);
		panel_PGZ.add(label_topo_pgz_alphaA);
		
		topo_pgz_alphaA = new JTextField();
		topo_pgz_alphaA.setText("0");
		topo_pgz_alphaA.setColumns(10);
		topo_pgz_alphaA.setBounds(397, 172, 39, 20);
		panel_PGZ.add(topo_pgz_alphaA);
		
		topo_pgz_D = new JTextField();
		topo_pgz_D.setText("0");
		topo_pgz_D.setColumns(10);
		topo_pgz_D.setBounds(478, 172, 39, 20);
		panel_PGZ.add(topo_pgz_D);
		
		JLabel label_topo_pgz_D = new JLabel("\u0414=");
		label_topo_pgz_D.setBounds(453, 175, 28, 14);
		panel_PGZ.add(label_topo_pgz_D);
		
		JLabel lblMa = new JLabel("mA=");
		lblMa.setBounds(527, 175, 39, 14);
		panel_PGZ.add(lblMa);
		
		topo_pgz_mA = new JTextField();
		topo_pgz_mA.setText("0");
		topo_pgz_mA.setColumns(10);
		topo_pgz_mA.setBounds(557, 172, 39, 20);
		panel_PGZ.add(topo_pgz_mA);
		
		JLabel topo_pgz_lbl5 = new JLabel("\u041A\u043E\u043E\u0440\u0434\u0438\u043D\u0430\u0442\u0438 \u0442\u043E\u0447\u043A\u0438 B:");
		topo_pgz_lbl5.setForeground(Color.BLUE);
		topo_pgz_lbl5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		topo_pgz_lbl5.setBounds(339, 330, 300, 14);
		panel_PGZ.add(topo_pgz_lbl5);
		
		JLabel lblXb = new JLabel("Xb=");
		lblXb.setBounds(339, 358, 28, 14);
		panel_PGZ.add(lblXb);
		
		topo_pgz_Xb = new JTextField();
		topo_pgz_Xb.setText("0");
		topo_pgz_Xb.setColumns(10);
		topo_pgz_Xb.setBounds(369, 355, 39, 20);
		panel_PGZ.add(topo_pgz_Xb);
		
		JLabel lblYb = new JLabel("Yb=");
		lblYb.setBounds(426, 358, 28, 14);
		panel_PGZ.add(lblYb);
		
		topo_pgz_Yb = new JTextField();
		topo_pgz_Yb.setText("0");
		topo_pgz_Yb.setColumns(10);
		topo_pgz_Yb.setBounds(453, 355, 39, 20);
		panel_PGZ.add(topo_pgz_Yb);
		
		JLabel lblHb = new JLabel("hB=");
		lblHb.setBounds(513, 358, 28, 14);
		panel_PGZ.add(lblHb);
		
		topo_pgz_hB = new JTextField();
		topo_pgz_hB.setText("0");
		topo_pgz_hB.setColumns(10);
		topo_pgz_hB.setBounds(542, 355, 39, 20);
		panel_PGZ.add(topo_pgz_hB);
		
		final JButton topo_pgz_buttonSave = new JButton("\u0417\u0431\u0435\u0440\u0435\u0433\u0442\u0438 \u0440\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442");
		topo_pgz_buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				topo_pgz_popupMenu.show(panel_PGZ, topo_pgz_buttonSave.getX(), topo_pgz_buttonSave.getY()+40);
			}
		});
		topo_pgz_buttonSave.setForeground(Color.WHITE);
		topo_pgz_buttonSave.setBackground(new Color(0, 0, 205));
		topo_pgz_buttonSave.setBounds(426, 408, 151, 39);
		panel_PGZ.add(topo_pgz_buttonSave);
		
		panel_OGZ = new JPanel();
		tabbedPane_TOPO.addTab("Обернена геодезична задача", null, panel_OGZ, null);
		panel_OGZ.setLayout(null);
		
		JLabel topo_ogz_labelCaption = new JLabel("\u041E\u0431\u0435\u0440\u043D\u0435\u043D\u0430 \u0433\u0435\u043E\u0434\u0435\u0437\u0438\u0447\u043D\u0430 \u0437\u0430\u0434\u0430\u0447\u0430");
		topo_ogz_labelCaption.setForeground(Color.BLUE);
		topo_ogz_labelCaption.setFont(new Font("Tahoma", Font.PLAIN, 14));
		topo_ogz_labelCaption.setBounds(10, 11, 300, 14);
		panel_OGZ.add(topo_ogz_labelCaption);
		
		JLabel label_79 = new JLabel("\u0412\u0445i\u0434\u043Di \u0434\u0430\u043Di:");
		label_79.setForeground(new Color(128, 0, 0));
		label_79.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_79.setBounds(444, 28, 95, 14);
		panel_OGZ.add(label_79);
		
		JLabel label_80 = new JLabel("\u041A\u043E\u043E\u0440\u0434\u0438\u043D\u0430\u0442\u0438 \u0442\u043E\u0447\u043A\u0438 \u0410:");
		label_80.setForeground(Color.BLUE);
		label_80.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_80.setBounds(339, 73, 300, 14);
		panel_OGZ.add(label_80);
		
		JLabel label_81 = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		label_81.setForeground(new Color(128, 0, 0));
		label_81.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_81.setBounds(444, 293, 95, 14);
		panel_OGZ.add(label_81);
		
		JLabel label_82 = new JLabel("\u041F\u043E\u043B\u044F\u0440\u043Di \u043A\u043E\u043E\u0440\u0434\u0438\u043D\u0430\u0442\u0438 \u0442\u043E\u0447\u043A\u0438 B:");
		label_82.setForeground(Color.BLUE);
		label_82.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_82.setBounds(339, 328, 300, 14);
		panel_OGZ.add(label_82);
		
		JLabel label_83 = new JLabel("alpha A=");
		label_83.setBounds(339, 356, 69, 14);
		panel_OGZ.add(label_83);
		
		topo_ogz_alphaA = new JTextField();
		topo_ogz_alphaA.setText("0");
		topo_ogz_alphaA.setColumns(10);
		topo_ogz_alphaA.setBounds(397, 353, 39, 20);
		panel_OGZ.add(topo_ogz_alphaA);
		
		topo_ogz_Xa = new JTextField();
		topo_ogz_Xa.setText("0");
		topo_ogz_Xa.setColumns(10);
		topo_ogz_Xa.setBounds(369, 98, 39, 20);
		panel_OGZ.add(topo_ogz_Xa);
		
		JLabel label_topo_ogz_Xa = new JLabel("Xa=");
		label_topo_ogz_Xa.setBounds(339, 101, 28, 14);
		panel_OGZ.add(label_topo_ogz_Xa);
		
		JLabel label_topo_ogz_Ya = new JLabel("Ya=");
		label_topo_ogz_Ya.setBounds(426, 101, 28, 14);
		panel_OGZ.add(label_topo_ogz_Ya);
		
		topo_ogz_Ya = new JTextField();
		topo_ogz_Ya.setText("0");
		topo_ogz_Ya.setColumns(10);
		topo_ogz_Ya.setBounds(453, 98, 39, 20);
		panel_OGZ.add(topo_ogz_Ya);
		
		JLabel label_topo_ogz_hA = new JLabel("hA=");
		label_topo_ogz_hA.setBounds(513, 101, 28, 14);
		panel_OGZ.add(label_topo_ogz_hA);
		
		topo_ogz_hA = new JTextField();
		topo_ogz_hA.setText("0");
		topo_ogz_hA.setColumns(10);
		topo_ogz_hA.setBounds(542, 98, 39, 20);
		panel_OGZ.add(topo_ogz_hA);
		
		topo_ogz_mA = new JTextField();
		topo_ogz_mA.setText("0");
		topo_ogz_mA.setColumns(10);
		topo_ogz_mA.setBounds(557, 353, 39, 20);
		panel_OGZ.add(topo_ogz_mA);
		
		JLabel label_87 = new JLabel("mA=");
		label_87.setBounds(527, 356, 39, 14);
		panel_OGZ.add(label_87);
		
		topo_ogz_D = new JTextField();
		topo_ogz_D.setText("0");
		topo_ogz_D.setColumns(10);
		topo_ogz_D.setBounds(478, 353, 39, 20);
		panel_OGZ.add(topo_ogz_D);
		
		JLabel label_88 = new JLabel("\u0414=");
		label_88.setBounds(453, 356, 28, 14);
		panel_OGZ.add(label_88);
		
		JButton topo_ogz_buttonCalc = new JButton("\u041E\u0431\u0447\u0438\u0441\u043B\u0438\u0442\u0438");
		topo_ogz_buttonCalc.setForeground(Color.WHITE);
		topo_ogz_buttonCalc.setBackground(new Color(0, 0, 205));
		topo_ogz_buttonCalc.setBounds(426, 225, 151, 39);
		panel_OGZ.add(topo_ogz_buttonCalc);
		
		topo_ogz_hB = new JTextField();
		topo_ogz_hB.setText("0");
		topo_ogz_hB.setColumns(10);
		topo_ogz_hB.setBounds(542, 169, 39, 20);
		panel_OGZ.add(topo_ogz_hB);
		
		JLabel label_89 = new JLabel("hB=");
		label_89.setBounds(513, 172, 28, 14);
		panel_OGZ.add(label_89);
		
		topo_ogz_Yb = new JTextField();
		topo_ogz_Yb.setText("0");
		topo_ogz_Yb.setColumns(10);
		topo_ogz_Yb.setBounds(453, 169, 39, 20);
		panel_OGZ.add(topo_ogz_Yb);
		
		JLabel label_90 = new JLabel("Yb=");
		label_90.setBounds(426, 172, 28, 14);
		panel_OGZ.add(label_90);
		
		JLabel label_91 = new JLabel("\u041A\u043E\u043E\u0440\u0434\u0438\u043D\u0430\u0442\u0438 \u0442\u043E\u0447\u043A\u0438 B:");
		label_91.setForeground(Color.BLUE);
		label_91.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_91.setBounds(339, 144, 300, 14);
		panel_OGZ.add(label_91);
		
		topo_ogz_Xb = new JTextField();
		topo_ogz_Xb.setText("0");
		topo_ogz_Xb.setColumns(10);
		topo_ogz_Xb.setBounds(369, 169, 39, 20);
		panel_OGZ.add(topo_ogz_Xb);
		
		JLabel label_92 = new JLabel("Xb=");
		label_92.setBounds(339, 172, 28, 14);
		panel_OGZ.add(label_92);
		
		JButton topo_ogz_buttonSave = new JButton("\u0417\u0431\u0435\u0440\u0435\u0433\u0442\u0438 \u0440\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442");
		topo_ogz_buttonSave.setForeground(Color.WHITE);
		topo_ogz_buttonSave.setBackground(new Color(0, 0, 205));
		topo_ogz_buttonSave.setBounds(426, 408, 151, 39);
		panel_OGZ.add(topo_ogz_buttonSave);
		
		JPanel panel_imageOGZ = new JPanel();
		panel_imageOGZ.setBorder(new LineBorder(Color.GRAY, 2));
		panel_imageOGZ.setBounds(10, 54, 300, 321);
		panel_OGZ.add(panel_imageOGZ);
		panel_imageOGZ.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblOgzimage = new JLabel(new ImageIcon(myPicture));
		lblOgzimage.setText("");
		lblOgzimage.setBackground(Color.WHITE);
		panel_imageOGZ.add(lblOgzimage);
		
		panel_REVERSE = new JPanel();
		tabbedPane_TOPO.addTab("Оберненi засiчки", null, panel_REVERSE, null);
		panel_REVERSE.setLayout(null);
		
		lblii_2 = new JLabel("\u041E\u0431\u0435\u0440\u043D\u0435\u043Di \u0437\u0430\u0441i\u0447\u043A\u0438");
		lblii_2.setForeground(Color.BLUE);
		lblii_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblii_2.setBounds(10, 11, 188, 14);
		panel_REVERSE.add(lblii_2);
		
		panel_imageREVERSE = new JPanel();
		panel_imageREVERSE.setBorder(new LineBorder(Color.GRAY, 2));
		panel_imageREVERSE.setBounds(10, 49, 300, 321);
		panel_REVERSE.add(panel_imageREVERSE);
		panel_imageREVERSE.setLayout(new GridLayout(0, 1, 0, 0));
		
		label_110 = new JLabel(new ImageIcon(myPicture1));
		label_110.setText("");
		label_110.setBackground(Color.WHITE);
		panel_imageREVERSE.add(label_110);
		
		panel_MERED = new JPanel();
		tabbedPane_TOPO.addTab("Визначення зближення мередiанiв", null, panel_MERED, null);
		panel_MERED.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		panel_MERED.add(tabbedPane_1);
		
		panel_4 = new JPanel();
		tabbedPane_1.addTab("По географ. координатам", null, panel_4, null);
		panel_4.setLayout(null);
		
		label_96 = new JLabel("\u0412\u0445i\u0434\u043Di \u0434\u0430\u043Di:");
		label_96.setBounds(95, 34, 95, 14);
		panel_4.add(label_96);
		label_96.setForeground(new Color(128, 0, 0));
		label_96.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		button_3 = new JButton("\u041E\u0431\u0447\u0438\u0441\u043B\u0438\u0442\u0438");
		button_3.setBounds(76, 255, 114, 39);
		panel_4.add(button_3);
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(new Color(0, 0, 205));
		
		label_99 = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		label_99.setBounds(94, 319, 95, 14);
		panel_4.add(label_99);
		label_99.setForeground(new Color(128, 0, 0));
		label_99.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		panel_9 = new JPanel();
		panel_9.setBounds(49, 344, 160, 48);
		panel_4.add(panel_9);
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0417\u0431\u043B\u0438\u0436\u0435\u043D\u043D\u044F \u043C\u0435\u0440\u0438\u0434i\u0430\u043Di\u0432", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.rowHeights = new int[] {10};
		gbl_panel_9.columnWidths = new int[] {20, 20};
		gbl_panel_9.columnWeights = new double[]{0.0, 0.0};
		gbl_panel_9.rowWeights = new double[]{0.0};
		panel_9.setLayout(gbl_panel_9);
		
		lblXa_2 = new JLabel("\u03B3");
		GridBagConstraints gbc_lblXa_2 = new GridBagConstraints();
		gbc_lblXa_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblXa_2.gridx = 0;
		gbc_lblXa_2.gridy = 0;
		panel_9.add(lblXa_2, gbc_lblXa_2);
		
		topo_mered_gamma_GEOresult = new JTextField();
		topo_mered_gamma_GEOresult.setText("0");
		topo_mered_gamma_GEOresult.setColumns(10);
		GridBagConstraints gbc_topo_mered_gamma_GEOresult = new GridBagConstraints();
		gbc_topo_mered_gamma_GEOresult.insets = new Insets(0, 0, 5, 5);
		gbc_topo_mered_gamma_GEOresult.gridx = 1;
		gbc_topo_mered_gamma_GEOresult.gridy = 0;
		panel_9.add(topo_mered_gamma_GEOresult, gbc_topo_mered_gamma_GEOresult);
		
		label_97 = new JLabel("\u0433\u0440\u0430\u0434.");
		label_97.setBounds(28, 95, 46, 14);
		panel_4.add(label_97);
		label_97.setHorizontalAlignment(SwingConstants.CENTER);
		
		topo_mered_B_grad = new JTextField();
		topo_mered_B_grad.setBounds(28, 114, 57, 20);
		panel_4.add(topo_mered_B_grad);
		topo_mered_B_grad.setText("00");
		topo_mered_B_grad.setColumns(10);
		
		label_98 = new JLabel("\u0445\u0432");
		label_98.setBounds(117, 95, 28, 14);
		panel_4.add(label_98);
		
		topo_mered_B_minute = new JTextField();
		topo_mered_B_minute.setBounds(99, 114, 57, 20);
		panel_4.add(topo_mered_B_minute);
		topo_mered_B_minute.setText("00");
		topo_mered_B_minute.setColumns(10);
		
		label_102 = new JLabel("\u0441\u0435\u043A");
		label_102.setBounds(182, 95, 28, 14);
		panel_4.add(label_102);
		
		topo_mered_B_sec = new JTextField();
		topo_mered_B_sec.setBounds(166, 114, 57, 20);
		panel_4.add(topo_mered_B_sec);
		topo_mered_B_sec.setText("00");
		topo_mered_B_sec.setColumns(10);
		
		lbliB = new JLabel("\u0413\u0435\u043E\u0433\u0440\u0430\u0444i\u0447\u043D\u0430 \u0448\u0438\u0440\u043E\u0442\u0430 B");
		lbliB.setBounds(10, 70, 226, 14);
		panel_4.add(lbliB);
		
		lbliL = new JLabel("\u0413\u0435\u043E\u0433\u0440\u0430\u0444i\u0447\u043D\u0430 \u0434\u043E\u0432\u0433\u043E\u0442\u0430 L");
		lbliL.setBounds(10, 162, 226, 14);
		panel_4.add(lbliL);
		
		JLabel label_100 = new JLabel("\u0433\u0440\u0430\u0434.");
		label_100.setBounds(28, 187, 46, 14);
		panel_4.add(label_100);
		label_100.setHorizontalAlignment(SwingConstants.CENTER);
		
		topo_mered_L_grad = new JTextField();
		topo_mered_L_grad.setBounds(28, 206, 57, 20);
		panel_4.add(topo_mered_L_grad);
		topo_mered_L_grad.setText("00");
		topo_mered_L_grad.setColumns(10);
		
		JLabel label_101 = new JLabel("\u0445\u0432");
		label_101.setBounds(117, 187, 28, 14);
		panel_4.add(label_101);
		
		topo_mered_L_minute = new JTextField();
		topo_mered_L_minute.setBounds(99, 206, 57, 20);
		panel_4.add(topo_mered_L_minute);
		topo_mered_L_minute.setText("00");
		topo_mered_L_minute.setColumns(10);
		
		JLabel label_103 = new JLabel("\u0441\u0435\u043A");
		label_103.setBounds(182, 187, 28, 14);
		panel_4.add(label_103);
		
		topo_mered_L_sec = new JTextField();
		topo_mered_L_sec.setBounds(166, 206, 57, 20);
		panel_4.add(topo_mered_L_sec);
		topo_mered_L_sec.setText("00");
		topo_mered_L_sec.setColumns(10);
		
		label_107 = new JLabel("\u0412\u0438\u0437\u043D\u0430\u0447\u0435\u043D\u043D\u044F \u0437\u0431\u043B\u0438\u0436\u0435\u043D\u043D\u044F \u043C\u0435\u0440\u0435\u0434i\u0430\u043Di\u0432");
		label_107.setForeground(Color.BLUE);
		label_107.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_107.setBounds(10, 11, 300, 14);
		panel_4.add(label_107);
		
		panel_10 = new JPanel();
		tabbedPane_1.addTab("По повним прямокут. координатам", null, panel_10, null);
		panel_10.setLayout(null);
		
		label_104 = new JLabel("\u0412\u0445i\u0434\u043Di \u0434\u0430\u043Di:");
		label_104.setForeground(new Color(128, 0, 0));
		label_104.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_104.setBounds(94, 35, 95, 14);
		panel_10.add(label_104);
		
		panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u041F\u0440\u044F\u043C\u043E\u043A\u0443\u0442\u043Di \u043A\u043E\u043E\u0440\u0434\u0438\u043D\u0430\u0442\u0438 \u0442\u043E\u0447\u043A\u0438", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_11.setBounds(36, 71, 193, 108);
		panel_10.add(panel_11);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[] {50, 50};
		gbl_panel_11.rowHeights = new int[] {30, 30};
		gbl_panel_11.columnWeights = new double[]{0.0, 0.0};
		gbl_panel_11.rowWeights = new double[]{0.0, 0.0, 0.0};
		panel_11.setLayout(gbl_panel_11);
		
		lblX_8 = new JLabel("X");
		GridBagConstraints gbc_lblX_8 = new GridBagConstraints();
		gbc_lblX_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblX_8.gridx = 0;
		gbc_lblX_8.gridy = 1;
		panel_11.add(lblX_8, gbc_lblX_8);
		
		topo_mered_gamma_X = new JTextField();
		topo_mered_gamma_X.setText("0000000");
		topo_mered_gamma_X.setColumns(10);
		GridBagConstraints gbc_topo_mered_gamma_X = new GridBagConstraints();
		gbc_topo_mered_gamma_X.insets = new Insets(0, 0, 5, 5);
		gbc_topo_mered_gamma_X.gridx = 1;
		gbc_topo_mered_gamma_X.gridy = 1;
		panel_11.add(topo_mered_gamma_X, gbc_topo_mered_gamma_X);
		
		lblY_8 = new JLabel("Y");
		GridBagConstraints gbc_lblY_8 = new GridBagConstraints();
		gbc_lblY_8.insets = new Insets(0, 0, 0, 5);
		gbc_lblY_8.gridx = 0;
		gbc_lblY_8.gridy = 2;
		panel_11.add(lblY_8, gbc_lblY_8);
		
		topo_mered_gamma_Y = new JTextField();
		topo_mered_gamma_Y.setText("0000000");
		topo_mered_gamma_Y.setColumns(10);
		GridBagConstraints gbc_topo_mered_gamma_Y = new GridBagConstraints();
		gbc_topo_mered_gamma_Y.insets = new Insets(0, 0, 5, 5);
		gbc_topo_mered_gamma_Y.gridx = 1;
		gbc_topo_mered_gamma_Y.gridy = 2;
		panel_11.add(topo_mered_gamma_Y, gbc_topo_mered_gamma_Y);
		
		button_4 = new JButton("\u041E\u0431\u0447\u0438\u0441\u043B\u0438\u0442\u0438");
		button_4.setForeground(Color.WHITE);
		button_4.setBackground(new Color(0, 0, 205));
		button_4.setBounds(75, 213, 114, 39);
		panel_10.add(button_4);
		
		label_105 = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		label_105.setForeground(new Color(128, 0, 0));
		label_105.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_105.setBounds(94, 279, 95, 14);
		panel_10.add(label_105);
		
		panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0417\u0431\u043B\u0438\u0436\u0435\u043D\u043D\u044F \u043C\u0435\u0440\u0438\u0434i\u0430\u043Di\u0432", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_12.setBounds(52, 305, 160, 48);
		panel_10.add(panel_12);
		GridBagLayout gbl_panel_12 = new GridBagLayout();
		gbl_panel_12.columnWidths = new int[]{20, 20, 0};
		gbl_panel_12.rowHeights = new int[]{10, 0};
		gbl_panel_12.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_12.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_12.setLayout(gbl_panel_12);
		
		label_106 = new JLabel("\u03B3");
		GridBagConstraints gbc_label_106 = new GridBagConstraints();
		gbc_label_106.insets = new Insets(0, 0, 0, 5);
		gbc_label_106.gridx = 0;
		gbc_label_106.gridy = 0;
		panel_12.add(label_106, gbc_label_106);
		
		topo_mered_gamma_SQUAREresult = new JTextField();
		topo_mered_gamma_SQUAREresult.setText("0");
		topo_mered_gamma_SQUAREresult.setColumns(10);
		GridBagConstraints gbc_topo_mered_gamma_SQUAREresult = new GridBagConstraints();
		gbc_topo_mered_gamma_SQUAREresult.insets = new Insets(0, 0, 5, 5);
		gbc_topo_mered_gamma_SQUAREresult.gridx = 1;
		gbc_topo_mered_gamma_SQUAREresult.gridy = 0;
		panel_12.add(topo_mered_gamma_SQUAREresult, gbc_topo_mered_gamma_SQUAREresult);
		
		lblii = new JLabel("\u0412\u0438\u0437\u043D\u0430\u0447\u0435\u043D\u043D\u044F \u0437\u0431\u043B\u0438\u0436\u0435\u043D\u043D\u044F \u043C\u0435\u0440\u0435\u0434i\u0430\u043Di\u0432");
		lblii.setForeground(Color.BLUE);
		lblii.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblii.setBounds(10, 11, 300, 14);
		panel_10.add(lblii);
		
		panel_ZONE = new JPanel();
		tabbedPane_TOPO.addTab("Перетворення координат в iншу зону", null, panel_ZONE, null);
		panel_ZONE.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0412\u041F", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 64, 153, 113);
		panel_ZONE.add(panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[] {50, 50};
		gbl_panel_6.rowHeights = new int[] {30, 30, 30};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0};
		panel_6.setLayout(gbl_panel_6);
		
		label_77 = new JLabel("Xa");
		GridBagConstraints gbc_label_77 = new GridBagConstraints();
		gbc_label_77.anchor = GridBagConstraints.NORTH;
		gbc_label_77.insets = new Insets(0, 0, 5, 5);
		gbc_label_77.gridx = 0;
		gbc_label_77.gridy = 1;
		panel_6.add(label_77, gbc_label_77);
		
		topo_zone_Xa = new JTextField();
		topo_zone_Xa.setText("000");
		topo_zone_Xa.setColumns(10);
		GridBagConstraints gbc_topo_zone_Xa = new GridBagConstraints();
		gbc_topo_zone_Xa.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_zone_Xa.anchor = GridBagConstraints.NORTH;
		gbc_topo_zone_Xa.insets = new Insets(0, 0, 5, 5);
		gbc_topo_zone_Xa.gridx = 1;
		gbc_topo_zone_Xa.gridy = 1;
		panel_6.add(topo_zone_Xa, gbc_topo_zone_Xa);
		
		label_78 = new JLabel("Ya");
		GridBagConstraints gbc_label_78 = new GridBagConstraints();
		gbc_label_78.anchor = GridBagConstraints.NORTH;
		gbc_label_78.insets = new Insets(0, 0, 5, 5);
		gbc_label_78.gridx = 0;
		gbc_label_78.gridy = 2;
		panel_6.add(label_78, gbc_label_78);
		
		topo_zone_Ya = new JTextField();
		topo_zone_Ya.setText("000");
		topo_zone_Ya.setColumns(10);
		GridBagConstraints gbc_topo_zone_Ya = new GridBagConstraints();
		gbc_topo_zone_Ya.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_zone_Ya.anchor = GridBagConstraints.NORTH;
		gbc_topo_zone_Ya.insets = new Insets(0, 0, 5, 5);
		gbc_topo_zone_Ya.gridx = 1;
		gbc_topo_zone_Ya.gridy = 2;
		panel_6.add(topo_zone_Ya, gbc_topo_zone_Ya);
		
		topo_zone_buttonCalc = new JButton("\u041E\u0431\u0447\u0438\u0441\u043B\u0438\u0442\u0438");
		topo_zone_buttonCalc.setForeground(Color.WHITE);
		topo_zone_buttonCalc.setBackground(new Color(0, 0, 205));
		topo_zone_buttonCalc.setBounds(96, 188, 151, 39);
		panel_ZONE.add(topo_zone_buttonCalc);
		
		panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0426i\u043B\u044C", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_7.setBounds(173, 64, 153, 113);
		panel_ZONE.add(panel_7);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[] {50, 50};
		gbl_panel_7.rowHeights = new int[] {30, 30, 30};
		gbl_panel_7.columnWeights = new double[]{0.0, 0.0};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0};
		panel_7.setLayout(gbl_panel_7);
		
		lblXb_1 = new JLabel("Xb");
		GridBagConstraints gbc_lblXb_1 = new GridBagConstraints();
		gbc_lblXb_1.anchor = GridBagConstraints.NORTH;
		gbc_lblXb_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblXb_1.gridx = 0;
		gbc_lblXb_1.gridy = 1;
		panel_7.add(lblXb_1, gbc_lblXb_1);
		
		topo_zone_Xb = new JTextField();
		topo_zone_Xb.setText("000");
		topo_zone_Xb.setColumns(10);
		GridBagConstraints gbc_topo_zone_Xb = new GridBagConstraints();
		gbc_topo_zone_Xb.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_zone_Xb.anchor = GridBagConstraints.NORTH;
		gbc_topo_zone_Xb.insets = new Insets(0, 0, 5, 5);
		gbc_topo_zone_Xb.gridx = 1;
		gbc_topo_zone_Xb.gridy = 1;
		panel_7.add(topo_zone_Xb, gbc_topo_zone_Xb);
		
		lblYb_1 = new JLabel("Yb");
		GridBagConstraints gbc_lblYb_1 = new GridBagConstraints();
		gbc_lblYb_1.anchor = GridBagConstraints.NORTH;
		gbc_lblYb_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblYb_1.gridx = 0;
		gbc_lblYb_1.gridy = 2;
		panel_7.add(lblYb_1, gbc_lblYb_1);
		
		topo_zone_Yb = new JTextField();
		topo_zone_Yb.setText("000");
		topo_zone_Yb.setColumns(10);
		GridBagConstraints gbc_topo_zone_Yb = new GridBagConstraints();
		gbc_topo_zone_Yb.insets = new Insets(0, 0, 5, 5);
		gbc_topo_zone_Yb.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_zone_Yb.anchor = GridBagConstraints.NORTH;
		gbc_topo_zone_Yb.gridx = 1;
		gbc_topo_zone_Yb.gridy = 2;
		panel_7.add(topo_zone_Yb, gbc_topo_zone_Yb);
		
		label_84 = new JLabel("\u0412\u0445i\u0434\u043Di \u0434\u0430\u043Di:");
		label_84.setForeground(new Color(128, 0, 0));
		label_84.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_84.setBounds(119, 39, 95, 14);
		panel_ZONE.add(label_84);
		
		label_85 = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		label_85.setForeground(new Color(128, 0, 0));
		label_85.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_85.setBounds(130, 257, 95, 14);
		panel_ZONE.add(label_85);
		
		panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0412\u041F", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_8.setBounds(96, 282, 153, 143);
		panel_ZONE.add(panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{50, 50, 0};
		gbl_panel_8.rowHeights = new int[] {30, 30, 30, 30};
		gbl_panel_8.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		panel_8.setLayout(gbl_panel_8);
		
		lblXa_1 = new JLabel("Xa'");
		GridBagConstraints gbc_lblXa_1 = new GridBagConstraints();
		gbc_lblXa_1.anchor = GridBagConstraints.NORTH;
		gbc_lblXa_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblXa_1.gridx = 0;
		gbc_lblXa_1.gridy = 1;
		panel_8.add(lblXa_1, gbc_lblXa_1);
		
		topo_zone_Xa_result = new JTextField();
		topo_zone_Xa_result.setText("000");
		topo_zone_Xa_result.setColumns(10);
		GridBagConstraints gbc_topo_zone_Xa_result = new GridBagConstraints();
		gbc_topo_zone_Xa_result.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_zone_Xa_result.anchor = GridBagConstraints.NORTH;
		gbc_topo_zone_Xa_result.insets = new Insets(0, 0, 5, 5);
		gbc_topo_zone_Xa_result.gridx = 1;
		gbc_topo_zone_Xa_result.gridy = 1;
		panel_8.add(topo_zone_Xa_result, gbc_topo_zone_Xa_result);
		
		lblYa_1 = new JLabel("Ya'");
		GridBagConstraints gbc_lblYa_1 = new GridBagConstraints();
		gbc_lblYa_1.anchor = GridBagConstraints.NORTH;
		gbc_lblYa_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblYa_1.gridx = 0;
		gbc_lblYa_1.gridy = 2;
		panel_8.add(lblYa_1, gbc_lblYa_1);
		
		topo_zone_Ya_result = new JTextField();
		topo_zone_Ya_result.setText("000");
		topo_zone_Ya_result.setColumns(10);
		GridBagConstraints gbc_topo_zone_Ya_result = new GridBagConstraints();
		gbc_topo_zone_Ya_result.insets = new Insets(0, 0, 5, 5);
		gbc_topo_zone_Ya_result.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_zone_Ya_result.anchor = GridBagConstraints.NORTH;
		gbc_topo_zone_Ya_result.gridx = 1;
		gbc_topo_zone_Ya_result.gridy = 2;
		panel_8.add(topo_zone_Ya_result, gbc_topo_zone_Ya_result);
		
		lblA = new JLabel("\u0394a");
		GridBagConstraints gbc_lblA = new GridBagConstraints();
		gbc_lblA.insets = new Insets(0, 0, 5, 5);
		gbc_lblA.gridx = 0;
		gbc_lblA.gridy = 3;
		panel_8.add(lblA, gbc_lblA);
		
		topo_zone_dA_result = new JTextField();
		topo_zone_dA_result.setText("0-00");
		topo_zone_dA_result.setColumns(10);
		GridBagConstraints gbc_topo_zone_dA_result = new GridBagConstraints();
		gbc_topo_zone_dA_result.insets = new Insets(0, 0, 5, 5);
		gbc_topo_zone_dA_result.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_zone_dA_result.gridx = 1;
		gbc_topo_zone_dA_result.gridy = 3;
		panel_8.add(topo_zone_dA_result, gbc_topo_zone_dA_result);
		
		topo_zone_buttonSave = new JButton("\u0417\u0431\u0435\u0440\u0435\u0433\u0442\u0438 \u0440\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442");
		topo_zone_buttonSave.setForeground(Color.WHITE);
		topo_zone_buttonSave.setBackground(new Color(0, 0, 205));
		topo_zone_buttonSave.setBounds(96, 449, 151, 39);
		panel_ZONE.add(topo_zone_buttonSave);
		
		label_108 = new JLabel("\u041F\u0435\u0440\u0435\u0442\u0432\u043E\u0440\u0435\u043D\u043D\u044F \u043A\u043E\u043E\u0440\u0434\u0438\u043D\u0430\u0442 \u0432 i\u043D\u0448\u0443 \u0437\u043E\u043D\u0443");
		label_108.setForeground(Color.BLUE);
		label_108.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_108.setBounds(10, 14, 300, 14);
		panel_ZONE.add(label_108);
		
		panel_CONVCOORD = new JPanel();
		tabbedPane_TOPO.addTab("Перетвор. прямокут. коорд. в геодезичнi та навпаки", null, panel_CONVCOORD, null);
		panel_CONVCOORD.setLayout(null);
		
		topo_convcoord_input = new JPanel();
		topo_convcoord_input.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		topo_convcoord_input.setBounds(52, 90, 140, 65);
		panel_CONVCOORD.add(topo_convcoord_input);
		GridBagLayout gbl_topo_convcoord_input = new GridBagLayout();
		gbl_topo_convcoord_input.columnWidths = new int[] {50, 50};
		gbl_topo_convcoord_input.rowHeights = new int[] {30, 30};
		gbl_topo_convcoord_input.columnWeights = new double[]{0.0, 0.0};
		gbl_topo_convcoord_input.rowWeights = new double[]{0.0, 0.0};
		topo_convcoord_input.setLayout(gbl_topo_convcoord_input);
		
		lblXa = new JLabel("Xa");
		GridBagConstraints gbc_lblXa = new GridBagConstraints();
		gbc_lblXa.anchor = GridBagConstraints.NORTH;
		gbc_lblXa.insets = new Insets(0, 0, 5, 5);
		gbc_lblXa.gridx = 0;
		gbc_lblXa.gridy = 0;
		topo_convcoord_input.add(lblXa, gbc_lblXa);
		
		topo_convcoord_Xa = new JTextField();
		topo_convcoord_Xa.setText("000");
		topo_convcoord_Xa.setColumns(10);
		GridBagConstraints gbc_topo_convcoord_Xa = new GridBagConstraints();
		gbc_topo_convcoord_Xa.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_convcoord_Xa.anchor = GridBagConstraints.NORTH;
		gbc_topo_convcoord_Xa.insets = new Insets(0, 0, 5, 5);
		gbc_topo_convcoord_Xa.gridx = 1;
		gbc_topo_convcoord_Xa.gridy = 0;
		topo_convcoord_input.add(topo_convcoord_Xa, gbc_topo_convcoord_Xa);
		
		lblYa = new JLabel("Ya");
		GridBagConstraints gbc_lblYa = new GridBagConstraints();
		gbc_lblYa.anchor = GridBagConstraints.NORTH;
		gbc_lblYa.insets = new Insets(0, 0, 5, 5);
		gbc_lblYa.gridx = 0;
		gbc_lblYa.gridy = 1;
		topo_convcoord_input.add(lblYa, gbc_lblYa);
		
		topo_convcoord_Ya = new JTextField();
		topo_convcoord_Ya.setText("000");
		topo_convcoord_Ya.setColumns(10);
		GridBagConstraints gbc_topo_convcoord_Ya = new GridBagConstraints();
		gbc_topo_convcoord_Ya.insets = new Insets(0, 0, 5, 5);
		gbc_topo_convcoord_Ya.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_convcoord_Ya.anchor = GridBagConstraints.NORTH;
		gbc_topo_convcoord_Ya.gridx = 1;
		gbc_topo_convcoord_Ya.gridy = 1;
		topo_convcoord_input.add(topo_convcoord_Ya, gbc_topo_convcoord_Ya);
		
		topo_convcoord_buttonCalcGEODEZ = new JButton("\u0412 \u0433\u0435\u043E\u0434\u0435\u0437\u0438\u0447\u043Di");
		topo_convcoord_buttonCalcGEODEZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				topo_convcoord_input_title.setText("Прямокутнi координати:");
				topo_convcoord_output_title.setText("Геодезичнi координати:");
			}
		});
		topo_convcoord_buttonCalcGEODEZ.setForeground(Color.WHITE);
		topo_convcoord_buttonCalcGEODEZ.setBackground(new Color(0, 0, 205));
		topo_convcoord_buttonCalcGEODEZ.setBounds(10, 184, 114, 39);
		panel_CONVCOORD.add(topo_convcoord_buttonCalcGEODEZ);
		
		topo_convcoord_buttonCalcSQUARE = new JButton("\u0412 \u043F\u0440\u044F\u043C\u043E\u043A\u0443\u0442\u043Di");
		topo_convcoord_buttonCalcSQUARE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				topo_convcoord_input_title.setText("Геодезичнi координати:");
				topo_convcoord_output_title.setText("Прямокутнi координати:");
			}
		});
		topo_convcoord_buttonCalcSQUARE.setForeground(Color.WHITE);
		topo_convcoord_buttonCalcSQUARE.setBackground(new Color(0, 0, 205));
		topo_convcoord_buttonCalcSQUARE.setBounds(134, 184, 114, 39);
		panel_CONVCOORD.add(topo_convcoord_buttonCalcSQUARE);
		
		label_86 = new JLabel("\u0412\u0445i\u0434\u043Di \u0434\u0430\u043Di:");
		label_86.setForeground(new Color(128, 0, 0));
		label_86.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_86.setBounds(84, 37, 95, 14);
		panel_CONVCOORD.add(label_86);
		
		label_93 = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		label_93.setForeground(new Color(128, 0, 0));
		label_93.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_93.setBounds(84, 246, 95, 14);
		panel_CONVCOORD.add(label_93);
		
		topo_convcoord_output = new JPanel();
		topo_convcoord_output.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		topo_convcoord_output.setBounds(52, 296, 140, 65);
		panel_CONVCOORD.add(topo_convcoord_output);
		GridBagLayout gbl_topo_convcoord_output = new GridBagLayout();
		gbl_topo_convcoord_output.columnWidths = new int[] {50, 50};
		gbl_topo_convcoord_output.rowHeights = new int[] {30, 30};
		gbl_topo_convcoord_output.columnWeights = new double[]{0.0, 0.0};
		gbl_topo_convcoord_output.rowWeights = new double[]{0.0, 0.0};
		topo_convcoord_output.setLayout(gbl_topo_convcoord_output);
		
		label_94 = new JLabel("Xa");
		GridBagConstraints gbc_label_94 = new GridBagConstraints();
		gbc_label_94.anchor = GridBagConstraints.NORTH;
		gbc_label_94.insets = new Insets(0, 0, 5, 5);
		gbc_label_94.gridx = 0;
		gbc_label_94.gridy = 0;
		topo_convcoord_output.add(label_94, gbc_label_94);
		
		topo_convcoord_Xa_result = new JTextField();
		topo_convcoord_Xa_result.setText("000");
		topo_convcoord_Xa_result.setColumns(10);
		GridBagConstraints gbc_topo_convcoord_Xa_result = new GridBagConstraints();
		gbc_topo_convcoord_Xa_result.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_convcoord_Xa_result.anchor = GridBagConstraints.NORTH;
		gbc_topo_convcoord_Xa_result.insets = new Insets(0, 0, 5, 5);
		gbc_topo_convcoord_Xa_result.gridx = 1;
		gbc_topo_convcoord_Xa_result.gridy = 0;
		topo_convcoord_output.add(topo_convcoord_Xa_result, gbc_topo_convcoord_Xa_result);
		
		label_95 = new JLabel("Ya");
		GridBagConstraints gbc_label_95 = new GridBagConstraints();
		gbc_label_95.anchor = GridBagConstraints.NORTH;
		gbc_label_95.insets = new Insets(0, 0, 5, 5);
		gbc_label_95.gridx = 0;
		gbc_label_95.gridy = 1;
		topo_convcoord_output.add(label_95, gbc_label_95);
		
		topo_convcoord_Ya_result = new JTextField();
		topo_convcoord_Ya_result.setText("000");
		topo_convcoord_Ya_result.setColumns(10);
		GridBagConstraints gbc_topo_convcoord_Ya_result = new GridBagConstraints();
		gbc_topo_convcoord_Ya_result.insets = new Insets(0, 0, 5, 5);
		gbc_topo_convcoord_Ya_result.fill = GridBagConstraints.HORIZONTAL;
		gbc_topo_convcoord_Ya_result.anchor = GridBagConstraints.NORTH;
		gbc_topo_convcoord_Ya_result.gridx = 1;
		gbc_topo_convcoord_Ya_result.gridy = 1;
		topo_convcoord_output.add(topo_convcoord_Ya_result, gbc_topo_convcoord_Ya_result);
		
		topo_convcoord_input_title = new JLabel("");
		topo_convcoord_input_title.setBounds(52, 65, 196, 14);
		panel_CONVCOORD.add(topo_convcoord_input_title);
		
		topo_convcoord_output_title = new JLabel("");
		topo_convcoord_output_title.setBounds(52, 271, 196, 14);
		panel_CONVCOORD.add(topo_convcoord_output_title);
		
		label_109 = new JLabel("\u041F\u0435\u0440\u0435\u0442\u0432\u043E\u0440\u0435\u043D\u043D\u044F \u043F\u0440\u044F\u043C\u043E\u043A\u0443\u0442\u043D\u0438\u0445 \u043A\u043E\u043E\u0440\u0434. \u0432 \u0433\u0435\u043E\u0434\u0435\u0437\u0438\u0447\u043Di \u0442\u0430 \u043D\u0430\u0432\u043F\u0430\u043A\u0438");
		label_109.setForeground(Color.BLUE);
		label_109.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_109.setBounds(10, 11, 431, 14);
		panel_CONVCOORD.add(label_109);
		
		panel_SUNANGLE = new JPanel();
		tabbedPane_TOPO.addTab("Визначення дирекцiйного кута сонця", null, panel_SUNANGLE, null);
		panel_SUNANGLE.setLayout(null);
		
		lbli_7 = new JLabel("\u0412\u0438\u0437\u043D\u0430\u0447\u0435\u043D\u043D\u044F \u0434\u0438\u0440\u0435\u043A\u0446i\u0439\u043D\u043E\u0433\u043E \u043A\u0443\u0442\u0430 \u0441\u043E\u043D\u0446\u044F");
		lbli_7.setForeground(Color.BLUE);
		lbli_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbli_7.setBounds(10, 11, 301, 14);
		panel_SUNANGLE.add(lbli_7);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
