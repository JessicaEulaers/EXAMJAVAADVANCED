package edu.ap.spring.model;

import static org.hamcrest.CoreMatchers.containsString;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import java.lang.Object;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import edu.ap.spring.jpa.QuoteRepository;

@Component
public class QuoteEx {

	@Autowired
	private QuoteRepository repository;
	
	@Autowired
    public void setQuoteRepository(QuoteRepository repository) {
        this.repository = repository;
    }

    public QuoteRepository getRepository() {
        return repository;
    }

    private String getFile(String fileName) {

    	StringBuilder result = new StringBuilder("");

    	//Get file from resources folder
    	ClassLoader classLoader = getClass().getClassLoader();
    	File file = new File(classLoader.getResource(fileName).getFile());

    	try (Scanner scanner = new Scanner(file)) {

    		while (scanner.hasNextLine()) {
    			String line = scanner.nextLine();
    			result.append(line).append("\n");
    		}

    		scanner.close();

    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    		
    	return result.toString();

      }
	
}
