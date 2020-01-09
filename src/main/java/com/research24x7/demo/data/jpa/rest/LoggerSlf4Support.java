

package com.research24x7.demo.data.jpa.rest;



import java.util.function.Supplier;


import org.slf4j.*;



public final class LoggerSlf4Support implements ILogger {
	
	
	
	private Logger logger;
	

	public LoggerSlf4Support (Class<?> __class) {
		
		
		super ();
		
		
		logger = LoggerFactory.getLogger (__class);
	}
	
	
	
	@Override
	public void info (Supplier<String> message) {
		
		// Print the info.
		if (logger.isInfoEnabled ()) {
			logger.info (message.get ());
		}
	}

	
	@Override
	public void warn (Supplier<String> message) {
		
		// Print the info.
		if (logger.isWarnEnabled ()) {
			logger.warn (message.get ());
		}
	}

	
	@Override
	public void debug (Supplier<String> message) {
		
		// Print the info.
		if (logger.isDebugEnabled ()) {
			logger.debug (message.get ());
		}
	}

	
	@Override
	public void error (Supplier<String> message) {
		
		// Print the info.
		if (logger.isErrorEnabled ()) {
			logger.error (message.get ());
		}
	}

	
	@Override
	public void error (Supplier<String> message, Throwable t) {
		
		
		if (logger.isErrorEnabled ()) {
			logger.error (message.get ());
		}
	}	
}