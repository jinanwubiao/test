package test18;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;

public class MyFrame extends JFrame {

	private Container container;
	private JTabbedPane tabbedPane;
	private int width;
	private int height;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		ImageIcon icon=new ImageIcon("pic/a1.png");
		width=icon.getIconWidth();
		height=icon.getIconHeight()/4;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 482);
		container=getContentPane();
		container.setLayout(new BorderLayout(0,0));
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		gettab1();
		gettab2();
		gettab3();
		
	}
	void gettab1(){
		
		BjPane panel = new BjPane();
		tabbedPane.addTab("筛选项目", null, panel, null);
		panel.setOpaque(false);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, height, width, 173);
		panel.add(panel_1);
		panel_1.setLayout(null);
		ButtonGroup buttonGroup=new ButtonGroup();
		JRadioButton radioButton = new JRadioButton("不限");
		radioButton.setBounds(78, 11, 94, 29);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("6个月以下");
		radioButton_1.setBounds(184, 11, 94, 29);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("6-12个月");
		radioButton_2.setBounds(285, 10, 94, 29);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("12个月以上");
		radioButton_3.setBounds(375, 11, 94, 29);
		panel_1.add(radioButton_3);
		
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);
		buttonGroup.add(radioButton_2);
		buttonGroup.add(radioButton_3);
		
		textField = new JTextField();
		textField.setBounds(476, 12, 87, 27);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(621, 12, 87, 27);
		panel_1.add(textField_1);
		
		JLabel label = new JLabel("投资期限：");
		label.setBounds(15, 15, 81, 21);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("个月-");
		label_1.setBounds(570, 15, 50, 21);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("个月");
		label_2.setBounds(723, 15, 81, 21);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("投资金额");
		label_3.setBounds(15, 70, 81, 21);
		panel_1.add(label_3);
		
		ButtonGroup buttonGroup1=new ButtonGroup();
		JRadioButton radioButton_4 = new JRadioButton("不限");
		radioButton_4.setBounds(78, 66, 94, 29);
		panel_1.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("一万元以下");
		radioButton_5.setBounds(184, 66, 94, 29);
		panel_1.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("1-5万元");
		radioButton_6.setBounds(285, 66, 94, 29);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("5-10万元");
		radioButton_7.setBounds(375, 66, 94, 29);
		panel_1.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("10万元以上");
		radioButton_8.setBounds(476, 66, 94, 29);
		panel_1.add(radioButton_8);
		buttonGroup1.add(radioButton_4);
		buttonGroup1.add(radioButton_5);
		buttonGroup1.add(radioButton_6);
		buttonGroup1.add(radioButton_7);
		buttonGroup1.add(radioButton_8);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(570, 67, 87, 27);
		panel_1.add(textField_2);
		
		JLabel label_4 = new JLabel("万元-");
		label_4.setBounds(672, 70, 50, 21);
		panel_1.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(728, 67, 87, 27);
		panel_1.add(textField_3);
		
		JLabel label_5 = new JLabel("万元");
		label_5.setBounds(830, 70, 81, 21);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("收益率");
		label_6.setBounds(15, 126, 81, 21);
		panel_1.add(label_6);
		
		ButtonGroup buttonGroup2=new ButtonGroup();
		JRadioButton radioButton_9 = new JRadioButton("不限");
		radioButton_9.setBounds(78, 122, 94, 29);
		panel_1.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("5%以下");
		radioButton_10.setBounds(184, 122, 94, 29);
		panel_1.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("5%-10%");
		radioButton_11.setBounds(285, 122, 94, 29);
		panel_1.add(radioButton_11);
		JRadioButton radioButton_12 = new JRadioButton("10%以上");
		radioButton_12.setBounds(375, 122, 94, 29);
		panel_1.add(radioButton_12);
		
		buttonGroup2.add(radioButton_9);
		buttonGroup2.add(radioButton_10);
		buttonGroup2.add(radioButton_11);
		buttonGroup2.add(radioButton_12);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(476, 123, 87, 27);
		panel_1.add(textField_4);
		
		JLabel label_7 = new JLabel("%-");
		label_7.setBounds(570, 126, 50, 21);
		panel_1.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(591, 123, 87, 27);
		panel_1.add(textField_5);
		
		JLabel label_8 = new JLabel("%");
		label_8.setBounds(682, 126, 81, 21);
		panel_1.add(label_8);
	}
	void gettab2(){
		BjPane panel = new BjPane();
		tabbedPane.addTab("设定抢购", null, panel, null);
		panel.setOpaque(false);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, height, width, 173);
		panel.add(panel_1);
		panel_1.setLayout(null);
		ButtonGroup buttonGroup=new ButtonGroup();
		JRadioButton radioButton = new JRadioButton("不限");
		radioButton.setBounds(78, 11, 94, 29);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("6个月以下");
		radioButton_1.setBounds(184, 11, 94, 29);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("6-12个月");
		radioButton_2.setBounds(285, 10, 94, 29);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("12个月以上");
		radioButton_3.setBounds(375, 11, 94, 29);
		panel_1.add(radioButton_3);
		
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton_1);
		buttonGroup.add(radioButton_2);
		buttonGroup.add(radioButton_3);
		
		textField = new JTextField();
		textField.setBounds(476, 12, 87, 27);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(621, 12, 87, 27);
		panel_1.add(textField_1);
		
		JLabel label = new JLabel("投资期限：");
		label.setBounds(15, 15, 81, 21);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("个月-");
		label_1.setBounds(570, 15, 50, 21);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("个月");
		label_2.setBounds(723, 15, 81, 21);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("投资金额");
		label_3.setBounds(15, 70, 81, 21);
		panel_1.add(label_3);
		
		ButtonGroup buttonGroup1=new ButtonGroup();
		JRadioButton radioButton_4 = new JRadioButton("不限");
		radioButton_4.setBounds(78, 66, 94, 29);
		panel_1.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("一万元以下");
		radioButton_5.setBounds(184, 66, 94, 29);
		panel_1.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("1-5万元");
		radioButton_6.setBounds(285, 66, 94, 29);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("5-10万元");
		radioButton_7.setBounds(375, 66, 94, 29);
		panel_1.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("10万元以上");
		radioButton_8.setBounds(476, 66, 94, 29);
		panel_1.add(radioButton_8);
		buttonGroup1.add(radioButton_4);
		buttonGroup1.add(radioButton_5);
		buttonGroup1.add(radioButton_6);
		buttonGroup1.add(radioButton_7);
		buttonGroup1.add(radioButton_8);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(570, 67, 87, 27);
		panel_1.add(textField_2);
		
		JLabel label_4 = new JLabel("万元-");
		label_4.setBounds(672, 70, 50, 21);
		panel_1.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(728, 67, 87, 27);
		panel_1.add(textField_3);
		
		JLabel label_5 = new JLabel("万元");
		label_5.setBounds(830, 70, 81, 21);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("收益率");
		label_6.setBounds(15, 126, 81, 21);
		panel_1.add(label_6);
		
		ButtonGroup buttonGroup2=new ButtonGroup();
		JRadioButton radioButton_9 = new JRadioButton("不限");
		radioButton_9.setBounds(78, 122, 94, 29);
		panel_1.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("5%以下");
		radioButton_10.setBounds(184, 122, 94, 29);
		panel_1.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("5%-10%");
		radioButton_11.setBounds(285, 122, 94, 29);
		panel_1.add(radioButton_11);
		
		
		
		JRadioButton radioButton_12 = new JRadioButton("10%以上");
		radioButton_12.setBounds(375, 122, 94, 29);
		panel_1.add(radioButton_12);
		
		buttonGroup2.add(radioButton_9);
		buttonGroup2.add(radioButton_10);
		buttonGroup2.add(radioButton_11);
		buttonGroup2.add(radioButton_12);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(476, 123, 87, 27);
		panel_1.add(textField_4);
		
		JLabel label_7 = new JLabel("%-");
		label_7.setBounds(570, 126, 50, 21);
		panel_1.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(591, 123, 87, 27);
		panel_1.add(textField_5);
		
		JLabel label_8 = new JLabel("%");
		label_8.setBounds(682, 126, 81, 21);
		panel_1.add(label_8);
		
		JButton btnNewButton = new JButton("开始抢购");
		btnNewButton.setBounds(width/2, height*2, 123, 29);
		panel.add(btnNewButton);
	}
	void gettab3(){
		BjPane panel = new BjPane();
		tabbedPane.addTab("收益统计", null, panel, null);
		panel.setOpaque(false);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("导入");
		btnNewButton_1.setBounds(0, height, 123, 29);
		panel.add(btnNewButton_1);
		
	}
}
