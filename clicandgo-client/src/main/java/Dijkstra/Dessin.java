package Dijkstra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Dessin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dessin frame = new Dessin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dessin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 419, 282);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\esprit\\git\\ClicAndGoAPP\\clicandgo-client\\img\\map.jpg"));
		lblNewLabel.setBounds(0, 0, 419, 226);
		panel.add(lblNewLabel);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.setBounds(161, 237, 89, 23);
		panel.add(btnDraw);
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pn p=new pn();
		 panel.add(p);
		 p.setSize(panel.getWidth(), panel.getHeight());
			}
		});
	}
}
