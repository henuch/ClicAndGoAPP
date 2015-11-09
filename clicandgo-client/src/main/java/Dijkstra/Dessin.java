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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\esprit\\git\\ClicAndGoAPP\\clicandgo-client\\img\\map.jpg"));
		label.setBounds(0, 0, 434, 252);
		contentPane.add(label);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.setBounds(173, 278, 89, 23);
		contentPane.add(btnDraw);
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 pn p=new pn();
			 contentPane.add(p);
			 p.setSize(contentPane.getWidth(),contentPane.getHeight());
			
			
			}
		});
		
	}
}
