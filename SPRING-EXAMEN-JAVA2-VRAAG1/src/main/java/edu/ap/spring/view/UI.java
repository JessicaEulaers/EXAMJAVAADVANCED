package edu.ap.spring.view;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import edu.ap.spring.jpa.DALConnection;
import edu.ap.spring.jpa.DALQuotes;
import edu.ap.spring.jpa.Quote;
import edu.ap.toezichten.dal.DALPerson;
import edu.ap.toezichten.dal.DALReservation;
import edu.ap.toezichten.dal.DALSlot;
import edu.ap.toezichten.model.Reservation;
import edu.ap.toezichten.model.Slot;

@Component
public class UI implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.setProperty("java.awt.headless", "false");
		JFrame frame = new JFrame("Quotes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        
		JButton buttonP = new JButton("Press");
		DALConnection.getInstance().connect();
        

        ArrayList<Quote> Quotes = DALQuotes.getInstance().getQuotes(id);
       
        
        for(Quote s : Quotes) {
        		System.out.println(s.toString());
        		buttonP = 
        }
        
		frame.getContentPane().add(buttonP);
		frame.setVisible(true);
		
	}
}
