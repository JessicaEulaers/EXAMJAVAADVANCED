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
		JFrame frame1 = new JFrame("LEZEN ");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 400);
        
        
		JButton buttonP = new JButton("Press");
		
        
		frame1.getContentPane().add(buttonP);
		frame1.setVisible(true);
		
		JFrame frame2 = new JFrame("OPVRAGEN");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(400, 400);
        
        JFrame frame3 = new JFrame("ZOEKEN");
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(400, 400);
	}
}
