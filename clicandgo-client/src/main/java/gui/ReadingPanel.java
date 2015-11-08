package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
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
		jPanelSearch = new javax.swing.JPanel();
		jPanelSearch.setBounds(10, 20, 690, 73);
		DescriptionTextSearch = new javax.swing.JLabel();
		searchText = new javax.swing.JTextField();
		SearchBtn = new javax.swing.JButton();
		jPannelLibrary = new javax.swing.JPanel();
		jPannelLibrary.setBounds(10, 108, 520, 330);
		jScrollLibrary = new javax.swing.JScrollPane();
		jScrollLibrary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getComponent());

			}
		});
		jTable1 = new javax.swing.JTable();
		jPanelOptions = new javax.swing.JPanel();
		jPanelOptions.setBounds(550, 108, 150, 73);
		DownloadBtn = new javax.swing.JButton();
		DownloadBtn.setBounds(10, 40, 130, 23);

		setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"E-Library",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 14)));

		jPanelSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						51, 0, 0)), "Search",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 12),
				new java.awt.Color(102, 0, 0))); // NOI18N
		jPanelSearch.setLayout(null);

		DescriptionTextSearch.setText("Type the name of an author or a book:");
		jPanelSearch.add(DescriptionTextSearch);
		DescriptionTextSearch.setBounds(10, 28, 309, 23);

		searchText.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				descriptionTextActionPerformed(evt);
			}
		});
		jPanelSearch.add(searchText);
		searchText.setBounds(469, 29, 95, 20);

		SearchBtn.setText("Search");
		SearchBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTable1.setModel(new EbookTableModel(searchText.getText()));
			}

		});
		setLayout(null);
		jPanelSearch.add(SearchBtn);
		SearchBtn.setBounds(589, 28, 91, 23);

		add(jPanelSearch);

		jPannelLibrary.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						51, 0, 0)), "List Of Ebooks and Articles",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 12),
				new java.awt.Color(102, 0, 0))); // NOI18N

		jTable1.setModel(new EbookTableModel());
		jScrollLibrary.setViewportView(jTable1);

		javax.swing.GroupLayout gl_jPannelLibrary = new javax.swing.GroupLayout(
				jPannelLibrary);
		jPannelLibrary.setLayout(gl_jPannelLibrary);
		gl_jPannelLibrary
				.setHorizontalGroup(gl_jPannelLibrary
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gl_jPannelLibrary
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jScrollLibrary,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												490, Short.MAX_VALUE)
										.addContainerGap()));
		gl_jPannelLibrary
				.setVerticalGroup(gl_jPannelLibrary
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gl_jPannelLibrary
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jScrollLibrary,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												286, Short.MAX_VALUE)
										.addContainerGap()));

		add(jPannelLibrary);

		jPanelOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(
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

		add(jPanelOptions);
		jPanelOptions.setLayout(null);
		jPanelOptions.add(DownloadBtn);

		JLabel labelDownload = new JLabel();
		labelDownload.setText("Select to download");
		labelDownload.setBounds(20, 11, 109, 32);
		jPanelOptions.add(labelDownload);
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
	private javax.swing.JLabel DescriptionTextSearch;
	private javax.swing.JPanel jPanelSearch;
	private javax.swing.JPanel jPannelLibrary;
	private javax.swing.JPanel jPanelOptions;
	private javax.swing.JScrollPane jScrollLibrary;
	private javax.swing.JTable jTable1;
	private javax.swing.JButton DownloadBtn;
}
