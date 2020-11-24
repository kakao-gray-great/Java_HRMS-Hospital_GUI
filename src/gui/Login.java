package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	void loginGui() {
		String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Hospital_GUI\\image\\";
		
		
		JFrame frame = new JFrame();
		
			
		JPanel upperBarPanel = new JPanel();
		
		upperBarPanel.setVisible(true);
		upperBarPanel.setLayout(null);
		upperBarPanel.setBounds(0, 0, 1240, 90);
		
		JLabel MenuTitle = new JLabel("°Å±ä ¾î¶§");
		MenuTitle.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		MenuTitle.setBounds(30, 25, 300, 50);
		upperBarPanel.add(MenuTitle);

		
		
		JPanel loginPanel = new JPanel();
		loginPanel.setVisible(true);
		loginPanel.setLayout(null);
		loginPanel.add(upperBarPanel);
		loginPanel.setBounds(100, 60, 1240, 500);
		
		loginPanel.setBackground(new Color(203, 211, 216));
		
		JLabel loginLabel = new JLabel("LOGIN");
		loginLabel.setBounds(560, 300, 200, 80);
		loginLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		loginPanel.add(loginLabel);
		
		
		JLabel idIconLabel = new JLabel("");
		idIconLabel.setIcon(new ImageIcon(PATH + "login_ID.png"));
		idIconLabel.setBounds(400, 400, 80, 80);
		loginPanel.add(idIconLabel);
		
		
		JTextField idTextField = new JTextField();
		idTextField.setColumns(20);
		idTextField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		idTextField.setBounds(500, 415, 300, 40);
		loginPanel.add(idTextField);
		

		JLabel passwdIconLabel = new JLabel("");
		passwdIconLabel.setIcon(new ImageIcon(PATH + "login_passwd.png"));
		passwdIconLabel.setBounds(400, 500, 80, 80);
		loginPanel.add(passwdIconLabel);
		
		JPasswordField passwdTextField = new JPasswordField();
		passwdTextField.setColumns(20);
		passwdTextField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		passwdTextField.setBounds(500, 515, 300, 40);
		loginPanel.add(passwdTextField);
		
		
		
		JButton loginButton = new JButton("·Î±×ÀÎ");
		loginButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		loginButton.setBounds(550, 600, 150, 40);
		loginButton.setBackground(new Color(211, 211, 211));
		
		loginPanel.add(loginButton);
		

		/////////////////////////////////
		
		frame.add(loginPanel);
		frame.setTitle("°Å±ä¾î¶§: Login-Hospital");
		frame.setVisible(true);
		frame.setSize(1240, 845);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		Login gui = new Login();
		gui.loginGui();
	}
}
