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
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JTextArea;

import BusinessDelegator.StationDelegate;
import Dijkstra.Dijkstra;
import Dijkstra.Graphe;
import entities.Station;

public class NavigationPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	String[][] purchasesave = new String[5][1];
	double overralltotalsale = 0;
	int overralladult = 0;
	int overrallchild = 0;

	/**
	 * Create the panel.
	 */

	public NavigationPanel() {
		DateFormat dateFormat = new SimpleDateFormat("EEEE, MMMMM dd, yyyy");
		Date date = new Date();
		//lblmaindate.setText(dateFormat.format(date));
		initialize();
	}

	private void initialize() {
		JTextArea textArea = new JTextArea();
		textArea.setBounds(27, 292, 333, 78);
		add(textArea);
		//textArea.setText("Press search to see itinerary description");
		textArea.setVisible(false);
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 150, 230, 20);
	
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(200, 0, 240, 30);
		lblmaindate = new javax.swing.JLabel();
		lblmaindate.setBounds(180, 30, 250, 20);
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator1.setBounds(140, 127, 210, 2);
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setBounds(27, 83, 120, 29);
		cmbmovies = new javax.swing.JComboBox();
		cmbmovies.setBounds(130, 88, 230, 20);
		jSeparator2 = new javax.swing.JSeparator();
		jSeparator2.setBounds(140, 188, 210, 10);
		btnexit = new javax.swing.JButton();
		btnexit.setBounds(431, 478, 101, 23);
		btncomputecharge = new javax.swing.JButton();
		btncomputecharge.setBounds(405, 408, 165, 23);
		btnnew = new javax.swing.JButton();
		btnnew.setBounds(10, 340, 110, 23);
		btnsavepurchase = new javax.swing.JButton();
		btnsavepurchase.setText("Search");
		btnsavepurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					int N = Graphe.ALPHA_NOTDEF;
					int[][] matDuree = { { N, 2, 4, 1, N }, { 2, N, 3, 3, 6 },
							{ 4, 3, N, N, 7 }, { 1, 3, N, N, 2 }, { N, 6, 7, 2, N },

					};
				String depart=(String) cmbmovies.getSelectedItem();
				String arrival=(String) comboBox.getSelectedItem();
				Station stationdepart = StationDelegate
						.findStationByStationName(depart);
				Graphe g0 = new Graphe(matDuree);
				Dijkstra dij=new Dijkstra(stationdepart.getReference(), g0);
				dij.AfficherDestinationEtCout(depart,arrival);
				//textField_2.setVisible(true);
				//textField_2.setText(dij.AfficherDestinationEtCout(depart, arrival));
				textArea.setVisible(true);
				textArea.setText(dij.AfficherDestinationEtCout(depart, arrival));
				
				
				}
			});
			
				
		
		btnsavepurchase.setBounds(168, 198, 120, 23);
		pngimagemovie = new javax.swing.JPanel();
		pngimagemovie.setBounds(380, 60, 190, 270);
		lblimage = new javax.swing.JLabel();

		setLayout(null);

		jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel1.setText("Clic And Go");
		add(jLabel1);

		
		add(lblmaindate);
		add(jSeparator1);

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel5.setText("Departure");
		add(jLabel5);

		cmbmovies.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Ariana", "Hammam lif", "Barcelone",
				"La marsa","Rades","Mourouj","Ezzahra","Le Kef","Beb Alioua", " " }));
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
		add(jSeparator2);

		btnexit.setText("Exit");
		btnexit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnexitActionPerformed(evt);
			}
		});
		add(btnexit);

		btncomputecharge.setText("See on Google Map");
		btncomputecharge.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			
			}
		});
		add(btncomputecharge);

	

		
		add(btnsavepurchase);

		pngimagemovie.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/aee.png")));
		lblimage.setText("");

		javax.swing.GroupLayout pngimagemovieLayout = new javax.swing.GroupLayout(
				pngimagemovie);
		pngimagemovieLayout.setHorizontalGroup(
			pngimagemovieLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, pngimagemovieLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblimage, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pngimagemovieLayout.setVerticalGroup(
			pngimagemovieLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pngimagemovieLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblimage, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pngimagemovie.setLayout(pngimagemovieLayout);

		add(pngimagemovie);
		
		
		add(comboBox);
		comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Ariana", "Hammam lif", "Barcelone",
				"La marsa","Rades","Mourouj","Ezzahra","Le Kef","Beb Alioua", " " }));
		
		JLabel label = new JLabel();
		label.setText("Arrival");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(27, 148, 120, 29);
		add(label);
				
				

	}

	private void cmbmoviesActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	

	private void cmbmoviesItemStateChanged(java.awt.event.ItemEvent evt) {
	}

	private javax.swing.JButton btncomputecharge;
	private javax.swing.JButton btnexit;
	private javax.swing.JButton btnnew;
	private javax.swing.JButton btnsavepurchase;
	private javax.swing.JComboBox cmbmovies;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JLabel lblimage;
	private javax.swing.JLabel lblmaindate;
	private javax.swing.JPanel pngimagemovie;
}
