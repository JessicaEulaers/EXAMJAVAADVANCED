package edu.ap.spring.jpa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class DALQuotes {

    private static DALQuotes dalQuotes;
    
    private DALQuotes(){};
    
    public static DALQuotes getInstance() {
        if (dalQuotes == null)
        	dalQuotes = new DALQuotes();
            
        return dalQuotes;
    }
    
    public ArrayList<Quote> setQuotes(int personId) throws SQLException, FileNotFoundException, IOException {
       
    	    ArrayList<Quote> Quotes = new ArrayList<Quote>();
    		PreparedStatement QuotessStmt = null;
    		String selectSQL = "INSERT INTO quote\r\n " + 
    				"VALUES (id); ";
    		
    		QuotessStmt = DALConnection.getInstance().getConnection().prepareStatement(selectSQL);
    		QuotessStmt.setInt(1, personId);
        ResultSet rs = QuotessStmt.executeQuery();
        
        while(rs.next()) {
        		Quotes.add(new Quote(rs.getInt("id")));
        }
        
        return Quotes;
    }
}
