package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.MyButton;

public class Login extends JDialog {
	private JButton logButton = new MyButton("Ingresar");
	private JButton cancelButton = new MyButton("Cancelar");
	private JPanel login;
	private JPanel buttons;

	public Login() {
		super(View.getInstance(), "Iniciar Sesión", ModalityType.DOCUMENT_MODAL);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setSize(400, 200);
		int posX = Toolkit.getDefaultToolkit().getScreenSize().width;
        int posY = Toolkit.getDefaultToolkit().getScreenSize().height;
        posX = (posX-400)/2;
        posY = (posY-200)/2;  
        this.setLocation(posX, posY);
	
		
		login = initLoginBox();
		buttons = initButtonsBox();
		JPanel main = new JPanel();
		main.setAlignmentX(JDialog.CENTER_ALIGNMENT);
		main.add(login, BorderLayout.NORTH);
		main.add(buttons, BorderLayout.CENTER);
		
		this.add(main);
	}
	
	private JPanel initLoginBox() {
		JPanel theLogin = new JPanel(new FlowLayout(FlowLayout.LEADING));
		theLogin.setSize(300, 100);
		theLogin.setPreferredSize(new Dimension(340, 100));
		theLogin.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
		Dimension dimension = new Dimension(120, 40);
		Dimension dimension2 = new Dimension(220, 30);
		
		JLabel userLabel = new JLabel("Usuario");
		JTextField user = new JTextField();
		userLabel.setPreferredSize(dimension);
		userLabel.setHorizontalAlignment(JLabel.CENTER);
		user.setPreferredSize(dimension2);
		user.setColumns(17);
		
		JLabel passLabel = new JLabel("Contraseña");
		JPasswordField pass = new JPasswordField();
		passLabel.setPreferredSize(dimension);
		passLabel.setHorizontalAlignment(JLabel.CENTER);
		pass.setPreferredSize(dimension2);
		pass.setColumns(17);
		
		theLogin.add(userLabel);
		theLogin.add(user);
		theLogin.add(passLabel);
		theLogin.add(pass);
		
		return theLogin;
	}
	
	private JPanel initButtonsBox() {
		Dimension dimension = new Dimension(100, 30);
		Dimension dimension2 = new Dimension(150, 30);
		
		JPanel theButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
		theButtons.setSize(400, 100);
		theButtons.setPreferredSize(new Dimension(400, 100));
		theButtons.setAlignmentY(JPanel.CENTER_ALIGNMENT);
		theButtons.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		
		JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		logButton.setPreferredSize(dimension);
		loginPanel.setPreferredSize(dimension2);
		loginPanel.add(logButton);
		
		JPanel cancelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		cancelButton.setPreferredSize(dimension);
		loginPanel.setPreferredSize(dimension2);
		cancelPanel.add(cancelButton);
		
		theButtons.add(loginPanel);
		theButtons.add(cancelPanel);
		
		return theButtons;
	}
	
	public void setActionListener(ActionListener a){
        logButton.addActionListener(a);
        cancelButton.addActionListener(a);
    }
}
