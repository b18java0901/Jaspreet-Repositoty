package swings;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Demo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(78, 79, 67, 21);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(206, 79, 102, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(78, 170, 67, 19);
		contentPane.add(lblPassword);
		
		JToggleButton tglbtnSubmit = new JToggleButton("Login");
		tglbtnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
		               {//Step 1: Loading the Driver
		                    Class.forName("com.mysql.jdbc.Driver");
		                //Step 2: Establishing the connection
		                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javamini", "root" , "");
		                //Step 3: Creating the Statement
		                    PreparedStatement st=con.prepareStatement("select*from user where Name=? and Email=? and Contact=?");
		                    st.setString(1,textField.getText());
		                    st.setString(2,textField_1.getText());
		                    st.setString(3,passwordField.getText());
		                //Step 4: Executing the Query
		                ResultSet rs=st.executeQuery();
		                //Step 5: Processing the Results
		               if (rs.next())
//		                if(textField.getText().equals(rs.getString(2))&&passwordField.getText().equals(rs.getString(4)))
		                {
		                JOptionPane.showMessageDialog(contentPane,"Login Successful");
		                New_Frame f = new New_Frame();		            
		           		setVisible(false);
		            	f.setVisible(true);
		                }
		                else
		                {
		                JOptionPane.showMessageDialog(contentPane,"Login Unsuccessful");
		                }
		               }
				}
		                catch(Exception e1)
		                {
		                    e1.printStackTrace();
		                }
		                
		                            }
		        });
		tglbtnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		tglbtnSubmit.setBounds(170, 213, 83, 37);
		contentPane.add(tglbtnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(206, 170, 102, 21);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(158, 11, 95, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(82, 130, 46, 14);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 128, 102, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
	}
}
