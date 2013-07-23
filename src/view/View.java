package view;

import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class View extends JFrame {
	private static View viewInstance;;
	private ActionListener listener;
	
	private JMenuBar menu;
	private JMenu m_sesion;
    private JMenuItem[] s_items;
    private String[] s_string = {"Sesion", "Iniciar Sesion", "Cerrar Sesion", "Salir"};
    private String[] s_command = {"iniciar-sesion", "cerrar-sesion", "salir"};
    
    private Login login;
    
    public static View getInstance() {
        return viewInstance;
    }
    
	public View(ActionListener al) {
		super("Proyecto Epicuro");
		this.listener = al;
		this.viewInstance = this;
        setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height - 30);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLayout(null);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Menu Bar */
		menu = new JMenuBar();
		
		
		/* Menus */
		m_sesion = new JMenu(s_string[0]);
		
		/* Menus items */
		
		// Sesion menu
		s_items = new JMenuItem[3];
		for(int i = 0; i<(s_string.length-1); i++) {
			s_items[i] = new JMenuItem(s_string[i+1]);
			s_items[i].setActionCommand(s_command[i]);
			s_items[i].addActionListener(listener);
			m_sesion.add(s_items[i]);
		}
		
		menu.add(m_sesion);
		this.setJMenuBar(menu);
		
		/***LOGIN***/
		login = new Login();
        login.setActionListener(listener);
        
        this.setVisible(true);
        login.setVisible(true);  
	}
}
