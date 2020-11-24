package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class ReservationToday {

	String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Hospital_GUI\\image\\";
	JFrame frame = new JFrame();

	class TableCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
		JButton button;

		public TableCell() {
			button = new JButton("자세히");
			// button.addActionListener(e -> { });
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

	//////////////////////////////////////////////////////
	// 대기 현황
	void reservationTodayGUI() {

		// 상단 바
		JPanel reservationTodayUpperBarPanel = new JPanel();
		reservationTodayUpperBarPanel.setVisible(true);
		reservationTodayUpperBarPanel.setLayout(null);
		reservationTodayUpperBarPanel.setBounds(0, 0, 1240, 90);

		JLabel menuTitleLabel = new JLabel("거긴 어때");
		menuTitleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		menuTitleLabel.setBounds(30, 25, 300, 50);
		reservationTodayUpperBarPanel.add(menuTitleLabel);

		JButton menuWaitButton = new JButton("대기 현황");
		menuWaitButton.setBounds(200, 25, 125, 50);
		menuWaitButton.setBackground(Color.gray);
		menuWaitButton.setForeground(Color.white);
		menuWaitButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		reservationTodayUpperBarPanel.add(menuWaitButton);

		JButton menuHistoryButton = new JButton("진료 기록");
		menuHistoryButton.setBounds(330, 25, 125, 50);
		menuHistoryButton.setBackground(Color.gray);
		menuHistoryButton.setForeground(Color.white);
		menuHistoryButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		reservationTodayUpperBarPanel.add(menuHistoryButton);

		JButton menuHospitalInformationButton = new JButton("병원 정보");
		menuHospitalInformationButton.setBounds(460, 25, 125, 50);
		menuHospitalInformationButton.setBackground(Color.gray);
		menuHospitalInformationButton.setForeground(Color.white);
		menuHospitalInformationButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		reservationTodayUpperBarPanel.add(menuHospitalInformationButton);

		JButton menuRefreshButton = new JButton("");
		menuRefreshButton.setIcon(new ImageIcon(PATH + "refresh_button.png"));
		menuRefreshButton.setBounds(1100, 20, 60, 60);

		reservationTodayUpperBarPanel.add(menuRefreshButton);

		// 메인 - 대기 현황
		JPanel researvationTodayPanel = new JPanel();
		researvationTodayPanel.setVisible(true);
		researvationTodayPanel.setLayout(null);
		researvationTodayPanel.setBackground(Color.white);

		researvationTodayPanel.add(reservationTodayUpperBarPanel);

		// 테이블
		String col[] = { "번호", "이름", "연락처", "예약 시간", "" };

		Object values[][] = { { "1", "강이름", "010-9292-3939", "10:30", "" },
				{ "2", "김예림", "010-1231-1313 ", "10:30", "" }, { "3", "최주영", "010-2391-6042", "10:30", "" },
				{ "4", "전후준", "010-3932-1920", "10:30", "" }, { "", "", "", "", "" },
				{ "1", "송인봉", "010-7237-8844", "11:00", "" }, { "2", "강지백", "010-1447-6452", "11:00", "" },
				{ "3", "이현화", "010-9457-2247", "11:00", "" }, { "", "", "", "", "" },
				{ "1", "박형식", "010-7743-3355", "11:30", "" }, { "2", "강우주", "010-5411-5545", "11:30", "" },
				{ "", "", "", "", "" }, { "1", "나현석", "010-3341-2220", "12:00", "" },
				{ "2", "이제형", "010-7593-4124", "12:00", "" }, { "3", "도현아", "010-1591-3452", "12:00", "" },
				{ "4", "김준휘", "010-5531-5331", "12:00", "" }, { "", "", "", "", "" }, };

		JTable reservationTodayTable = new JTable(values, col);
		reservationTodayTable.setRowHeight(40);

		// 테이블 내용 가운데 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);

		TableColumnModel tcm = reservationTodayTable.getColumnModel();

		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
		}

		JScrollPane pane = new JScrollPane(reservationTodayTable);
		pane.setBounds(60, 180, 1100, 510);

		reservationTodayTable.getColumnModel().getColumn(4).setCellRenderer(new TableCell());
		reservationTodayTable.getColumnModel().getColumn(4).setCellEditor(new TableCell());

		researvationTodayPanel.add(pane);
		researvationTodayPanel.setBackground(Color.white);

		////////////////////////////////////////////////////////////////////////
		frame.add(researvationTodayPanel);

		frame.setTitle("거긴어때: Inform-Hospital");
		frame.setVisible(true);
		frame.setSize(1240, 800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ReservationToday wait = new ReservationToday();
		wait.reservationTodayGUI();
	}

}
