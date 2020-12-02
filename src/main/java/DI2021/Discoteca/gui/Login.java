package DI2021.Discoteca.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textFieldEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(64, 107, 70, 25);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPasswod = new JLabel("Passwod");
		lblPasswod.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswod.setBounds(64, 143, 70, 25);
		frame.getContentPane().add(lblPasswod);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(144, 109, 96, 20);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 145, 96, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblTitulo = new JLabel("LOGIN");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(86, 31, 114, 30);
		frame.getContentPane().add(lblTitulo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAceptar.setBounds(86, 190, 89, 23);
		frame.getContentPane().add(btnAceptar);
	}
}
