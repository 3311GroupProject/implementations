package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import LoginPackage.Login;
import LoginPackage.LoginProxy;
import LoginPackage.LoginSubject;

public class Client {
	
	private static JLabel userLabel;
	private static JLabel passLabel;
	private static JPasswordField passText;
	private static JButton button;
	private static JTextField userText;
	
	
	Login login = new LoginSubject();
	
	
	private static void startGui() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(350, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Username:");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(30);
		userText.setBounds(80, 20, 200, 25);
		panel.add(userText);
		
		passLabel = new JLabel("Password:");
		passLabel.setBounds(10, 50, 80, 25);
		panel.add(passLabel);
		
		passText = new JPasswordField();
		passText.setBounds(80, 50, 200, 25);
		panel.add(passText);
		
		button = new JButton("Submit!");
		button.setBounds(125, 80, 80, 25);
		button.addActionListener(null);
		
		panel.add(button);
	
		frame.setVisible(true);
	}
	
	static class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//JtextField to String & JPasswordField->charArray->String
			String username =  (userText.getText()).toUpperCase();
			
			String password = String.copyValueOf(passText.getPassword());
			
			// TODO Auto-generated method stub
			try {
				login.validate(username, password);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		startGui();
	}
}

