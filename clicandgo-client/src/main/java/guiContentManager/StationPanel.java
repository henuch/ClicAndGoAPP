//package guiContentManager;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//import BusinessDelegator.StationDelegate;
//
//import javax.swing.JScrollPane;
//import javax.swing.JTabbedPane;
//import javax.swing.JTable;
//
//import model.StationTableModel;
//
//public class StationPanel extends JPanel {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private JTextField textField_1;
//	private JTable table;
//
//	public StationPanel() {
//
//		intialize();
//	}
//
//	/**
//	 * Create the panel.
//	 */
//
//	public void intialize() {
//
//		JPanel panelSearch = new JPanel();
//		JButton button = new JButton();
//	
//		
//		setToolTipText("");
//		setLayout(null);
//
//		panelSearch.setBounds(20, 27, 565, 94);
//		add(panelSearch);
//
//		setBorder(javax.swing.BorderFactory.createTitledBorder(null,
//				"Station Management",
//				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
//				javax.swing.border.TitledBorder.DEFAULT_POSITION,
//				new java.awt.Font("Arial", 2, 14)));
//
//		panelSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(
//				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
//						51, 0, 0)), "Search",
//				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
//				javax.swing.border.TitledBorder.DEFAULT_POSITION,
//				new java.awt.Font("Arial", 2, 12),
//				new java.awt.Color(102, 0, 0))); // NOI18N
//		panelSearch.setLayout(null);
//
//	
//
//		
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				StationDelegate.findStationByStationName(textField_1.getText());
//			}
//		});
//		button.setText("Search");
//		button.setBounds(447, 37, 91, 23);
//		panelSearch.add(button);
//
//		JLabel lblTypeTheStation = new JLabel();
//		lblTypeTheStation.setText("type the station name");
//		lblTypeTheStation.setBounds(10, 35, 218, 20);
//		panelSearch.add(lblTypeTheStation);
//		
//		textField_1 = new JTextField();
//		textField_1.setBounds(346, 38, 95, 20);
//		panelSearch.add(textField_1);
//		
//		JPanel jpanelStations = new JPanel();
//		jpanelStations.setBounds(20, 132, 410, 310);
//		javax.swing.GroupLayout gl_jpanelStations = new javax.swing.GroupLayout(
//				jpanelStations);
//		jpanelStations.setLayout(gl_jpanelStations);
//		gl_jpanelStations.setHorizontalGroup(gl_jpanelStations.createParallelGroup(
//				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
//				gl_jpanelStations
//						.createSequentialGroup()
//						.addContainerGap()
//						.addComponent(scrollPane,
//								javax.swing.GroupLayout.DEFAULT_SIZE, 490,
//								Short.MAX_VALUE).addContainerGap()));
//		gl_jpanelStations.setVerticalGroup(gl_jpanelStations.createParallelGroup(
//				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
//				gl_jpanelStations
//						.createSequentialGroup()
//						.addContainerGap()
//						.addComponent(scrollPane,
//								javax.swing.GroupLayout.DEFAULT_SIZE, 286,
//								Short.MAX_VALUE).addContainerGap()));
//		
//		add(jpanelStations);
//		jpanelStations.setBorder(javax.swing.BorderFactory.createTitledBorder(
//				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
//						51, 0, 0)), "List Of Stations",
//				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
//				javax.swing.border.TitledBorder.DEFAULT_POSITION,
//				new java.awt.Font("Arial", 2, 12),
//				new java.awt.Color(102, 0, 0)));
//		jpanelStations.setLayout(null);
//		
//		
//		scrollPane.setBounds(74, 37, 265, 247);
//		jpanelStations.add(scrollPane);
////		table.setModel(new StationTableModel());
//		 scrollPane.setViewportView(table);
//		table = new JTable();
//		scrollPane.setViewportView(table);
//	}
//	JScrollPane scrollPane = new JScrollPane();
//}
