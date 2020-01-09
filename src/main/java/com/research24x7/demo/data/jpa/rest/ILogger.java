

package com.research24x7.demo.data.jpa.rest;



import java.util.function.Supplier;



public interface ILogger {

	
	
	void info (Supplier<String> message);
	
	
	void warn (Supplier<String> message);
	
	
	void debug (Supplier<String> message);
	
	
	void error (Supplier<String> message);
	
	
	void error (Supplier<String> message, Throwable t);
}