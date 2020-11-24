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
            button = new JButton("자세히");
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
	
	void patientInformationGUI() {// 환자 상세 정보

		// 상단
		JPanel patientInformationUpperBarPanel = new JPanel();
		patientInformationUpperBarPanel.setVisible(true);
		patientInformationUpperBarPanel.setLayout(null);
		patientInformationUpperBarPanel.setBounds(0, 0, 1240, 90);

		JLabel menuTitleLabel = new JLabel("거긴 어때");
		menuTitleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		menuTitleLabel.setBounds(30, 25, 300, 50);
		patientInformationUpperBarPanel.add(menuTitleLabel);

		JButton menuWaitButton = new JButton("대기 현황");
		menuWaitButton.setBounds(200, 25, 125, 50);
		menuWaitButton.setBackground(Color.gray);
		menuWaitButton.setForeground(Color.white);
		menuWaitButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		patientInformationUpperBarPanel.add(menuWaitButton);

		JButton menuHistoryButton = new JButton("진료 기록");
		menuHistoryButton.setBounds(330, 25, 125, 50);
		menuHistoryButton.setBackground(Color.gray);
		menuHistoryButton.setForeground(Color.white);
		menuHistoryButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		patientInformationUpperBarPanel.add(menuHistoryButton);

		JButton menuInformationButton = new JButton("병원 정보");
		menuInformationButton.setBounds(460, 25, 125, 50);
		menuInformationButton.setBackground(Color.gray);
		menuInformationButton.setForeground(Color.white);
		menuInformationButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		patientInformationUpperBarPanel.add(menuInformationButton);

		JButton menuGoBackButton = new JButton("");
		menuGoBackButton.setIcon(new ImageIcon(PATH + "goback_button.png"));
		menuGoBackButton.setBounds(1000, 20, 60, 60);

		JButton menuRefreshButton = new JButton("");
		menuRefreshButton.setIcon(new ImageIcon(PATH + "refresh_button.png"));
		menuRefreshButton.setBounds(1100, 20, 60, 60);

		patientInformationUpperBarPanel.add(menuGoBackButton);
		patientInformationUpperBarPanel.add(menuRefreshButton);

		// 메인

		// 첫번째 박스: 진료 일시, 과목, 증상 발현, 증상
		JPanel patientInformationPanel = new JPanel();
		patientInformationPanel.setVisible(true);
		patientInformationPanel.setLayout(null);
		patientInformationPanel.add(patientInformationUpperBarPanel);
		patientInformationPanel.setBackground(Color.WHITE);

		JLabel patientNameLabel = new JLabel("강이름 환자 진료 기록");
		patientNameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		patientNameLabel.setBounds(60, 120, 500, 60);
		patientInformationPanel.add(patientNameLabel);

		JLabel patientPhoneNumberLabel = new JLabel("연락처) 010-3231-1313");
		patientPhoneNumberLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		patientPhoneNumberLabel.setBounds(500, 120, 300, 60);
		patientInformationPanel.add(patientPhoneNumberLabel);

		JPanel patientDetailInformationPanel = new JPanel();
		patientDetailInformationPanel.setVisible(true);
		patientInformationPanel.add(patientDetailInformationPanel);
		patientDetailInformationPanel.setBounds(60, 180, 1100, 120);

		JLabel getTreatmentTimeLabel = new JLabel("진료 일시");
		getTreatmentTimeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		getTreatmentTimeLabel.setPreferredSize(new Dimension(200, 50));
		patientDetailInformationPanel.add(getTreatmentTimeLabel);

		JLabel getTreatmentTime_OwnLabel = new JLabel("2020-11-10 10:49");
		getTreatmentTime_OwnLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		getTreatmentTime_OwnLabel.setPreferredSize(new Dimension(300, 50));
		patientDetailInformationPanel.add(getTreatmentTime_OwnLabel);

		JLabel SymptomStartedTimeLabel = new JLabel("증상 발현");
		SymptomStartedTimeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		SymptomStartedTimeLabel.setPreferredSize(new Dimension(200, 50));
		patientDetailInformationPanel.add(SymptomStartedTimeLabel);

		JLabel SymptomstartedTime_OwnLabel = new JLabel("2020-11-08");
		SymptomstartedTime_OwnLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		SymptomstartedTime_OwnLabel.setPreferredSize(new Dimension(300, 50));
		patientDetailInformationPanel.add(SymptomstartedTime_OwnLabel);

		JLabel treatmentSubjectLabel = new JLabel("진료 과목");
		treatmentSubjectLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		treatmentSubjectLabel.setPreferredSize(new Dimension(200, 50));
		patientDetailInformationPanel.add(treatmentSubjectLabel);

		JLabel treatmentSubject_OwnLabel = new JLabel("내과) 김진 의사");
		treatmentSubject_OwnLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		treatmentSubject_OwnLabel.setPreferredSize(new Dimension(300, 50));
		patientDetailInformationPanel.add(treatmentSubject_OwnLabel);

		JLabel symptomLabel = new JLabel("증상");
		symptomLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		symptomLabel.setPreferredSize(new Dimension(200, 50));
		patientDetailInformationPanel.add(symptomLabel);

		JLabel symptom_OwnLabel = new JLabel("복통 속쓰림 소화불량 설사 구토");
		symptom_OwnLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		symptom_OwnLabel.setPreferredSize(new Dimension(300, 50));
		patientDetailInformationPanel.add(symptom_OwnLabel);

		// 두번째 -> 표
		String col[] = { "번호", "진료 의사", "진료 과목", "진료 일자", "진료 시간", "상세보기" };

		Object values[][] = { { "1", "김진", "내과", "2020-11-15", "10:30", "" },
				{ "2", "김진", "내과", "2020-11-10", "10:49", "" }, { "3", "김진", "내과", "2020-11-02", "10:47", "" },
				{ "4", "김진", "내과", "2020-10-05", "11:08", "" } };

		JTable patientInformationTable = new JTable(values, col);
		patientInformationTable.setRowHeight(40);

		// 테이블 내용 가운데 정렬
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
		frame.setTitle("거긴어때: Inform-Hospital");
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
