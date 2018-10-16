package Mini_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Length_Converter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	String[] Length={"Millimeter","CentiMeter","Meter","KiloMeter"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Length_Converter frame = new Length_Converter();
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
	public Length_Converter() throws IllegalArgumentException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Dell\\Pictures\\Feedback\\{3D7015CB-393E-420F-A52D-17D87E540BD6}")));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblLengthConverter = new JLabel("Length Converter");
		lblLengthConverter.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLengthConverter.setBounds(141, 11, 155, 20);
		contentPane.add(lblLengthConverter);
		
		textField = new JTextField();
		textField.setBounds(69, 93, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(279, 93, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		comboBox = new JComboBox(Length);
//		comboBox.addItem("MilliMeter");
//		comboBox.addItem("CentiMeter");
//		comboBox.addItem("Meter");
//		comboBox.addItem("KiloMeter");
		comboBox.setBounds(69, 115, 86, 20);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox(Length);
//		comboBox_1.addItem("MilliMeter");
//		comboBox_1.addItem("CentiMeter");
//		comboBox_1.addItem("Meter");
//		comboBox_1.addItem("KiloMeter");
		comboBox_1.setBounds(279, 115, 86, 20);
		contentPane.add(comboBox_1);
		/*btnConvert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				double a ,c =0;
				a=Double.valueOf(textField.getText());
				try {
					if(comboBox.getSelectedObject().toString().equals("Millimeter") && comboBox_1.getSelectedIndex()==0)
					{
						 c=a;
					}
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==1)
					{
						c=a/10;
					}
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==2)
					{
						c=a/100;
					}
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==3)
					{
						c=a/1000;
					}
				
				textField_1.setText(String.valueOf(c));
				}
				catch(Exception e1) 
				{
					e1.printStackTrace();
				}
			}
			
		});*/
		
		comboBox_1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				double a ,c =0;
				a=Double.valueOf(textField.getText());
				try {
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==0)
					{
						 c=a;
					}
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==1)
					{
						c=a/10;
					}
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==2)
					{
						c=a/1000;
					}
					if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==3)
					{
						c=a/1000000;
					}
					if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==0)
					{
						 c=a*10;
					}
					if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==1)
					{
						c=a;
					}
					if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==2)
					{
						c=a/100;
					}
					if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==3)
					{
						c=a/100000;
					}
					if(comboBox.getSelectedIndex()==2 && comboBox_1.getSelectedIndex()==0)
					{
						 c=a*1000;
					}
					if(comboBox.getSelectedIndex()==2 && comboBox_1.getSelectedIndex()==1)
					{
						c=a*100;
					}
					if(comboBox.getSelectedIndex()==2 && comboBox_1.getSelectedIndex()==2)
					{
						c=a;
					}
					if(comboBox.getSelectedIndex()==2 && comboBox_1.getSelectedIndex()==3)
					{
						c=a/1000;
					}
					if(comboBox.getSelectedIndex()==3 && comboBox_1.getSelectedIndex()==0)
					{
						 c=a*1000000;
					}
					if(comboBox.getSelectedIndex()==3 && comboBox_1.getSelectedIndex()==1)
					{
						c=a*100000;
					}
					if(comboBox.getSelectedIndex()==3 && comboBox_1.getSelectedIndex()==2)
					{
						c=a*1000;
					}
					if(comboBox.getSelectedIndex()==3 && comboBox_1.getSelectedIndex()==3)
					{
						c=a;
					}
				textField_1.setText(String.valueOf(c));
				}
				catch(Exception e1) 
				{
					e1.printStackTrace();
				}
			}
			
				
			
			
		});
	}
}
