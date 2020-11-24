package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Information {

	String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Hospital_GUI\\image\\";
	JFrame frame = new JFrame();

	public void hospitalInformation() { // ���� ����
		// ���
		JPanel hospitalInformationUpperBarPanel = new JPanel();
		hospitalInformationUpperBarPanel.setVisible(true);
		hospitalInformationUpperBarPanel.setLayout(null);
		hospitalInformationUpperBarPanel.setBounds(0, 0, 1240, 90);

		JLabel menuTitleLabel = new JLabel("�ű� �");
		menuTitleLabel.setFont(new Font("���� ���", Font.BOLD, 30));
		menuTitleLabel.setBounds(30, 25, 300, 50);
		hospitalInformationUpperBarPanel.add(menuTitleLabel);

		JButton menuWaitButton = new JButton("��� ��Ȳ");
		menuWaitButton.setBounds(200, 25, 125, 50);
		menuWaitButton.setBackground(Color.gray);
		menuWaitButton.setForeground(Color.white);
		menuWaitButton.setFont(new Font("���� ���", Font.PLAIN, 20));
		hospitalInformationUpperBarPanel.add(menuWaitButton);

		JButton menuHistoryButton = new JButton("���� ���");
		menuHistoryButton.setBounds(330, 25, 125, 50);
		menuHistoryButton.setBackground(Color.gray);
		menuHistoryButton.setForeground(Color.white);
		menuHistoryButton.setFont(new Font("���� ���", Font.PLAIN, 20));
		hospitalInformationUpperBarPanel.add(menuHistoryButton);

		JButton menuInformationButton = new JButton("���� ����");
		menuInformationButton.setBounds(460, 25, 125, 50);
		menuInformationButton.setBackground(Color.gray);
		menuInformationButton.setForeground(Color.white);
		menuInformationButton.setFont(new Font("���� ���", Font.PLAIN, 20));
		hospitalInformationUpperBarPanel.add(menuInformationButton);

		JButton menuRefreshButton = new JButton("");
		menuRefreshButton.setIcon(new ImageIcon(PATH + "refresh_button.png"));
		menuRefreshButton.setBounds(1100, 20, 60, 60);

		hospitalInformationUpperBarPanel.add(menuRefreshButton);

		// ����
		JPanel informationHospitalPanel = new JPanel();
		informationHospitalPanel.setVisible(true);
		informationHospitalPanel.setLayout(null);
		informationHospitalPanel.add(hospitalInformationUpperBarPanel);
		informationHospitalPanel.setBackground(Color.white);

		JLabel hospitalNameLabel = new JLabel("������:");
		hospitalNameLabel.setFont(new Font("���� ���", Font.BOLD, 35));
		hospitalNameLabel.setBounds(80, 80, 170, 90);
		informationHospitalPanel.add(hospitalNameLabel);

		JLabel hospitalNameOwnLabel = new JLabel("���� �ǿ�");
		hospitalNameOwnLabel.setFont(new Font("���� ���", Font.BOLD, 35));
		hospitalNameOwnLabel.setBounds(220, 80, 200, 90);
		informationHospitalPanel.add(hospitalNameOwnLabel);

		// ���� �ڽ�
		JPanel informationHospital_SectionPanel = new JPanel();
		informationHospital_SectionPanel.setVisible(true);
		informationHospital_SectionPanel.setLayout(null);
		informationHospital_SectionPanel.setBounds(80, 160, 1000, 530);
		informationHospitalPanel.add(informationHospital_SectionPanel);

		JLabel hospitalIDLabel = new JLabel("���̵�");
		hospitalIDLabel.setFont(new Font("���� ���", Font.BOLD, 23));
		hospitalIDLabel.setBounds(20, -20, 120, 90);
		informationHospital_SectionPanel.add(hospitalIDLabel);

		JLabel hospitalIDOWNLabel = new JLabel("hrms_008");
		hospitalIDOWNLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		hospitalIDOWNLabel.setBounds(120, -20, 500, 90);
		informationHospital_SectionPanel.add(hospitalIDOWNLabel);

		JLabel hospitalmNumberLabel = new JLabel("����ó     ");
		hospitalmNumberLabel.setFont(new Font("���� ���", Font.BOLD, 23));
		hospitalmNumberLabel.setBounds(20, 20, 120, 90);
		informationHospital_SectionPanel.add(hospitalmNumberLabel);

		JLabel hospitalmNumberOwnLabel = new JLabel("010-7442-6684");
		hospitalmNumberOwnLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		hospitalmNumberOwnLabel.setBounds(120, 20, 500, 90);
		informationHospital_SectionPanel.add(hospitalmNumberOwnLabel);

		JLabel hospitalAddressLabel = new JLabel("�ּ�     ");
		hospitalAddressLabel.setFont(new Font("���� ���", Font.BOLD, 23));
		hospitalAddressLabel.setBounds(20, 60, 120, 90);
		informationHospital_SectionPanel.add(hospitalAddressLabel);

		JLabel hospitalAddressOwnLabel = new JLabel("��⵵ ���� ���籸 ������ 1112");
		hospitalAddressOwnLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		hospitalAddressOwnLabel.setBounds(120, 60, 500, 90);
		informationHospital_SectionPanel.add(hospitalAddressOwnLabel);

		JLabel reservaionSubjectLabel = new JLabel("�������");
		reservaionSubjectLabel.setFont(new Font("���� ���", Font.BOLD, 23));
		reservaionSubjectLabel.setBounds(20, 100, 120, 90);
		informationHospital_SectionPanel.add(reservaionSubjectLabel);

		JLabel reservaionSubject_01OwnLabel = new JLabel("�Ű��) ������ �ǻ�");
		reservaionSubject_01OwnLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		reservaionSubject_01OwnLabel.setBounds(120, 100, 500, 90);
		informationHospital_SectionPanel.add(reservaionSubject_01OwnLabel);

		JLabel reservaionSubject_02OwnLabel = new JLabel("����) ���� �ǻ�");
		reservaionSubject_02OwnLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		reservaionSubject_02OwnLabel.setBounds(120, 140, 500, 90);
		informationHospital_SectionPanel.add(reservaionSubject_02OwnLabel);

		JLabel reservaionSubject_03OwnLabel = new JLabel("�ܰ�) ������");
		reservaionSubject_03OwnLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		reservaionSubject_03OwnLabel.setBounds(120, 180, 500, 90);
		informationHospital_SectionPanel.add(reservaionSubject_03OwnLabel);

		JLabel reservationTime = new JLabel("����ð�");
		reservationTime.setFont(new Font("���� ���", Font.BOLD, 23));
		reservationTime.setBounds(20, 220, 120, 90);
		informationHospital_SectionPanel.add(reservationTime);

		JLabel reservationTime_01OWN = new JLabel("������  09 : 00 ~ 18 : 00  (���ɽð�  12 : 00 ~13 : 00 )");
		JLabel reservationTime_02OWN = new JLabel("ȭ����  09 : 00 ~ 17 : 30  (���ɽð�  12 : 00 ~13 : 00 )");
		JLabel reservationTime_03OWN = new JLabel("������  09 : 00 ~ 18 : 00  (���ɽð�  12 : 00 ~13 : 00 )");
		JLabel reservationTime_04OWN = new JLabel("�����  09 : 00 ~ 17 : 30  (���ɽð�  12 : 00 ~13 : 00 )");
		JLabel reservationTime_05OWN = new JLabel("�ݿ���  09 : 00 ~ 18 : 00  (���ɽð�  12 : 00 ~13 : 00 )");
		JLabel reservationTime_06OWN = new JLabel("�����  09 : 00 ~ 13 : 00");
		JLabel reservationTime_07OWN = new JLabel("�Ͽ��� �޹�");

		reservationTime_01OWN.setFont(new Font("���� ���", Font.PLAIN, 20));
		reservationTime_02OWN.setFont(new Font("���� ���", Font.PLAIN, 20));
		reservationTime_03OWN.setFont(new Font("���� ���", Font.PLAIN, 20));
		reservationTime_04OWN.setFont(new Font("���� ���", Font.PLAIN, 20));
		reservationTime_05OWN.setFont(new Font("���� ���", Font.PLAIN, 20));
		reservationTime_06OWN.setFont(new Font("���� ���", Font.PLAIN, 20));
		reservationTime_07OWN.setFont(new Font("���� ���", Font.PLAIN, 20));

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

		JButton modifyPasswdButton = new JButton("��й�ȣ ����");
		modifyPasswdButton.setFont(new Font("���� ���", Font.BOLD, 17));
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
		frame.setTitle("�ű�: Inform-Hospital");
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
