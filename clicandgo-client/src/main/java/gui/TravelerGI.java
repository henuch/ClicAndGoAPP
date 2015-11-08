package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import BusinessDelegator.SessionDelegate;

public class TravelerGI extends JFrame {

	// Variables declaration - do not modify//GEN-BEGIN:variables

	private javax.swing.JPanel bodyPanel;
	private javax.swing.JButton readingBtn;
	private javax.swing.JButton ticketingBtn;
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
	// Authentification authentification = new Authentification();
	ReadingPanel readingPanel = new ReadingPanel();
	TicketingPanel ticketingPanel = new TicketingPanel();

	/**
	 * Create the application.
	 */
	public TravelerGI() {
		this.setBounds(180, 20, 30, 30);
		initComponents();
	}

	private void initComponents() {
		setTitle("Traveler Interface");
		panelGeneral = new javax.swing.JPanel();
		bodyPanel = new javax.swing.JPanel();
		panelMenu = new javax.swing.JPanel();

		ticketingBtn = new JButton();
		readingBtn = new JButton();

		logoutBtn = new javax.swing.JButton();
		logoutBtn.setText("Logout");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SessionDelegate.doExit();
				System.out.println("ena deconnectit: session login "
						+ SessionDelegate.doGetLogin() + " Session Pwd "
						+ SessionDelegate.doGetPwd());
			}
		});

		panelContent = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new java.awt.CardLayout());

		panelMenu.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(102, 0, 0)));

		readingBtn.setText("Reading");
		readingBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				readingBtnActionPerformed(evt);
			}
		});

		ticketingBtn.setText("Ticketing");
		ticketingBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ticketingBtnActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(
				panelMenu);
		panelMenu.setLayout(panelMenuLayout);
		panelMenuLayout
				.setHorizontalGroup(panelMenuLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelMenuLayout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												panelMenuLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																readingBtn,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																137,
																Short.MAX_VALUE)
														.addComponent(
																ticketingBtn,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																137,
																Short.MAX_VALUE)
														.addComponent(
																logoutBtn,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		panelMenuLayout
				.setVerticalGroup(panelMenuLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panelMenuLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												readingBtn,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												66,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												ticketingBtn,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												62,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(
												logoutBtn,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												46,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(19, 19, 19)));

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
		// btnNewButton.setIcon(new ImageIcon(
		// "C:\\Users\\Mourad\\Desktop\\PI\\logofinal.png"));
		// panelContent.add(btnNewButton, "name_551560228642910");

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

	private void readingBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_gestionFournisseursBtnActionPerformed
		panelContent.removeAll();
		panelContent.add(readingPanel);
		panelContent.repaint();
		panelContent.revalidate(); // TODO add your handling code here:
	}// GEN-LAST:event_gestionFournisseursBtnActionPerformed

	private void ticketingBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_gestionCategorieBtnActionPerformed
		panelContent.removeAll();
		panelContent.add(ticketingPanel);
		panelContent.repaint();
		panelContent.revalidate(); // TODO add your handling code here:
	}// GEN-LAST:event_gestionCategorieBtnActionPerformed

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
				new TravelerGI().setVisible(true);
			}
		});

	}

}
