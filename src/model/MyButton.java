package model;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MyButton extends JButton implements MouseListener {
	private Color normalColor = Color.LIGHT_GRAY;
	private Color mouseColor = Color.WHITE;
	
	public MyButton(String name) {
		super(name);
		
		this.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
		this.setBackground(Color.LIGHT_GRAY);
		this.addMouseListener(this);
	}
	
	public void setNormalColor(Color color) {
		this.normalColor = color;
		this.setBackground(normalColor);
	}
	
	public void setMouseColor(Color color) {
		this.mouseColor = color;
	}
	
	//override the methods of implemented MouseListener
	 
	public void mouseClicked(MouseEvent e) { }
	 
	public void mousePressed(MouseEvent e) { }
	 
	public void mouseReleased(MouseEvent e) { }
	
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==this) {  this.setBackground(mouseColor); }	 
	} 
		 
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==this) { this.setBackground(normalColor); }
	}	 
		 
}