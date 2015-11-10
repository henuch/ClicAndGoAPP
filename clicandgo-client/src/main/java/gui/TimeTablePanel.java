package gui;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import BusinessDelegator.MeansOfTransportDelegate;
import entities.MeanOfTransport;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TimeTablePanel extends JPanel {
	private JTable table;
	private JTable table2;
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
		
		
		table2 = new JTable();
		table2.setModel(new DefaultTableModel(
			new Object[][] {
				{"sd", "sd", "ds"},
				{"ds", "ds", "ds"},
				{"ds", "ds", null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table2.getColumnModel().getColumn(0).setResizable(false);
		add(table2);


		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null,
				null));
		panel.setBounds(408, 373, -312, -367);
		add(panel);
		panel.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(124, 104, 129, 50);
		add(comboBox);
		
		JButton btnShowTables = new JButton("show tables");
		btnShowTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m=comboBox.getSelectedItem().toString();
				int n=comboBox.getSelectedIndex();
				System.out.println("\n : le comcom "+m);
				System.out.println(n);
				if(n==1)
					table.setVisible(true);
				//initialize();

				if(n==2){
					table.setVisible(false);

					table2.setVisible(true);
					//initialize();
				}

				
			}
		});
		btnShowTables.setBounds(126, 217, 89, 23);
		add(btnShowTables);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"545", "5454"},
				{"5454", "55"},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.setBounds(270, 280, 280, 129);
		
		add(table);
		table.setVisible(false);
		table2.setVisible(false);

		List<MeanOfTransport> meanOfTransports = MeansOfTransportDelegate.doFindAllMeanOfTransports();
		for(MeanOfTransport m : meanOfTransports)
		{
			comboBox.addItem(m.getRegistrationNumber());
		}
	
	
	}
}
