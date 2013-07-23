package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.View;

public class Controller {
	private View view;
	private MyActionListener listener;
	
    public Controller() {        
        listener = new MyActionListener();
        view = new View(listener);
        //model = new Model();        
    }
    
    class MyActionListener implements ActionListener{        
        @Override
        public void actionPerformed(ActionEvent ae){
            String command = ae.getActionCommand();
        }
    }
}
