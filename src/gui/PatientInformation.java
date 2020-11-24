package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import gui.History.TableCell;

public class PatientInformation {
	
	String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Hospital_GUI\\image\\";
	JFrame frame = new JFrame();
	
	
	class TableCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
        JButton button;
 
        public TableCell() {
            button = new JButton("�ڼ���");
            //button.addActionListener(e -> {  });
        }
 
        @Override
        public Object getCellEditorValue() {
            return null;
        }
 
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
            return button;
        }
 
        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
                int column) {
            return button;
        }
    }
	
	void patientInformationGUI() {// ȯ�� �� ����

		// ���
		JPanel patientInformationUpperBarPanel = new JPanel();
		patientInformationUpperBarPanel.setVisible(true);
		patientInformationUpperBarPanel.setLayout(null);
		patientInformationUpperBarPanel.setBounds(0, 0, 1240, 90);

		JLabel menuTitleLabel = new JLabel("�ű� �");
		menuTitleLabel.setFont(new Font("���� ���", Font.BOLD, 30));
		menuTitleLabel.setBounds(30, 25, 300, 50);
		patientInformationUpperBarPanel.add(menuTitleLabel);

		JButton menuWaitButton = new JButton("��� ��Ȳ");
		menuWaitButton.setBounds(200, 25, 125, 50);
		menuWaitButton.setBackground(Color.gray);
		menuWaitButton.setForeground(Color.white);
		menuWaitButton.setFont(new Font("���� ���", Font.PLAIN, 20));
		patientInformationUpperBarPanel.add(menuWaitButton);

		JButton menuHistoryButton = new JButton("���� ���");
		menuHistoryButton.setBounds(330, 25, 125, 50);
		menuHistoryButton.setBackground(Color.gray);
		menuHistoryButton.setForeground(Color.white);
		menuHistoryButton.setFont(new Font("���� ���", Font.PLAIN, 20));
		patientInformationUpperBarPanel.add(menuHistoryButton);

		JButton menuInformationButton = new JButton("���� ����");
		menuInformationButton.setBounds(460, 25, 125, 50);
		menuInformationButton.setBackground(Color.gray);
		menuInformationButton.setForeground(Color.white);
		menuInformationButton.setFont(new Font("���� ���", Font.PLAIN, 20));
		patientInformationUpperBarPanel.add(menuInformationButton);

		JButton menuGoBackButton = new JButton("");
		menuGoBackButton.setIcon(new ImageIcon(PATH + "goback_button.png"));
		menuGoBackButton.setBounds(1000, 20, 60, 60);

		JButton menuRefreshButton = new JButton("");
		menuRefreshButton.setIcon(new ImageIcon(PATH + "refresh_button.png"));
		menuRefreshButton.setBounds(1100, 20, 60, 60);

		patientInformationUpperBarPanel.add(menuGoBackButton);
		patientInformationUpperBarPanel.add(menuRefreshButton);

		// ����

		// ù��° �ڽ�: ���� �Ͻ�, ����, ���� ����, ����
		JPanel patientInformationPanel = new JPanel();
		patientInformationPanel.setVisible(true);
		patientInformationPanel.setLayout(null);
		patientInformationPanel.add(patientInformationUpperBarPanel);
		patientInformationPanel.setBackground(Color.WHITE);

		JLabel patientNameLabel = new JLabel("���̸� ȯ�� ���� ���");
		patientNameLabel.setFont(new Font("���� ���", Font.BOLD, 35));
		patientNameLabel.setBounds(60, 120, 500, 60);
		patientInformationPanel.add(patientNameLabel);

		JLabel patientPhoneNumberLabel = new JLabel("����ó) 010-3231-1313");
		patientPhoneNumberLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		patientPhoneNumberLabel.setBounds(500, 120, 300, 60);
		patientInformationPanel.add(patientPhoneNumberLabel);

		JPanel patientDetailInformationPanel = new JPanel();
		patientDetailInformationPanel.setVisible(true);
		patientInformationPanel.add(patientDetailInformationPanel);
		patientDetailInformationPanel.setBounds(60, 180, 1100, 120);

		JLabel getTreatmentTimeLabel = new JLabel("���� �Ͻ�");
		getTreatmentTimeLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		getTreatmentTimeLabel.setPreferredSize(new Dimension(200, 50));
		patientDetailInformationPanel.add(getTreatmentTimeLabel);

		JLabel getTreatmentTime_OwnLabel = new JLabel("2020-11-10 10:49");
		getTreatmentTime_OwnLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		getTreatmentTime_OwnLabel.setPreferredSize(new Dimension(300, 50));
		patientDetailInformationPanel.add(getTreatmentTime_OwnLabel);

		JLabel SymptomStartedTimeLabel = new JLabel("���� ����");
		SymptomStartedTimeLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		SymptomStartedTimeLabel.setPreferredSize(new Dimension(200, 50));
		patientDetailInformationPanel.add(SymptomStartedTimeLabel);

		JLabel SymptomstartedTime_OwnLabel = new JLabel("2020-11-08");
		SymptomstartedTime_OwnLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		SymptomstartedTime_OwnLabel.setPreferredSize(new Dimension(300, 50));
		patientDetailInformationPanel.add(SymptomstartedTime_OwnLabel);

		JLabel treatmentSubjectLabel = new JLabel("���� ����");
		treatmentSubjectLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		treatmentSubjectLabel.setPreferredSize(new Dimension(200, 50));
		patientDetailInformationPanel.add(treatmentSubjectLabel);

		JLabel treatmentSubject_OwnLabel = new JLabel("����) ���� �ǻ�");
		treatmentSubject_OwnLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		treatmentSubject_OwnLabel.setPreferredSize(new Dimension(300, 50));
		patientDetailInformationPanel.add(treatmentSubject_OwnLabel);

		JLabel symptomLabel = new JLabel("����");
		symptomLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		symptomLabel.setPreferredSize(new Dimension(200, 50));
		patientDetailInformationPanel.add(symptomLabel);

		JLabel symptom_OwnLabel = new JLabel("���� �Ӿ��� ��ȭ�ҷ� ���� ����");
		symptom_OwnLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		symptom_OwnLabel.setPreferredSize(new Dimension(300, 50));
		patientDetailInformationPanel.add(symptom_OwnLabel);

		// �ι�° -> ǥ
		String col[] = { "��ȣ", "���� �ǻ�", "���� ����", "���� ����", "���� �ð�", "�󼼺���" };

		Object values[][] = { { "1", "����", "����", "2020-11-15", "10:30", "" },
				{ "2", "����", "����", "2020-11-10", "10:49", "" }, { "3", "����", "����", "2020-11-02", "10:47", "" },
				{ "4", "����", "����", "2020-10-05", "11:08", "" } };

		JTable patientInformationTable = new JTable(values, col);
		patientInformationTable.setRowHeight(40);

		// ���̺� ���� ��� ����
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);

		TableColumnModel tcm = patientInformationTable.getColumnModel();

		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
		}

		JScrollPane pane = new JScrollPane(patientInformationTable);
		pane.setBounds(60, 350, 1100, 350);

		patientInformationPanel.add(pane);
 		
        patientInformationTable.getColumnModel().getColumn(5).setCellRenderer(new TableCell());
        patientInformationTable.getColumnModel().getColumn(5).setCellEditor(new TableCell());

		
		//////////////////////////////////////////////////////////////////
		
		frame.add(patientInformationPanel);
		frame.setTitle("�ű�: Inform-Hospital");
		frame.setVisible(true);
		frame.setSize(1240, 815);
		frame.setResizable(false); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		PatientInformation pInform = new PatientInformation();
		pInform.patientInformationGUI();
	}
}
