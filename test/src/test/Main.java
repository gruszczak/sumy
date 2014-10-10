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
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

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
		setBounds(100, 100, 800, 859);
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
		gbc_label_24.insets = new Insets(0, 0, 5, 0);
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
		gbc_lbli_3.insets = new Insets(0, 0, 5, 0);
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
		gbc_lbli_4.insets = new Insets(0, 0, 5, 0);
		gbc_lbli_4.gridx = 2;
		gbc_lbli_4.gridy = 3;
		panel_1.add(lbli_4, gbc_lbli_4);
		
		lblii_1 = new JLabel("\u0428\u0432\u0438\u0434\u043Ai\u0441\u0442\u044C \u0441\u0435\u0440\u0435\u0434\u043D\u044C\u043E\u0433\u043E \u0432i\u0442\u0440\u0443");
		GridBagConstraints gbc_lblii_1 = new GridBagConstraints();
		gbc_lblii_1.anchor = GridBagConstraints.NORTH;
		gbc_lblii_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblii_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblii_1.gridx = 0;
		gbc_lblii_1.gridy = 4;
		panel_1.add(lblii_1, gbc_lblii_1);
		
		textField_34 = new JTextField();
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.anchor = GridBagConstraints.NORTH;
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.insets = new Insets(0, 0, 0, 5);
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
		button.setBackground(new Color(184, 134, 11));
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
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("ПП", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Пристрiлка", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("ТОПО задачi", null, panel_4, null);
	}
}
