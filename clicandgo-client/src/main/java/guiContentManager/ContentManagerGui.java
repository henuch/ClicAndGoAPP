package guiContentManager;

import gui.Authentification;
import gui.TravelerGI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ContentManagerGui extends JFrame {
        
	private javax.swing.JPanel bodyPanel;
	private javax.swing.JButton ItineraryBtn;
	private javax.swing.JButton logoutBtn;
	public static javax.swing.JPanel panelContent;
	private javax.swing.JPanel panelGeneral;
	private javax.swing.JPanel panelMenu;
	private JButton btnNewButton;

/**
 * 
 */
private static final long serialVersionUID = 1L;
// private JFrame frame;
Authentification authentification = new Authentification();
StationPanel stationPanel =new StationPanel();
private JButton btnPlace;

/**
 * Create the application.
 */
public ContentManagerGui() {
	this.setBounds(180, 20, 30, 30);
	initComponents();
}

private void initComponents() {
	setTitle("Content Manager Interface");
	panelGeneral = new javax.swing.JPanel();
	bodyPanel = new javax.swing.JPanel();
	panelMenu = new javax.swing.JPanel();
	ItineraryBtn = new javax.swing.JButton();
	logoutBtn = new javax.swing.JButton();

	logoutBtn.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	});

	panelContent = new javax.swing.JPanel();

	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	getContentPane().setLayout(new java.awt.CardLayout());

	panelMenu.setBorder(javax.swing.BorderFactory
			.createLineBorder(new java.awt.Color(102, 0, 0)));

	ItineraryBtn.setText("Station");
	ItineraryBtn.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			AuthentificationBtnActionPerformed(evt);
		}
	});

	logoutBtn.setText("Logout");
	
	JButton btnMeanoftransport = new JButton();
	btnMeanoftransport.setText("MeanOfTransport");
	
	JButton btnLine = new JButton();
	btnLine.setText("Line");
	
	JButton btnUser = new JButton();
	btnUser.setText("User");
	
	btnPlace = new JButton();
	btnPlace.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnPlace.setText("Place");

	javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(
			panelMenu);
	panelMenuLayout.setHorizontalGroup(
		panelMenuLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(panelMenuLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(panelMenuLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(panelMenuLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(ItineraryBtn, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
						.addComponent(logoutBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addComponent(btnMeanoftransport, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnLine, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnUser, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnPlace, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(43, Short.MAX_VALUE))
	);
	panelMenuLayout.setVerticalGroup(
		panelMenuLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(panelMenuLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(ItineraryBtn, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				.addGap(34)
				.addComponent(btnMeanoftransport, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				.addGap(35)
				.addComponent(btnLine, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				.addGap(38)
				.addComponent(btnUser, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				.addGap(47)
				.addComponent(btnPlace, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
				.addComponent(logoutBtn, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
				.addGap(19))
	);
	panelMenu.setLayout(panelMenuLayout);

	panelContent.setBackground(new java.awt.Color(255, 255, 255));
	panelContent.setBorder(javax.swing.BorderFactory
			.createLineBorder(new java.awt.Color(102, 0, 0)));
	panelContent.setLayout(new java.awt.CardLayout());

	javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(
			bodyPanel);
	bodyPanel.setLayout(bodyPanelLayout);
	bodyPanelLayout.setHorizontalGroup(bodyPanelLayout.createParallelGroup(
			javax.swing.GroupLayout.Alignment.LEADING).addGroup(
			bodyPanelLayout
					.createSequentialGroup()
					.addGap(4, 4, 4)
					.addComponent(panelMenu,
							javax.swing.GroupLayout.PREFERRED_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(panelContent,
							javax.swing.GroupLayout.DEFAULT_SIZE, 780,
							Short.MAX_VALUE).addContainerGap()));
	bodyPanelLayout
			.setVerticalGroup(bodyPanelLayout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(
							bodyPanelLayout
									.createSequentialGroup()
									.addContainerGap()
									.addGroup(
											bodyPanelLayout
													.createParallelGroup(
															javax.swing.GroupLayout.Alignment.LEADING)
													.addComponent(
															panelContent,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															Short.MAX_VALUE)
													.addGroup(
															javax.swing.GroupLayout.Alignment.TRAILING,
															bodyPanelLayout
																	.createSequentialGroup()
																	.addGap(0,
																			0,
																			Short.MAX_VALUE)
																	.addComponent(
																			panelMenu,
																			javax.swing.GroupLayout.PREFERRED_SIZE,
																			623,
																			javax.swing.GroupLayout.PREFERRED_SIZE)))
									.addContainerGap()));

	 btnNewButton = new JButton("");
	 btnNewButton.setBackground(new Color(255, 255, 255));
	 
	javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(
			panelGeneral);
	panelGeneral.setLayout(panelGeneralLayout);
	panelGeneralLayout.setHorizontalGroup(panelGeneralLayout
			.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
					javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	panelGeneralLayout.setVerticalGroup(panelGeneralLayout
			.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
					javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

	getContentPane().add(panelGeneral, "card2");

	
	pack();
}// </editor-fold>//GEN-END:initComponents

private void AuthentificationBtnActionPerformed(
		java.awt.event.ActionEvent evt) {// GEN-FIRST:event_gestionFournisseursBtnActionPerformed
	panelContent.removeAll();
	panelContent.add(stationPanel);
	panelContent.repaint();
	panelContent.revalidate(); // TODO add your handling code here:
}// GEN-LAST:event_gestionFournisseursBtnActionPerformed

public static void main(String args[]) {
	/* Set the Nimbus look and feel */
	// <editor-fold defaultstate="collapsed"
	// desc=" Look and feel setting code (optional) ">
	/*
	 * If Nimbus (introduced in Java SE 6) is not available, stay with the
	 * default look and feel. For details see
	 * http://download.oracle.com/javase
	 * /tutorial/uiswing/lookandfeel/plaf.html
	 */
	try {
		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
				.getInstalledLookAndFeels()) {
			if ("Windows".equals(info.getName())) {
				javax.swing.UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		}
	} catch (ClassNotFoundException ex) {
		java.util.logging.Logger.getLogger(TravelerGI.class.getName()).log(
				java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(TravelerGI.class.getName()).log(
				java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
		java.util.logging.Logger.getLogger(TravelerGI.class.getName()).log(
				java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
		java.util.logging.Logger.getLogger(TravelerGI.class.getName()).log(
				java.util.logging.Level.SEVERE, null, ex);
	}
	// </editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
		public void run() {
			new ContentManagerGui().setVisible(true);
		}
	});

} 
}
