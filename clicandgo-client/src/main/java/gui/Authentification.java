package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import BusinessDelegator.SessionDelegate;
import BusinessDelegator.UserServicesDelegate;
import entities.ContentManager;
import entities.Traveler;
import entities.User;
import guiContentManager.ContentManagerGui;

public class Authentification extends JFrame {
	public User authentifiedUser;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("ena doub ma 7allit l'app: session login "+SessionDelegate.doGetLogin()+" Session Pwd "+SessionDelegate.doGetPwd());

					Authentification authentification = new Authentification();
					authentification.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Authentification() {
		// initialize();
		setTitle("Authentication");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 969, 695);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel labelLogin = new JLabel("Login: ");
		labelLogin.setBounds(142, 194, 76, 14);
		panel.add(labelLogin);

		JLabel labelPassword = new JLabel("Password: ");
		labelPassword.setBounds(142, 298, 76, 14);
		panel.add(labelPassword);

		loginField = new JTextField();
		loginField.setBounds(257, 191, 151, 20);
		panel.add(loginField);
		loginField.setColumns(10);

		JButton buttonLogin = new JButton("Login");

		buttonLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				authentifiedUser = UserServicesDelegate.doAuthenticate(
						loginField.getText(), passwordField.getText());
				//recuperer l'utilisateur connecté
				SessionDelegate.doSetLogin(authentifiedUser.getName());
				SessionDelegate.doSetPwd(authentifiedUser.getPassword());
				
				if (authentifiedUser instanceof Traveler) {

					System.out.println("Hello Traveler "
							+ authentifiedUser.getName());
					JOptionPane.showMessageDialog(rootPane,
							"Welcome  traveler " + authentifiedUser.getName());
					TravelerGI travelerGI = new TravelerGI();
					travelerGI.setVisible(true);
					System.out.println("ena connectit: session login "+SessionDelegate.doGetLogin()+" Session Pwd "+SessionDelegate.doGetPwd());
					dispose();

				} else if (authentifiedUser instanceof ContentManager) {

					System.out.println("Hello CM "
							+ authentifiedUser.getName());
					JOptionPane.showMessageDialog(rootPane,
							"Welcome  Content Manager " + authentifiedUser.getName());
					ContentManagerGui	contentManagerGui=new ContentManagerGui();
					contentManagerGui.setVisible(true);
					System.out.println("ena connectit: session login "+SessionDelegate.doGetLogin()+" Session Pwd "+SessionDelegate.doGetPwd());
					dispose();
				} else {
					JOptionPane.showMessageDialog(rootPane,
							"authentification error, try again.");
					System.out.println("ena connectit: session login "+SessionDelegate.doGetLogin()+" Session Pwd "+SessionDelegate.doGetPwd());

				}
			}
		});
		buttonLogin.setBounds(491, 442, 117, 23);
		panel.add(buttonLogin);

		JLabel labelTitre = new JLabel("Authentication");
		labelTitre.setFont(new Font("Arial", Font.PLAIN, 27));
		labelTitre.setBounds(424, 43, 184, 39);
		panel.add(labelTitre);

		passwordField = new JPasswordField();
		passwordField.setBounds(257, 295, 151, 20);
		panel.add(passwordField);
	}

}
