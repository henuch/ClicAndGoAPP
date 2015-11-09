package guiContentManager;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import BusinessDelegator.MeansOfTransportDelegate;
import BusinessDelegator.UserServicesDelegate;
import entities.MeanOfTransport;
import entities.User;

import javax.swing.JTable;

import model.UserTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



//import model.DiscountModelTable;

public class UserPanel extends JPanel {
	private JTable table;
	public UserPanel() {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(74, 63, 506, 47);
		add(table);
		
		JButton btnSubmit = new JButton("List Users");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setModel(new UserTableModel());

			}
		});
		btnSubmit.setBounds(165, 32, 89, 23);
		add(btnSubmit);
		
	}	
}