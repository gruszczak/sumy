package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class Main extends JFrame {

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
	private JTextField textField_meteoNB_2;
	private JTextField textField_meteoNB_3;
	private JTextField textField_meteoNB_4;
	private JTextField textField_meteoNB_5;
	private JTextField textField_meteoSR_1;
	private JTextField textField_meteoSR_2;
	private JTextField textField_meteoSR_4;
	private JTextField textField_meteoSR_3;
	private JTable table_meteo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
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
		setBounds(100, 100, 611, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		tabbedPane.addTab("БП", null, panel, null);
		
		JPanel panel_meteo = new JPanel();
		tabbedPane.addTab("Метео", null, panel_meteo, null);
		panel_meteo.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane_meteo = new JTabbedPane(JTabbedPane.LEFT);
		panel_meteo.add(tabbedPane_meteo);
		
		JPanel panel_meteoNablyzh = new JPanel();
		tabbedPane_meteo.addTab("Метеонаближений", null, panel_meteoNablyzh, null);
		panel_meteoNablyzh.setLayout(null);
		
		JLabel label_meteoNB_2 = new JLabel("h0");
		label_meteoNB_2.setBounds(10, 48, 27, 14);
		panel_meteoNablyzh.add(label_meteoNB_2);
		
		textField_meteoNB_1 = new JTextField();
		textField_meteoNB_1.setColumns(10);
		textField_meteoNB_1.setBounds(49, 45, 86, 20);
		panel_meteoNablyzh.add(textField_meteoNB_1);
		
		textField_meteoNB_2 = new JTextField();
		textField_meteoNB_2.setColumns(10);
		textField_meteoNB_2.setBounds(49, 73, 86, 20);
		panel_meteoNablyzh.add(textField_meteoNB_2);
		
		JLabel label_meteoNB_3 = new JLabel("t0");
		label_meteoNB_3.setBounds(10, 76, 27, 14);
		panel_meteoNablyzh.add(label_meteoNB_3);
		
		textField_meteoNB_3 = new JTextField();
		textField_meteoNB_3.setColumns(10);
		textField_meteoNB_3.setBounds(226, 45, 86, 20);
		panel_meteoNablyzh.add(textField_meteoNB_3);
		
		JLabel label_meteoNB_5 = new JLabel("aW");
		label_meteoNB_5.setBounds(187, 48, 27, 14);
		panel_meteoNablyzh.add(label_meteoNB_5);
		
		textField_meteoNB_4 = new JTextField();
		textField_meteoNB_4.setColumns(10);
		textField_meteoNB_4.setBounds(226, 73, 86, 20);
		panel_meteoNablyzh.add(textField_meteoNB_4);
		
		JLabel label_meteoNB_6 = new JLabel("W");
		label_meteoNB_6.setBounds(187, 76, 27, 14);
		panel_meteoNablyzh.add(label_meteoNB_6);
		
		textField_meteoNB_5 = new JTextField();
		textField_meteoNB_5.setColumns(10);
		textField_meteoNB_5.setBounds(49, 101, 86, 20);
		panel_meteoNablyzh.add(textField_meteoNB_5);
		
		JLabel label_meteoNB_4 = new JLabel("h \u043C\u043F");
		label_meteoNB_4.setBounds(10, 104, 27, 14);
		panel_meteoNablyzh.add(label_meteoNB_4);
		
		JButton button_meteoNB = new JButton("\u0417\u0430\u0441\u0442\u043E\u0441\u0443\u0432\u0430\u0442\u0438");
		button_meteoNB.setBounds(187, 151, 125, 39);
		panel_meteoNablyzh.add(button_meteoNB);
		
		JLabel label_meteoNB_1 = new JLabel("\u041D\u0430\u0437\u0435\u043C\u043Di \u043C\u0435\u0442\u0435\u043E\u0444\u0430\u043A\u0442\u043E\u0440\u0438");
		label_meteoNB_1.setBounds(10, 11, 155, 14);
		panel_meteoNablyzh.add(label_meteoNB_1);
		
		JPanel panel_meteoSered = new JPanel();
		tabbedPane_meteo.addTab("Метеосереднiй", null, panel_meteoSered, null);
		panel_meteoSered.setLayout(null);
		
		JLabel label_meteoSR_1 = new JLabel("\u041C\u0435\u0442\u0435\u043E");
		label_meteoSR_1.setBounds(19, 39, 37, 14);
		panel_meteoSered.add(label_meteoSR_1);
		
		textField_meteoSR_1 = new JTextField();
		textField_meteoSR_1.setColumns(10);
		textField_meteoSR_1.setBounds(66, 36, 72, 20);
		panel_meteoSered.add(textField_meteoSR_1);
		
		textField_meteoSR_2 = new JTextField();
		textField_meteoSR_2.setColumns(10);
		textField_meteoSR_2.setBounds(148, 36, 72, 20);
		panel_meteoSered.add(textField_meteoSR_2);
		
		textField_meteoSR_4 = new JTextField();
		textField_meteoSR_4.setColumns(10);
		textField_meteoSR_4.setBounds(312, 36, 72, 20);
		panel_meteoSered.add(textField_meteoSR_4);
		
		textField_meteoSR_3 = new JTextField();
		textField_meteoSR_3.setColumns(10);
		textField_meteoSR_3.setBounds(230, 36, 72, 20);
		panel_meteoSered.add(textField_meteoSR_3);
		
		table_meteo = new JTable();
		table_meteo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_meteo.setRowSelectionAllowed(false);
		table_meteo.setModel(new DefaultTableModel(
			new Object[][] {
				{"02-", null, null, null},
				{"04-", null, null, null},
				{"08-", null, null, null},
				{"12-", null, null, null},
				{"16-", null, null, null},
				{"20-", null, null, null},
				{"24-", null, null, null},
				{"30-", null, null, null},
				{"40-", null, null, null},
			},
			new String[] {
				"Y\u043C(\u0431\u044E\u043B)", "\u0394Ty", "\u03B1Wy", "Wy"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_meteo.getColumnModel().getColumn(0).setResizable(false);
		table_meteo.getColumnModel().getColumn(0).setPreferredWidth(60);
		table_meteo.getColumnModel().getColumn(1).setResizable(false);
		table_meteo.getColumnModel().getColumn(1).setPreferredWidth(60);
		table_meteo.getColumnModel().getColumn(2).setResizable(false);
		table_meteo.getColumnModel().getColumn(2).setPreferredWidth(60);
		table_meteo.getColumnModel().getColumn(3).setResizable(false);
		table_meteo.getColumnModel().getColumn(3).setPreferredWidth(60);		
		table_meteo.setBounds(66, 68, 318, 168);
		panel_meteoSered.add(table_meteo);
		
		JLabel label_meteoSR_2 = new JLabel("\u0414\u0430\u0442\u0430");
		label_meteoSR_2.setBounds(66, 11, 46, 14);
		panel_meteoSered.add(label_meteoSR_2);
		
		JLabel label_meteoSR_3 = new JLabel("h mc");
		label_meteoSR_3.setBounds(148, 11, 46, 14);
		panel_meteoSered.add(label_meteoSR_3);
		
		JLabel label_meteoSR_4 = new JLabel("\u0394 Hm");
		label_meteoSR_4.setBounds(230, 11, 46, 14);
		panel_meteoSered.add(label_meteoSR_4);
		
		JLabel label_meteoSR_5 = new JLabel("\u0394T");
		label_meteoSR_5.setBounds(312, 11, 46, 14);
		panel_meteoSered.add(label_meteoSR_5);
		
		JButton button_meteoSR = new JButton("\u0417\u0430\u0441\u0442\u043E\u0441\u0443\u0432\u0430\u0442\u0438");
		button_meteoSR.setBounds(259, 252, 125, 39);
		panel_meteoSered.add(button_meteoSR);
		
		JPanel panel_meteoPopravky = new JPanel();
		tabbedPane_meteo.addTab("Готовi поправки", null, panel_meteoPopravky, null);
		panel_meteoPopravky.setLayout(null);
		
		textField_meteoGP_1 = new JTextField();
		textField_meteoGP_1.setText("5");
		textField_meteoGP_1.setColumns(10);
		textField_meteoGP_1.setBounds(67, 11, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_1);
		
		JLabel label_meteoGP_1 = new JLabel("d");
		label_meteoGP_1.setBounds(10, 14, 45, 14);
		panel_meteoPopravky.add(label_meteoGP_1);
		
		textField_meteoGP_2 = new JTextField();
		textField_meteoGP_2.setText("8");
		textField_meteoGP_2.setColumns(10);
		textField_meteoGP_2.setBounds(153, 11, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_2);
		
		textField_meteoGP_3 = new JTextField();
		textField_meteoGP_3.setText("11");
		textField_meteoGP_3.setColumns(10);
		textField_meteoGP_3.setBounds(239, 11, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_3);
		
		JLabel label_meteoGP_2 = new JLabel("\u0394 d");
		label_meteoGP_2.setBounds(10, 42, 45, 14);
		panel_meteoPopravky.add(label_meteoGP_2);
		
		textField_meteoGP_4 = new JTextField();
		textField_meteoGP_4.setColumns(10);
		textField_meteoGP_4.setBounds(67, 39, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_4);
		
		textField_meteoGP_5 = new JTextField();
		textField_meteoGP_5.setColumns(10);
		textField_meteoGP_5.setBounds(153, 39, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_5);
		
		textField_meteoGP_6 = new JTextField();
		textField_meteoGP_6.setColumns(10);
		textField_meteoGP_6.setBounds(239, 39, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_6);
		
		JLabel label_meteoGP_3 = new JLabel("\u0394 \u03C3");
		label_meteoGP_3.setBounds(10, 70, 45, 14);
		panel_meteoPopravky.add(label_meteoGP_3);
		
		textField_meteoGP_7 = new JTextField();
		textField_meteoGP_7.setColumns(10);
		textField_meteoGP_7.setBounds(67, 67, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_7);
		
		textField_meteoGP_8 = new JTextField();
		textField_meteoGP_8.setColumns(10);
		textField_meteoGP_8.setBounds(153, 67, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_8);
		
		textField_meteoGP_9 = new JTextField();
		textField_meteoGP_9.setColumns(10);
		textField_meteoGP_9.setBounds(239, 67, 72, 20);
		panel_meteoPopravky.add(textField_meteoGP_9);
		
		JButton button_meteoGP = new JButton("\u0417\u0430\u0441\u0442\u043E\u0441\u0443\u0432\u0430\u0442\u0438");
		button_meteoGP.setBounds(186, 113, 125, 39);
		panel_meteoPopravky.add(button_meteoGP);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("ПП", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Пристрiлка", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("ТОПО задачi", null, panel_4, null);
	}
}
