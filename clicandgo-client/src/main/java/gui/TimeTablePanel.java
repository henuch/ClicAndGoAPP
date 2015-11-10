package gui;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BusinessDelegator.LineServicesDelegate;
import BusinessDelegator.MeansOfTransportDelegate;
import entities.Line;
import entities.MeanOfTransport;

import javax.swing.JLabel;
import javax.swing.JButton;

import model.MeanOfTransportModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TimeTablePanel extends JPanel {
	private JLabel lblTim;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public TimeTablePanel() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setLayout(null);

		JPanel panel = new JPanel();
		JComboBox<String> comboBoxMot = new JComboBox<String>();
		JButton btnTime = new JButton("Show time table");
		
		
		new MeanOfTransport();

		List<MeanOfTransport> meanOfTransports = MeansOfTransportDelegate
				.doFindAllMeanOfTransports();
		for (MeanOfTransport m : meanOfTransports) {
			comboBoxMot.addItem(m.getRegistrationNumber());
		}
		
		panel.setBounds(0, 5, 816, 387);
		add(panel);
		panel.setLayout(null);
		//panel.add(table3);
		

		
		comboBoxMot.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Choose your mean of transport" }));
		comboBoxMot.setBounds(143, 51, 176, 28);
		panel.add(comboBoxMot);
		
		
		btnTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//////////////////////////////////////////////////////////////////////////////////////
			}
		});
		btnTime.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			if (comboBoxMot.getSelectedItem().toString().equals("TCV1")) {
					lblTim = new JLabel("");
					lblTim.setBounds(47, 87, 383, 186);
					lblTim.setIcon(new javax.swing.ImageIcon(getClass().getResource(
						"/images/tcv1.png")));
					lblTim.setText("");
					panel.add(lblTim);
			 }
		 else if(comboBoxMot.getSelectedItem().toString().equals("TCV2"))
			 {
				 lblTim = new JLabel("");
					lblTim.setBounds(47, 87, 383, 186);
					lblTim.setIcon(new javax.swing.ImageIcon(getClass().getResource(
							"/images/manager1.png")));
					lblTim.setText("");
					panel.add(lblTim);
		 }
				
				
				
//				if(comboBoxMot.getSelectedItem().toString().trim() != null)
//				{
//					table3.setVisible(true);
//					table4.setVisible(false);
//				}
//				else
//				{table4.setVisible(true);
//				table3.setVisible(false);}
	}
		});
		
		btnTime.setBounds(179, 105, 111, 23);
		panel.add(btnTime);
		
		JLabel lbltim = new JLabel("");
		lbltim.setBounds(47, 204, 334, 132);
		panel.add(lbltim);
		
//		lblTim = new JLabel("");
//		lblTim.setBounds(47, 87, 383, 186);
//		lblTim.setIcon(new javax.swing.ImageIcon(getClass().getResource(
//				"/images/tcv1.png")));
//		lblTim.setText("");
//		panel.add(lblTim);

		// //////////Receperer means of transport de la base//////////


		// /////////////////////

		// //////////condition sur le tableau///////////

//		 if (comboBoxMot.getSelectedItem().toString().equals("TCV1")) {
//				lblTim = new JLabel("");
//				lblTim.setBounds(47, 87, 383, 186);
//				lblTim.setIcon(new javax.swing.ImageIcon(getClass().getResource(
//						"/images/tcv1.png")));
//				lblTim.setText("");
//				panel.add(lblTim);
//		 }
//		 else if(comboBoxMot.getSelectedItem().toString().equals("TCV2"))
//		 {
//			 lblTim = new JLabel("");
//				lblTim.setBounds(47, 87, 383, 186);
//				lblTim.setIcon(new javax.swing.ImageIcon(getClass().getResource(
//						"/images/manager1.png")));
//				lblTim.setText("");
//				panel.add(lblTim);
//		 
//		 }

		// //////////////////////////
	}
}
