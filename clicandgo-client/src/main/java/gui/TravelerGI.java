package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import BusinessDelegator.SessionDelegate;
import Dijkstra.Navigation;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	NavigationPanel navigationPanel=new NavigationPanel();
	
	private JButton itineraryBtn;
	private JButton placesBtn;

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
		
		itineraryBtn = new JButton();
		itineraryBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelContent.removeAll();
				panelContent.add(navigationPanel);
				panelContent.repaint();
				panelContent.revalidate();
				
			
			
			}
		});
		itineraryBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelContent.removeAll();
				panelContent.add(navigationPanel);
				panelContent.repaint();
				panelContent.revalidate();
			}
		});
		itineraryBtn.setText("Itinerary");
		
		placesBtn = new JButton();
		placesBtn.setText("Places");

		javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(
				panelMenu);
		panelMenuLayout.setHorizontalGroup(
			panelMenuLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(panelMenuLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(panelMenuLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(logoutBtn, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
						.addComponent(itineraryBtn, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addComponent(ticketingBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
						.addComponent(readingBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
						.addComponent(placesBtn, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panelMenuLayout.setVerticalGroup(
			panelMenuLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panelMenuLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(itineraryBtn, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(ticketingBtn, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(readingBtn, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(placesBtn, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
					.addComponent(logoutBtn, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		panelMenu.setLayout(panelMenuLayout);

		panelContent.setBackground(new java.awt.Color(255, 255, 255));
		panelContent.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(102, 0, 0)));
		panelContent.setLayout(new java.awt.CardLayout());
		
		JLabel lblUSER = new JLabel();
		
		lblUSER.setHorizontalAlignment(SwingConstants.CENTER);
		lblUSER.setText("Hi, "+SessionDelegate.doGetLogin());
		lblUSER.setFont(new Font("Arial Black", Font.BOLD, 16));

		javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(
				bodyPanel);
		bodyPanelLayout.setHorizontalGroup(
			bodyPanelLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(bodyPanelLayout.createSequentialGroup()
					.addGap(4)
					.addGroup(bodyPanelLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(bodyPanelLayout.createSequentialGroup()
							.addComponent(panelMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
							.addComponent(lblUSER, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addComponent(panelContent, GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
					.addGap(18))
		);
		bodyPanelLayout.setVerticalGroup(
			bodyPanelLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(bodyPanelLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelContent, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
					.addGap(70))
				.addGroup(Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblUSER, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelMenu, GroupLayout.PREFERRED_SIZE, 591, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		bodyPanel.setLayout(bodyPanelLayout);

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
