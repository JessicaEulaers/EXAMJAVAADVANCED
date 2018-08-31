package edu.ap.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Quote {
	
	   @Id
	   @GeneratedValue
	   private Long id;
	   
	   public Quote(long id)
	   {
		   this.id = id;
	   }
	   
	   public long getId() {
			return id;
		}
}
