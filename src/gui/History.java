package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumSet;

import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class History {
	String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Hospital_GUI\\image\\";
	JFrame frame = new JFrame();

	class TableCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
        JButton button;
        
        //이벤트 리스너 연결
        public TableCell() {
            button = new JButton("자세히");
            button.addActionListener(e -> { 
            	PatientInformation patientInformation = new PatientInformation();
            	patientInformation.patientInformationGUI();
            });
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
	
	void historyReservationGUI() {// 진료 기록

		// 상단
		JPanel historyReservationUpperBarPanel = new JPanel();
		historyReservationUpperBarPanel.setVisible(true);
		historyReservationUpperBarPanel.setLayout(null);
		historyReservationUpperBarPanel.setBounds(0, 0, 1240, 90);

		JLabel MenuTitle = new JLabel("거긴 어때");
		MenuTitle.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		MenuTitle.setBounds(30, 25, 300, 50);
		historyReservationUpperBarPanel.add(MenuTitle);

		JButton MenuWait = new JButton("대기 현황");
		MenuWait.setBounds(200, 25, 125, 50);
		MenuWait.setBackground(Color.gray);
		MenuWait.setForeground(Color.white);
		MenuWait.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		historyReservationUpperBarPanel.add(MenuWait);

		JButton MenuHistory = new JButton("진료 기록");
		MenuHistory.setBounds(330, 25, 125, 50);
		MenuHistory.setBackground(Color.gray);
		MenuHistory.setForeground(Color.white);
		MenuHistory.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		historyReservationUpperBarPanel.add(MenuHistory);

		JButton MenuInform = new JButton("병원 정보");
		MenuInform.setBounds(460, 25, 125, 50);
		MenuInform.setBackground(Color.gray);
		MenuInform.setForeground(Color.white);
		MenuInform.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		historyReservationUpperBarPanel.add(MenuInform);

		JButton MenuRefresh = new JButton("");
		MenuRefresh.setIcon(new ImageIcon(PATH + "refresh_button.png"));
		MenuRefresh.setBounds(1100, 20, 60, 60);

		historyReservationUpperBarPanel.add(MenuRefresh);

		// 메인 - 진료 기록
		JPanel reservationHistoryPanel = new JPanel();
		reservationHistoryPanel.setVisible(true);
		reservationHistoryPanel.setLayout(null);
		reservationHistoryPanel.add(historyReservationUpperBarPanel);
		reservationHistoryPanel.setBackground(Color.white);

		JLabel reservationHistoryStartDayLabel = new JLabel("시작일: ");
		reservationHistoryStartDayLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		reservationHistoryStartDayLabel.setBounds(80, 70, 150, 120);
		reservationHistoryPanel.add(reservationHistoryStartDayLabel);

		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime();
		calendar.add(Calendar.YEAR, -50);
		Date start = calendar.getTime();
		calendar.add(Calendar.YEAR, 100);
		Date end = calendar.getTime();
		SpinnerDateModel dateModel = new SpinnerDateModel(value, start, end, Calendar.YEAR);

		JSpinner reservationHistoryStartDaySpinner = new JSpinner(dateModel);
		reservationHistoryStartDaySpinner
				.setEditor(new JSpinner.DateEditor(reservationHistoryStartDaySpinner, "yyyy-MM-dd"));
		reservationHistoryStartDaySpinner.setBounds(170, 113, 150, 35);
		reservationHistoryPanel.add(reservationHistoryStartDaySpinner);

		JLabel reservationHistoryEndDayLabel = new JLabel("~    종료일: ");
		reservationHistoryEndDayLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		reservationHistoryEndDayLabel.setBounds(350, 70, 150, 120);
		reservationHistoryPanel.add(reservationHistoryEndDayLabel);

		JSpinner reservationHistoryEndDaySpinner = new JSpinner(dateModel);
		reservationHistoryEndDaySpinner
				.setEditor(new JSpinner.DateEditor(reservationHistoryEndDaySpinner, "yyyy-MM-dd"));
		reservationHistoryEndDaySpinner.setBounds(480, 113, 150, 35);
		reservationHistoryPanel.add(reservationHistoryEndDaySpinner);

		String[] select = { "이름", "연락처", "진료 의사", "진료 시간" };
		JComboBox reservationHistoryBox = new JComboBox(select);
		reservationHistoryBox.setBounds(700, 113, 100, 35);
		reservationHistoryPanel.add(reservationHistoryBox);

		JTextField reservationHistorySearchTextField = new JTextField(20);
		reservationHistorySearchTextField.setBounds(830, 113, 200, 35);
		reservationHistoryPanel.add(reservationHistorySearchTextField);

		JButton reservationHistorySearchButton = new JButton("검색");
		reservationHistorySearchButton.setBounds(1050, 113, 80, 35);
		reservationHistoryPanel.add(reservationHistorySearchButton);

		
		
		
		//테이블
		String col[] = { "번호", "환자 이름", "연락처", "진료 의사", "진료 과목", "진료 일자", "진료 시간", "상세 보기" };

 		Object values[][] = { { "11", "박호인", "010-8882-8726", "김진", "내과", "2020-11-10", "10:30", ""},
 				{ "12", "임채린", "010-3141-5926", "이유원", "신경과", "2020-11-10", "10:37", "" },
 				{ "13", "강이름", "010-9292-3939", "김진", "내과", "2020-11-10", "10:49", "" },
 				{ "14", "김예림", "010-3231-1313", "이유원", "신경과", "2020-11-10", "11:02", "" },
 				{ "15", "최주영", "010-2391-6042", "이유원", "신경과", "2020-11-10", "11:12", "" },
 				{ "16", "전후준", "010-3932-1920", "김진", "내과", "2020-11-10", "11:23", "" },
 				{ "17", "송대우", "010-4455-8754", "김진", "내과", "2020-11-10", "11:34", "" },
 				{ "18", "윤차빈", "010-8839-2938", "강현이", "외과", "2020-11-10", "11:45", "" },
 				{ "19", "송인봉", "010-7237-9944", "이유원", "신경과", "2020-11-10", "13:00", "" },
 				{ "20", "안성우", "010-4455-8754", "김진", "내과", "2020-11-10", "13:02", "" },

 				{ "21", "김정현", "010-4422-3454", "김진", "내과", "2020-11-10", "13:07", "" },
 				{ "22", "박차현", "010-8539-2528", "강현이", "외과", "2020-11-10", "13:16", "" },
 				{ "23", "도훈하", "010-5037-9244", "이유원", "신경과", "2020-11-10", "13:25", "" },
 				{ "24", "안희윤", "010-5535-8524", "김진", "내과", "2020-11-10", "13:42", "" } 
 				};

 		JTable table = new JTable(values, col);
 		table.setRowHeight(40);

 		
 		// 테이블 내용 가운데 정렬
 		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
 		dtcr.setHorizontalAlignment(SwingConstants.CENTER);

 		TableColumnModel tcm = table.getColumnModel();

 		for (int i = 0; i < tcm.getColumnCount(); i++) {
 			tcm.getColumn(i).setCellRenderer(dtcr);
 		}		
 		
 		JScrollPane pane = new JScrollPane(table);
 		pane.setBounds(60, 180, 1100, 510);
 		
        table.getColumnModel().getColumn(7).setCellRenderer(new TableCell());
        table.getColumnModel().getColumn(7).setCellEditor(new TableCell());
 
       
		reservationHistoryPanel.add(pane);
		reservationHistoryPanel.setBackground(Color.white);
		
		//////////////////////////////////////////////l
		frame.add(reservationHistoryPanel);
		frame.setTitle("거긴어때: Inform-Hospital");
		frame.setVisible(true);
		frame.setSize(1240, 815);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		History his = new History();
		his.historyReservationGUI();
	}
}
