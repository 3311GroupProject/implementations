import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Proxy extends Login{

	private LoginService loginservice;
	
	private static JLabel userLabel;
	private static JLabel passLabel;
	private static JPasswordField passText;
	private static JButton button;
	private static JTextField userText;

	
	public LoginService getInstance() {
		if (loginservice == null)
		{
			loginservice = new LoginService();
		}
		loginservice.getInstance();
		return loginservice;
		
	}

	@Override
	public void LoginService() {
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
		
		panel.add(button);
	
		frame.setVisible(true);
		loginservice.LoginService();
	}

	@Override
	public boolean Validate() {
		// TODO Auto-generated method stub
		loginservice.Validate();
		return false;
	}
	
	

	
	
	
}
