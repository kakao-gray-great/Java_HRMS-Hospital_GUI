package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Information {

	String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Hospital_GUI\\image\\";
	JFrame frame = new JFrame();

	public void hospitalInformation() { // º´¿ø Á¤º¸
		// »ó´Ü
		JPanel hospitalInformationUpperBarPanel = new JPanel();
		hospitalInformationUpperBarPanel.setVisible(true);
		hospitalInformationUpperBarPanel.setLayout(null);
		hospitalInformationUpperBarPanel.setBounds(0, 0, 1240, 90);

		JLabel menuTitleLabel = new JLabel("°Å±ä ¾î¶§");
		menuTitleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		menuTitleLabel.setBounds(30, 25, 300, 50);
		hospitalInformationUpperBarPanel.add(menuTitleLabel);

		JButton menuWaitButton = new JButton("´ë±â ÇöÈ²");
		menuWaitButton.setBounds(200, 25, 125, 50);
		menuWaitButton.setBackground(Color.gray);
		menuWaitButton.setForeground(Color.white);
		menuWaitButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		hospitalInformationUpperBarPanel.add(menuWaitButton);

		JButton menuHistoryButton = new JButton("Áø·á ±â·Ï");
		menuHistoryButton.setBounds(330, 25, 125, 50);
		menuHistoryButton.setBackground(Color.gray);
		menuHistoryButton.setForeground(Color.white);
		menuHistoryButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		hospitalInformationUpperBarPanel.add(menuHistoryButton);

		JButton menuInformationButton = new JButton("º´¿ø Á¤º¸");
		menuInformationButton.setBounds(460, 25, 125, 50);
		menuInformationButton.setBackground(Color.gray);
		menuInformationButton.setForeground(Color.white);
		menuInformationButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		hospitalInformationUpperBarPanel.add(menuInformationButton);

		JButton menuRefreshButton = new JButton("");
		menuRefreshButton.setIcon(new ImageIcon(PATH + "refresh_button.png"));
		menuRefreshButton.setBounds(1100, 20, 60, 60);

		hospitalInformationUpperBarPanel.add(menuRefreshButton);

		// ¸ÞÀÎ
		JPanel informationHospitalPanel = new JPanel();
		informationHospitalPanel.setVisible(true);
		informationHospitalPanel.setLayout(null);
		informationHospitalPanel.add(hospitalInformationUpperBarPanel);
		informationHospitalPanel.setBackground(Color.white);

		JLabel hospitalNameLabel = new JLabel("º´¿ø¸í:");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35));
		hospitalNameLabel.setBounds(80, 80, 170, 90);
		informationHospitalPanel.add(hospitalNameLabel);

		JLabel hospitalNameOwnLabel = new JLabel("ÁÁÀº ÀÇ¿ø");
		hospitalNameOwnLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35));
		hospitalNameOwnLabel.setBounds(220, 80, 200, 90);
		informationHospitalPanel.add(hospitalNameOwnLabel);

		// ¾ÈÂÊ ¹Ú½º
		JPanel informationHospital_SectionPanel = new JPanel();
		informationHospital_SectionPanel.setVisible(true);
		informationHospital_SectionPanel.setLayout(null);
		informationHospital_SectionPanel.setBounds(80, 160, 1000, 530);
		informationHospitalPanel.add(informationHospital_SectionPanel);

		JLabel hospitalIDLabel = new JLabel("¾ÆÀÌµð");
		hospitalIDLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		hospitalIDLabel.setBounds(20, -20, 120, 90);
		informationHospital_SectionPanel.add(hospitalIDLabel);

		JLabel hospitalIDOWNLabel = new JLabel("hrms_008");
		hospitalIDOWNLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		hospitalIDOWNLabel.setBounds(120, -20, 500, 90);
		informationHospital_SectionPanel.add(hospitalIDOWNLabel);

		JLabel hospitalmNumberLabel = new JLabel("¿¬¶ôÃ³     ");
		hospitalmNumberLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		hospitalmNumberLabel.setBounds(20, 20, 120, 90);
		informationHospital_SectionPanel.add(hospitalmNumberLabel);

		JLabel hospitalmNumberOwnLabel = new JLabel("010-7442-6684");
		hospitalmNumberOwnLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		hospitalmNumberOwnLabel.setBounds(120, 20, 500, 90);
		informationHospital_SectionPanel.add(hospitalmNumberOwnLabel);

		JLabel hospitalAddressLabel = new JLabel("ÁÖ¼Ò     ");
		hospitalAddressLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		hospitalAddressLabel.setBounds(20, 60, 120, 90);
		informationHospital_SectionPanel.add(hospitalAddressLabel);

		JLabel hospitalAddressOwnLabel = new JLabel("°æ±âµµ °í¾ç½Ã ´ö¾ç±¸ ÇàÁøµ¿ 1112");
		hospitalAddressOwnLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		hospitalAddressOwnLabel.setBounds(120, 60, 500, 90);
		informationHospital_SectionPanel.add(hospitalAddressOwnLabel);

		JLabel reservaionSubjectLabel = new JLabel("Áø·á°ú¸ñ");
		reservaionSubjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		reservaionSubjectLabel.setBounds(20, 100, 120, 90);
		informationHospital_SectionPanel.add(reservaionSubjectLabel);

		JLabel reservaionSubject_01OwnLabel = new JLabel("½Å°æ°ú) ÀÌÀ¯¿ø ÀÇ»ç");
		reservaionSubject_01OwnLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		reservaionSubject_01OwnLabel.setBounds(120, 100, 500, 90);
		informationHospital_SectionPanel.add(reservaionSubject_01OwnLabel);

		JLabel reservaionSubject_02OwnLabel = new JLabel("³»°ú) ±èÁø ÀÇ»ç");
		reservaionSubject_02OwnLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		reservaionSubject_02OwnLabel.setBounds(120, 140, 500, 90);
		informationHospital_SectionPanel.add(reservaionSubject_02OwnLabel);

		JLabel reservaionSubject_03OwnLabel = new JLabel("¿Ü°ú) °­ÇöÀÌ");
		reservaionSubject_03OwnLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		reservaionSubject_03OwnLabel.setBounds(120, 180, 500, 90);
		informationHospital_SectionPanel.add(reservaionSubject_03OwnLabel);

		JLabel reservationTime = new JLabel("Áø·á½Ã°£");
		reservationTime.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		reservationTime.setBounds(20, 220, 120, 90);
		informationHospital_SectionPanel.add(reservationTime);

		JLabel reservationTime_01OWN = new JLabel("¿ù¿äÀÏ  09 : 00 ~ 18 : 00  (Á¡½É½Ã°£  12 : 00 ~13 : 00 )");
		JLabel reservationTime_02OWN = new JLabel("È­¿äÀÏ  09 : 00 ~ 17 : 30  (Á¡½É½Ã°£  12 : 00 ~13 : 00 )");
		JLabel reservationTime_03OWN = new JLabel("¼ö¿äÀÏ  09 : 00 ~ 18 : 00  (Á¡½É½Ã°£  12 : 00 ~13 : 00 )");
		JLabel reservationTime_04OWN = new JLabel("¸ñ¿äÀÏ  09 : 00 ~ 17 : 30  (Á¡½É½Ã°£  12 : 00 ~13 : 00 )");
		JLabel reservationTime_05OWN = new JLabel("±Ý¿äÀÏ  09 : 00 ~ 18 : 00  (Á¡½É½Ã°£  12 : 00 ~13 : 00 )");
		JLabel reservationTime_06OWN = new JLabel("Åä¿äÀÏ  09 : 00 ~ 13 : 00");
		JLabel reservationTime_07OWN = new JLabel("ÀÏ¿äÀÏ ÈÞ¹«");

		reservationTime_01OWN.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		reservationTime_02OWN.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		reservationTime_03OWN.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		reservationTime_04OWN.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		reservationTime_05OWN.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		reservationTime_06OWN.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		reservationTime_07OWN.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));

		reservationTime_01OWN.setBounds(120, 220, 500, 90);
		reservationTime_02OWN.setBounds(120, 260, 500, 90);
		reservationTime_03OWN.setBounds(120, 300, 500, 90);
		reservationTime_04OWN.setBounds(120, 340, 500, 90);
		reservationTime_05OWN.setBounds(120, 380, 500, 90);
		reservationTime_06OWN.setBounds(120, 420, 500, 90);
		reservationTime_07OWN.setBounds(120, 460, 500, 90);

		informationHospital_SectionPanel.add(reservationTime_01OWN);
		informationHospital_SectionPanel.add(reservationTime_02OWN);
		informationHospital_SectionPanel.add(reservationTime_03OWN);
		informationHospital_SectionPanel.add(reservationTime_04OWN);
		informationHospital_SectionPanel.add(reservationTime_05OWN);
		informationHospital_SectionPanel.add(reservationTime_06OWN);
		informationHospital_SectionPanel.add(reservationTime_07OWN);

		JButton modifyPasswdButton = new JButton("ºñ¹Ð¹øÈ£ º¯°æ");
		modifyPasswdButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 17));
		modifyPasswdButton.setBackground(Color.gray);
		modifyPasswdButton.setForeground(Color.white);
		informationHospitalPanel.add(modifyPasswdButton);
		modifyPasswdButton.setBounds(897, 700, 180, 50);
		modifyPasswdButton.setBackground(Color.gray);

		
		 modifyPasswdButton.addActionListener(new ActionListener() {
	             @Override
	            public void actionPerformed(ActionEvent e) {
	            	 ChangePwd change = new ChangePwd();
	                 change.passwordChangeGUI();
	            }
		 });
		
		
		
		/////////////////////////////////////////////
		frame.add(informationHospitalPanel);
		frame.setTitle("°Å±ä¾î¶§: Inform-Hospital");
		frame.setVisible(true);
		frame.setSize(1240, 815);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		Information hospital = new Information();
		hospital.hospitalInformation();
	}
}
