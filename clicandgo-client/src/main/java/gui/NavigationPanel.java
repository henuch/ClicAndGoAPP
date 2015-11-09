package gui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.DesignMode;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JTextArea;

import BusinessDelegator.StationDelegate;
import Dijkstra.Dessin;
import Dijkstra.Dijkstra;
import Dijkstra.Graphe;
import Dijkstra.Mapy;
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
		setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(57, 261, 333, 53);
		add(textArea);
		//textArea.setText("Press search to see itinerary description");
		textArea.setVisible(false);
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 130, 230, 20);
	
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(200, 0, 240, 30);
		lblmaindate = new javax.swing.JLabel();
		lblmaindate.setBounds(130, 60, 250, 20);
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setBounds(27, 51, 120, 29);
		cmbmovies = new javax.swing.JComboBox();
		cmbmovies.setBounds(130, 60, 230, 20);
		jSeparator2 = new javax.swing.JSeparator();
		jSeparator2.setBounds(130, 104, 210, 10);
		btnexit = new javax.swing.JButton();
		btnexit.setBounds(508, 415, 101, 23);
		btncomputecharge = new javax.swing.JButton();
		btncomputecharge.setBounds(140, 352, 165, 23);
		btnnew = new javax.swing.JButton();
		btnnew.setBounds(10, 340, 110, 23);
		btnsavepurchase = new javax.swing.JButton();
		btnsavepurchase.setBounds(162, 184, 120, 23);
		btnsavepurchase.setText("Search");
		btnsavepurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Mapy mapy=new Mapy();
//				 panel.add(mapy);
//				 mapy.setSize(panel.getWidth()-50,panel.getHeight()-50);
				
					int N = Graphe.ALPHA_NOTDEF;
					int[][] matDuree = { { N ,5 ,N ,N ,N ,N ,N ,N ,N ,N ,N ,N  }, 
							{ 5 ,N ,4 ,N ,N ,N ,N ,N ,N ,N ,N ,N }, 
							{ N ,4 ,N ,2 ,N ,N ,N ,N ,N ,N ,N ,N   }, 
							{ N ,N ,2 ,N ,2 ,N ,N ,N ,N ,8 ,N ,N  }, 
							{ N ,N ,N ,2 ,N ,10 ,N ,N ,N ,N ,N ,15  }, 
							{ N ,N ,N ,N ,10 ,N ,5 ,N ,N ,N ,N ,N  }, 
							{ N ,N ,N ,N ,N ,5 ,N ,5 ,N ,N ,N ,N  }, 
							{ N ,N ,N ,N ,N ,N ,5,N ,7 ,N ,N ,N  }, 
							{ N ,N ,N ,N ,N ,N ,N ,7 ,N ,N ,N ,N  }, 
							{ N ,N ,N ,8 ,N ,N ,N ,N ,N ,N ,3 ,N }, 
							{ N ,N ,N ,N ,N ,N ,N ,N ,N ,3 ,N ,N  }, 
							{ N ,N ,N ,N ,15 ,N ,N ,N ,N ,N ,N ,N }, 

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
		pngimagemovie = new javax.swing.JPanel();
		pngimagemovie.setBounds(491, 60, 190, 254);

		jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel1.setText("Clic And Go");
		add(jLabel1);

		
		add(lblmaindate);

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
		jLabel5.setText("Departure");
		add(jLabel5);

		cmbmovies.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Ariana", "Hammam Lif", "Barcelone",
				"La marsa","Rades","Passage","Ezzahra","Mohamed 5","Cite Olympique","Megrine","Manar 2","Menzeh 9"}));
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
		
		Dessin des=new Dessin();
		des.setVisible(true);
			}
		});
		add(btncomputecharge);

	

		
		add(btnsavepurchase);

		pngimagemovie.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		lblimage = new javax.swing.JLabel();
		
				lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource(
						"/images/aee.png")));
				lblimage.setText("");

		javax.swing.GroupLayout pngimagemovieLayout = new javax.swing.GroupLayout(
				pngimagemovie);
		pngimagemovieLayout.setHorizontalGroup(
			pngimagemovieLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, pngimagemovieLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblimage, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pngimagemovieLayout.setVerticalGroup(
			pngimagemovieLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pngimagemovieLayout.createSequentialGroup()
					.addComponent(lblimage, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pngimagemovie.setLayout(pngimagemovieLayout);

		add(pngimagemovie);
		
		
		add(comboBox);
		comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Ariana", "Hammam Lif", "Barcelone",
				"La marsa","Rades","Passage","Ezzahra","Mohamed 5","Cite Olympique","Megrine","Manar 2","Menzeh 9" }));
		
		JLabel label = new JLabel();
		label.setBounds(27, 125, 120, 29);
		label.setText("Arrival");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(label);
		
//		panel = new JPanel();
//		panel.setBounds(10, 60, 471, 450);
//		add(panel);
//		panel.setVisible(false);
//		JLabel label1 = new JLabel("");
//		label1.setIcon(new ImageIcon("C:\\Users\\esprit\\git\\ClicAndGoAPP\\clicandgo-client\\img\\map.jpg"));
//		label1.setBounds(0, 0, 434, 252);
//		panel.add(label1);
		
//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setBounds(0, 50, 434, 255);
//		panel.add(lblNewLabel);
//		
//		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\esprit\\git\\ClicAndGoAPP\\clicandgo-client\\img\\map.jpg"));
		
				
				

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
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JLabel lblimage;
	private javax.swing.JLabel lblmaindate;
	private javax.swing.JPanel pngimagemovie;
	private JPanel panel;
}
