package gui;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import BusinessDelegator.StationDelegate;
import Dijkstra.Dessin;
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
		// lblmaindate.setText(dateFormat.format(date));
		initialize();
	}

	private void initialize() {
		setLayout(null);
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setBounds(27, 51, 120, 29);
		btnnew = new javax.swing.JButton();
		btnnew.setBounds(10, 340, 110, 23);

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel5.setText("Departure");
		add(jLabel5);

		panel_Itinerary = new JPanel();
		panel_Itinerary.setBounds(10, 30, 771, 491);
		add(panel_Itinerary);
		panel_Itinerary.setLayout(null);
		panel_Itinerary.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						51, 0, 0)), "Itinerary",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 12),
				new java.awt.Color(102, 0, 0))); // NOI18N
		btnsavepurchase = new javax.swing.JButton();
		btnsavepurchase.setBounds(641, 63, 120, 23);
		panel_Itinerary.add(btnsavepurchase);
		btnsavepurchase.setText("Search");

		Trip = new JPanel();
		Trip.setBounds(10, 152, 751, 77);
		panel_Itinerary.add(Trip);
		Trip.setLayout(null);
		Trip.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						51, 0, 0)), "Itinerary",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 12),
				new java.awt.Color(102, 0, 0)));
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 21, 731, 45);
		Trip.add(textArea);
		textArea.setBackground(SystemColor.control);
		btncomputecharge = new javax.swing.JButton();
		btncomputecharge.setBounds(225, 251, 165, 23);
		panel_Itinerary.add(btncomputecharge);
		
				btncomputecharge.setText("See on Google Map");
				cmbmovies = new javax.swing.JComboBox();
				cmbmovies.setBounds(255, 27, 230, 20);
				panel_Itinerary.add(cmbmovies);
				
						cmbmovies.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
								"Ariana", "Hammam Lif", "Barcelone", "La marsa", "Rades",
								"Passage", "Ezzahra", "Mohamed 5", "Cite Olympique", "Megrine",
								"Manar 2", "Menzeh 9" }));
						jSeparator2 = new javax.swing.JSeparator();
						jSeparator2.setBounds(255, 76, 230, 10);
						panel_Itinerary.add(jSeparator2);
						JComboBox comboBox = new JComboBox();
						comboBox.setBounds(255, 107, 230, 20);
						panel_Itinerary.add(comboBox);
						comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
								"Ariana", "Hammam Lif", "Barcelone", "La marsa", "Rades",
								"Passage", "Ezzahra", "Mohamed 5", "Cite Olympique", "Megrine",
								"Manar 2", "Menzeh 9" }));
						
								JLabel label = new JLabel();
								label.setBounds(10, 102, 120, 29);
								panel_Itinerary.add(label);
								label.setText("Arrival");
								label.setFont(new Font("Tahoma", Font.PLAIN, 12));
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
				btncomputecharge.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent evt) {

						Dessin des = new Dessin();
						des.setVisible(true);
					}
				});
		// textArea.setText("Press search to see itinerary description");
		textArea.setVisible(false);
		btnsavepurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Mapy mapy=new Mapy();
				// panel.add(mapy);
				// mapy.setSize(panel.getWidth()-50,panel.getHeight()-50);

				int N = Graphe.ALPHA_NOTDEF;
				int[][] matDuree = { { N, 5, N, N, N, N, N, N, N, N, N, N },
						{ 5, N, 4, N, N, N, N, N, N, N, N, N },
						{ N, 4, N, 2, N, N, N, N, N, N, N, N },
						{ N, N, 2, N, 2, N, N, N, N, 8, N, N },
						{ N, N, N, 2, N, 10, N, N, N, N, N, 15 },
						{ N, N, N, N, 10, N, 5, N, N, N, N, N },
						{ N, N, N, N, N, 5, N, 5, N, N, N, N },
						{ N, N, N, N, N, N, 5, N, 7, N, N, N },
						{ N, N, N, N, N, N, N, 7, N, N, N, N },
						{ N, N, N, 8, N, N, N, N, N, N, 3, N },
						{ N, N, N, N, N, N, N, N, N, 3, N, N },
						{ N, N, N, N, 15, N, N, N, N, N, N, N },

				};
				String depart = (String) cmbmovies.getSelectedItem();

				String arrival = (String) comboBox.getSelectedItem();

				Station stationdepart = StationDelegate
						.findStationByStationName(depart);
				Graphe g0 = new Graphe(matDuree);
				Dijkstra dij = new Dijkstra(stationdepart.getReference(), g0);
				dij.AfficherDestinationEtCout(depart, arrival);
				// textField_2.setVisible(true);
				// textField_2.setText(dij.AfficherDestinationEtCout(depart,
				// arrival));
				textArea.setVisible(true);
				textArea.setText(dij.AfficherDestinationEtCout(depart, arrival));

				// SessionDelegate.doSetDeparture(stationdepart.getName());
				// SessionDelegate.doSetArrival(arrival);
				//
				// System.out.println("Arrivée: "+SessionDelegate.doGetArrival());
				// System.out.println("Depart : "+SessionDelegate.doGetDeparture());
				// System.out.println("Cout : "+SessionDelegate.doGetArrival());

			}

		});

		// panel = new JPanel();
		// panel.setBounds(10, 60, 471, 450);
		// add(panel);
		// panel.setVisible(false);
		// JLabel label1 = new JLabel("");
		// label1.setIcon(new
		// ImageIcon("C:\\Users\\esprit\\git\\ClicAndGoAPP\\clicandgo-client\\img\\map.jpg"));
		// label1.setBounds(0, 0, 434, 252);
		// panel.add(label1);

		// JLabel lblNewLabel = new JLabel("");
		// lblNewLabel.setBounds(0, 50, 434, 255);
		// panel.add(lblNewLabel);
		//
		// lblNewLabel.setIcon(new
		// ImageIcon("C:\\Users\\esprit\\git\\ClicAndGoAPP\\clicandgo-client\\img\\map.jpg"));

	}

	private void cmbmoviesActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void cmbmoviesItemStateChanged(java.awt.event.ItemEvent evt) {
	}

	private javax.swing.JButton btncomputecharge;
	private javax.swing.JButton btnnew;
	private javax.swing.JButton btnsavepurchase;
	private javax.swing.JComboBox cmbmovies;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JSeparator jSeparator2;
	private JPanel panel;
	private JPanel panel_Itinerary;
	private JPanel Trip;
}
