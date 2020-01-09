

package com.research24x7.demo.data.jpa.rest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class Application {
	
	
	
	private static ILogger  logger = new LoggerSlf4Support (Application.class);
	
	
	
	public Application (){
			
		// Call to super class.
		super ();
	}
	
	

	@Override
	public String toString () {
			
		// Return the value.
		return "RU :: Metadata Service Web API";
	}
	
	
	
    public static void main(String[] args) throws Exception {
    

    	logger.info (() -> ":: Metadata Service Web API...");
    	SpringApplication.run (new Object[] { Application.class }, args);
    	logger.info (() -> ":: Metadata Service Web API started!");
    }
}