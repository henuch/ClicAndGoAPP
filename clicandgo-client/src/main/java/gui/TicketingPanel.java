package gui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicketingPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String[][] purchasesave = new String[5][1];
	double overralltotalsale = 0;
	int overralladult = 0;
	int overrallchild = 0;

	/**
	 * Create the panel.
	 */

	public TicketingPanel() {
		DateFormat dateFormat = new SimpleDateFormat("EEEE, MMMMM dd, yyyy");
		Date date = new Date();
		//lblmaindate.setText(dateFormat.format(date));
		initialize();
	}

	private void initialize() {

		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(200, 0, 240, 30);
		lblmaindate = new javax.swing.JLabel();
		lblmaindate.setBounds(180, 30, 250, 20);
		jLabel3 = new javax.swing.JLabel();
		jLabel3.setBounds(10, 130, 110, 15);
		cmbtime = new javax.swing.JComboBox();
		cmbtime.setBounds(100, 200, 100, 20);
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator1.setBounds(110, 140, 210, 2);
		jLabel4 = new javax.swing.JLabel();
		jLabel4.setBounds(10, 200, 90, 15);
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setBounds(10, 90, 80, 15);
		cmbmovies = new javax.swing.JComboBox();
		cmbmovies.setBounds(100, 90, 230, 20);
		jLabel6 = new javax.swing.JLabel();
		jLabel6.setBounds(10, 160, 80, 15);
		cmbdate = new javax.swing.JComboBox();
		cmbdate.setBounds(100, 160, 230, 20);
		jLabel7 = new javax.swing.JLabel();
		jLabel7.setBounds(10, 240, 110, 15);
		jSeparator2 = new javax.swing.JSeparator();
		jSeparator2.setBounds(100, 250, 220, 10);
		cmbadult = new javax.swing.JComboBox();
		cmbadult.setBounds(50, 270, 50, 20);
		jLabel8 = new javax.swing.JLabel();
		jLabel8.setBounds(10, 270, 40, 15);
		cmdchild = new javax.swing.JComboBox();
		cmdchild.setBounds(50, 300, 50, 20);
		jLabel9 = new javax.swing.JLabel();
		jLabel9.setBounds(10, 300, 40, 15);
		jLabel10 = new javax.swing.JLabel();
		jLabel10.setBounds(140, 310, 70, 14);
		jLabel12 = new javax.swing.JLabel();
		jLabel12.setBounds(140, 290, 80, 14);
		btnexit = new javax.swing.JButton();
		btnexit.setBounds(510, 340, 80, 23);
		btnviewtotalsale = new javax.swing.JButton();
		btnviewtotalsale.setBounds(220, 500, 140, 23);
		btncomputecharge = new javax.swing.JButton();
		btncomputecharge.setBounds(130, 340, 130, 23);
		btnexport = new javax.swing.JButton();
		btnexport.setBounds(400, 340, 100, 23);
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBounds(10, 370, 580, 120);
		lblTotalCOSTreport = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		lbladultticket = new javax.swing.JLabel();
		lblchildticketreport = new javax.swing.JLabel();
		lbltimeanddate = new javax.swing.JLabel();
		lbladultticketreport = new javax.swing.JLabel();
		lblmoviename1 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		lbltime = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		lblGCT = new javax.swing.JLabel();
		lblGCT.setBounds(240, 290, 90, 14);
		btnnew = new javax.swing.JButton();
		btnnew.setBounds(10, 340, 110, 23);
		btnsavepurchase = new javax.swing.JButton();
		btnsavepurchase.setBounds(270, 340, 120, 23);
		pngimagemovie = new javax.swing.JPanel();
		pngimagemovie.setBounds(380, 60, 190, 270);
		lblimage = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel18.setBounds(140, 270, 70, 14);
		lblTotal = new javax.swing.JLabel();
		lblTotal.setBounds(240, 310, 90, 14);
		lblsubtotal = new javax.swing.JLabel();
		lblsubtotal.setBounds(240, 270, 90, 14);

		setLayout(null);

		jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel1.setText("Clic And Go");
		add(jLabel1);

		lblmaindate.setFont(new java.awt.Font("Tahoma", 0, 12));
		lblmaindate.setForeground(new java.awt.Color(255, 0, 0));
		lblmaindate.setText("Time & Date");
		add(lblmaindate);

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel3.setForeground(new java.awt.Color(0, 102, 255));
		jLabel3.setText("Date & Time");
		add(jLabel3);

		cmbtime.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"2:00PM", "3:00PM", "3:30PM", "4:00PM", "5:30PM", "6:00PM",
				"7:30PM", "8:00PM", "8:30PM", "9:00PM" }));
		cmbtime.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmbtimeActionPerformed(evt);
			}
		});
		add(cmbtime);
		add(jSeparator1);

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel4.setText("Time of Show:");
		add(jLabel4);

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel5.setText("Select MOT: ");
		add(jLabel5);

		cmbmovies.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"X-Men: Days of Future Past", "Gone Girl", "If I Stay",
				"Walk of Shame", "God's Pocket", "Obvious Child",
				"Third Person", "I Origins", "A Most Wanted Man",
				"Dolphin Tale 2", "Monkey Kingdom",
				"When the Game Stands Tall", "Wish I Was Here",
				"Soaked in Bleach", "How to Train Your Dragon 2", " " }));
		cmbmovies.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cmbmoviesItemStateChanged(evt);
			}
		});
		cmbmovies.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmbmoviesActionPerformed(evt);
			}
		});
		add(cmbmovies);

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel6.setText("Date of Show:");
		add(jLabel6);

		cmbdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Sunday, April 20, 2014", "Monday, April 21, 2014",
				"Tuesday, April 22, 2014", "Wednesday, April 23, 2014",
				"Thursday, April 24, 2014", "Friday, April 25, 2014",
				"Saturday, April 26, 2014", "Sunday, April 27, 2014",
				"Monday, April 28, 2014", "Tuesday, April 29, 2014",
				"Wednesday, April 30, 2014", "Thursday, April 31, 2014",
				"Friday,May 1, 2014", "Saturday, May 2, 2014",
				"Sunday, May 3, 2014", "Monday, May 4, 2014",
				"Tuesday, May 5, 2014", "Wednesday, May 6, 2014",
				"Thursday, May 7, 2014", "Friday,May 8, 2014",
				"Saturday, May 9, 2014", " " }));
		cmbdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmbdateActionPerformed(evt);
			}
		});

		add(cmbdate);

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel7.setForeground(new java.awt.Color(0, 102, 255));
		jLabel7.setText("Ticket Quantity");
		add(jLabel7);
		add(jSeparator2);

		cmbadult.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " ", " " }));
		cmbadult.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmbadultActionPerformed(evt);
			}
		});
		add(cmbadult);

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel8.setText("Adult:");
		add(jLabel8);

		cmdchild.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
		cmdchild.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cmdchildActionPerformed(evt);
			}
		});
		add(cmdchild);

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel9.setText("Child:");
		add(jLabel9);

		jLabel10.setText("Total: ");
		add(jLabel10);

		jLabel12.setText("GCT(17.5%):");
		add(jLabel12);

		btnexit.setText("Exit");
		btnexit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnexitActionPerformed(evt);
			}
		});
		add(btnexit);

		btnviewtotalsale.setText("View Total Sales");
		btnviewtotalsale.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnviewtotalsaleActionPerformed(evt);
			}
		});
		add(btnviewtotalsale);

		btncomputecharge.setText("Compute Charge");
		btncomputecharge.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btncomputechargeActionPerformed(evt);
			}
		});
		add(btncomputecharge);

		btnexport.setText("Export");
		btnexport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnexportActionPerformed(evt);
			}
		});
		add(btnexport);

		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanel1.setLayout(null);

		lblTotalCOSTreport.setText(" ");
		jPanel1.add(lblTotalCOSTreport);
		lblTotalCOSTreport.setBounds(150, 90, 350, 14);

		jLabel14.setText("Movie Name: ");
		jPanel1.add(jLabel14);
		jLabel14.setBounds(10, 10, 100, 14);

		lbladultticket.setText("Adult Ticket(s): ");
		jPanel1.add(lbladultticket);
		lbladultticket.setBounds(10, 30, 110, 14);

		lblchildticketreport.setText(" ");
		jPanel1.add(lblchildticketreport);
		lblchildticketreport.setBounds(150, 50, 230, 14);

		lbltimeanddate.setText(" ");
		jPanel1.add(lbltimeanddate);
		lbltimeanddate.setBounds(150, 70, 390, 14);

		lbladultticketreport.setText(" ");
		jPanel1.add(lbladultticketreport);
		lbladultticketreport.setBounds(150, 30, 390, 14);

		lblmoviename1.setText(" ");
		jPanel1.add(lblmoviename1);
		lblmoviename1.setBounds(150, 10, 390, 14);

		jLabel19.setText("Child Ticket(s): ");
		jPanel1.add(jLabel19);
		jLabel19.setBounds(10, 50, 110, 14);

		lbltime.setText("Show Date & Time: ");
		jPanel1.add(lbltime);
		lbltime.setBounds(10, 70, 130, 14);

		jLabel13.setText("Total Cost: ");
		jPanel1.add(jLabel13);
		jLabel13.setBounds(10, 90, 140, 14);

		add(jPanel1);

		lblGCT.setText("0");
		add(lblGCT);

		btnnew.setText("New");
		btnnew.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnnewActionPerformed(evt);
			}
		});
		add(btnnew);

		btnsavepurchase.setText("Save Purchase");
		btnsavepurchase.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnsavepurchaseActionPerformed(evt);
			}
		});
		add(btnsavepurchase);

		pngimagemovie.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/aee.png")));
		lblimage.setText("");

		javax.swing.GroupLayout pngimagemovieLayout = new javax.swing.GroupLayout(
				pngimagemovie);
		pngimagemovie.setLayout(pngimagemovieLayout);
		pngimagemovieLayout.setHorizontalGroup(pngimagemovieLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						pngimagemovieLayout
								.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblimage,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										169,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(35, 35, 35)));
		pngimagemovieLayout.setVerticalGroup(pngimagemovieLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE,
						266, Short.MAX_VALUE));

		add(pngimagemovie);

		jLabel18.setText("Sub-Total: ");
		add(jLabel18);

		lblTotal.setText("0");
		add(lblTotal);

		lblsubtotal.setText("0");
		add(lblsubtotal);

	}

	private void cmbtimeActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void cmbmoviesActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void cmbdateActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void cmbadultActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void cmdchildActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void btnviewtotalsaleActionPerformed(java.awt.event.ActionEvent evt) {

		DecimalFormat formatter = new DecimalFormat("$#,###.00");
		JOptionPane.showMessageDialog(
				null,
				"Ticket Sold\n\n Adult: " + Integer.toString(overralladult)
						+ "     Child: " + Integer.toString(overrallchild)
						+ "\n\nTotal Sales: "
						+ formatter.format(overralltotalsale));
	}

	private void btncomputechargeActionPerformed(java.awt.event.ActionEvent evt) {
		final double AdultCONST = 600.00;
		final double ChildCONST = 350.00;
		double subtotal = 0;
		double childsubtotal = 0;
		double adultsubtotal = 0;
		double tax = 0;
		double total = 0;

		DecimalFormat formatter = new DecimalFormat("$#,###.00");

		String adultstring = (String) cmbadult.getSelectedItem();
		String childstring = (String) cmdchild.getSelectedItem();

		int adult = Integer.parseInt(adultstring);
		int child = Integer.parseInt(childstring);

		childsubtotal = child * ChildCONST;
		adultsubtotal = adult * AdultCONST;

		subtotal = childsubtotal + adultsubtotal;

		tax = 0.175 * subtotal;

		total = tax + subtotal;

		lblsubtotal.setText(formatter.format(subtotal));
		lblGCT.setText(formatter.format(tax));
		lblTotal.setText(formatter.format(total));

		overralltotalsale = overralltotalsale + total;
		overralladult = overralladult
				+ Integer.parseInt((String) cmbadult.getSelectedItem());
		overrallchild = overrallchild
				+ Integer.parseInt((String) cmdchild.getSelectedItem());

	}

	private void btnsavepurchaseActionPerformed(java.awt.event.ActionEvent evt) {
		lblmoviename1.setText((String) cmbmovies.getSelectedItem());
		lbladultticketreport.setText((String) cmbadult.getSelectedItem());
		lblchildticketreport.setText((String) cmdchild.getSelectedItem());
		lbltimeanddate.setText((String) cmbdate.getSelectedItem() + " :: "
				+ (String) cmbtime.getSelectedItem());
		lblTotalCOSTreport.setText(lblTotal.getText());

		purchasesave[0][0] = "Movie Name: "
				+ (String) cmbmovies.getSelectedItem();
		purchasesave[1][0] = "Adult Ticket(s): "
				+ (String) cmbadult.getSelectedItem();
		purchasesave[2][0] = "Child Ticket(s): "
				+ (String) cmdchild.getSelectedItem();
		purchasesave[3][0] = "Show Date & Time: "
				+ (String) cmbdate.getSelectedItem() + " :: "
				+ (String) cmbtime.getSelectedItem();
		purchasesave[4][0] = "Total Cost: " + lblTotal.getText();
	}

	private void btnexportActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("movie.txt",
					true));
			out.newLine();
			for (int i = 0; i < 5; i++) {
				out.write(purchasesave[i][0]);
				out.newLine();
			}

			out.close();

			JOptionPane
					.showMessageDialog(null, "successfully exported to file");
		} catch (IOException e) {
			System.out.println("Exception ");
		}
	}

	private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {
		lblmoviename1.setText(" ");
		lbladultticketreport.setText(" ");
		lblchildticketreport.setText(" ");
		lbltimeanddate.setText(" ");
		lblTotalCOSTreport.setText(" ");

		cmbmovies.setSelectedIndex(0);
		cmbadult.setSelectedIndex(0);
		cmdchild.setSelectedIndex(0);
		cmbdate.setSelectedIndex(0);
		cmbtime.setSelectedIndex(0);
		lblTotal.setText("0");
		lblGCT.setText("0");
		lblsubtotal.setText("0");
	}

	private void cmbmoviesItemStateChanged(java.awt.event.ItemEvent evt) {
	}

	private javax.swing.JButton btncomputecharge;
	private javax.swing.JButton btnexit;
	private javax.swing.JButton btnexport;
	private javax.swing.JButton btnnew;
	private javax.swing.JButton btnsavepurchase;
	private javax.swing.JButton btnviewtotalsale;
	private javax.swing.JComboBox cmbadult;
	private javax.swing.JComboBox cmbdate;
	private javax.swing.JComboBox cmbmovies;
	private javax.swing.JComboBox cmbtime;
	private javax.swing.JComboBox cmdchild;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JLabel lblGCT;
	private javax.swing.JLabel lblTotal;
	private javax.swing.JLabel lblTotalCOSTreport;
	private javax.swing.JLabel lbladultticket;
	private javax.swing.JLabel lbladultticketreport;
	private javax.swing.JLabel lblchildticketreport;
	private javax.swing.JLabel lblimage;
	private javax.swing.JLabel lblmaindate;
	private javax.swing.JLabel lblmoviename1;
	private javax.swing.JLabel lblsubtotal;
	private javax.swing.JLabel lbltime;
	private javax.swing.JLabel lbltimeanddate;
	private javax.swing.JPanel pngimagemovie;
}