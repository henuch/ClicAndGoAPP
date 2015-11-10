package gui;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import BusinessDelegator.MeansOfTransportDelegate;
import entities.MeanOfTransport;

public class TimeTablePanel extends JPanel {

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
		panel.setBounds(0, 5, 440, 284);
		add(panel);
		panel.setLayout(null);

		JComboBox comboBoxMot = new JComboBox();
		comboBoxMot.setBounds(178, 81, 148, 20);
		panel.add(comboBoxMot);

		JLabel lblHello = new JLabel("Hello");
		lblHello.setBounds(225, 8, 23, 14);
		panel.add(lblHello);

		// ////////////////////

		new MeanOfTransport();

		List<MeanOfTransport> meanOfTransports = MeansOfTransportDelegate
				.doFindAllMeanOfTransports();
		for (MeanOfTransport m : meanOfTransports) {
			comboBoxMot.addItem(m.getRegistrationNumber());
		}
		// /////////////////////

	}
}
