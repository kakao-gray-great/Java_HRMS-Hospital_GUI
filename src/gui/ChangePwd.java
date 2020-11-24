package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class ChangePwd {
	JFrame frame = new JFrame();
	
	void passwordChangeGUI() {

		JPanel passwordChangePanel = new JPanel();
		JPanel passwordChangeWhitePanel = whitePanel(passwordChangePanel);

		JLabel passwordCh = new JLabel("ÇöÀç ºñ¹Ð¹øÈ£");
		passwordCh.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		passwordCh.setBounds(40, 30, 162, 35);
		passwordChangeWhitePanel.add(passwordCh);

		JPasswordField passwordFieldCh = new JPasswordField();
		passwordFieldCh.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		passwordFieldCh.setBounds(40, 74, 400, 35);
		passwordChangeWhitePanel.add(passwordFieldCh);

		JLabel password2Ch = new JLabel("º¯°æÇÒ ºñ¹Ð¹øÈ£ ");
		password2Ch.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		password2Ch.setBounds(40, 147, 200, 35);
		passwordChangeWhitePanel.add(password2Ch);

		JPasswordField passwordField2Ch = new JPasswordField();
		passwordField2Ch.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		passwordField2Ch.setBounds(40, 192, 400, 35);
		passwordChangeWhitePanel.add(passwordField2Ch);

		JLabel password3Ch = new JLabel("ºñ¹Ð¹øÈ£ ÀçÀÔ·Â");
		password3Ch.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		password3Ch.setBounds(40, 262, 200, 35);
		passwordChangeWhitePanel.add(password3Ch);

		JPasswordField passwordField3Ch = new JPasswordField();
		passwordField3Ch.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		passwordField3Ch.setBounds(40, 307, 400, 35);
		passwordChangeWhitePanel.add(passwordField3Ch);

		JButton cancelBt = new JButton("\uCDE8  \uC18C");
		cancelBt.setBackground(new Color(211, 211, 211));
		cancelBt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		cancelBt.setBounds(40, 400, 162, 42);
		passwordChangeWhitePanel.add(cancelBt);

		JButton changeBt = new JButton("º¯°æÇÏ±â");
		changeBt.setBackground(new Color(211, 211, 211));
		changeBt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		changeBt.setBounds(278, 400, 162, 42);
		passwordChangeWhitePanel.add(changeBt);

		
		//////////////////////////////////////
		frame.add(passwordChangePanel);
		frame.add(passwordChangeWhitePanel);

		frame.setTitle("°Å±ä¾î¶§: Inform-Hospital");
		frame.setVisible(true);
		frame.setSize(500, 700);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	JPanel whitePanel(JPanel mainPanel) {
		JPanel whitePanel = new JPanel();
		whitePanel.setBackground(Color.WHITE);
		whitePanel.setForeground(Color.BLACK);
		whitePanel.setBounds(12, 221, 505, 557);
		mainPanel.add(whitePanel);
		whitePanel.setLayout(null);
		return whitePanel;
	}

	public static void main(String[] args) {
		ChangePwd log = new ChangePwd();
		log.passwordChangeGUI();
	}
}