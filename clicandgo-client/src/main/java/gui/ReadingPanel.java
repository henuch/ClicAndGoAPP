package gui;

import javax.swing.JPanel;

import model.EbookTableModel;

//import model.DiscountModelTable;

public class ReadingPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the application.
	 */
	public ReadingPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBounds(10, 20, 690, 110);
		jLabel1 = new javax.swing.JLabel();
		searchText = new javax.swing.JTextField();
		SearchBtn = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jPanel2.setBounds(10, 140, 520, 330);
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel3 = new javax.swing.JPanel();
		jPanel3.setBounds(550, 140, 150, 330);
		DownloadBtn = new javax.swing.JButton();
		DownloadBtn.setBounds(15, 96, 120, 23);

		setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"E-Library",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 14)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						51, 0, 0)), "Search",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 12),
				new java.awt.Color(102, 0, 0))); // NOI18N
		jPanel1.setLayout(null);

		jLabel1.setText("Type the name of an author or a book:");
		jPanel1.add(jLabel1);
		jLabel1.setBounds(20, 45, 309, 23);

		searchText.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				descriptionTextActionPerformed(evt);
			}
		});
		jPanel1.add(searchText);
		searchText.setBounds(484, 46, 95, 20);

		SearchBtn.setText("Search");
		SearchBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				// ReadingManagementDelegate.doLookUpEbook(searchText.getText());
				jTable1.setModel(new EbookTableModel(searchText.getText()));
				// DiscountDelegate.findDiscountByAllCriteria(descriptionText.getText(),Integer.parseInt(rateText.getText()),caleddarDebut.getDate(),calendarFin.getDate());
				// jTable1.setModel(new DiscountModelTable(
				// descriptionText.getText(),Integer.parseInt(rateText.getText()),caleddarDebut.getDate(),calendarFin.getDate()));

			}

		});
		setLayout(null);
		jPanel1.add(SearchBtn);
		SearchBtn.setBounds(589, 45, 91, 23);

		add(jPanel1);

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						51, 0, 0)), "List Of Ebooks and Articles",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 12),
				new java.awt.Color(102, 0, 0))); // NOI18N

		 jTable1.setModel(new EbookTableModel());
		 jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 490,
								Short.MAX_VALUE).addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 286,
								Short.MAX_VALUE).addContainerGap()));

		add(jPanel2);

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						51, 0, 0)), "Option",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 12),
				new java.awt.Color(102, 0, 0)));
		DownloadBtn.setText("download");

		DownloadBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				// int x = (int) jTable1.getValueAt(jTable1.getSelectedRow(),
				// 0);
				//
				// Discount category = DiscountDelegate.findDiscountById(x);
				// category.setDate_fin(datexy.getDate());
				// DiscountDelegate.updateDiscountDelegate(category);
				// jTable1.setModel(new DiscountModelTable());
			}
		});

		add(jPanel3);
		jPanel3.setLayout(null);
		jPanel3.add(DownloadBtn);
	}

	private void descriptionTextActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {

		 jTable1.setModel(new EbookTableModel(searchText.getText()));

	}

	// Variables declaration - do not modify
	private javax.swing.JButton SearchBtn;
	// private com.toedter.calendar.JDateChooser datexyzz;
	private javax.swing.JTextField searchText;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JButton DownloadBtn;
	// private com.toedter.calendar.JDateChooser datexy;

}
