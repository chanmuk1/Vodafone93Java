package mypack2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecondLoggingDemo {
	
	private static Logger demologger = 
			                   LogManager.getLogger(SecondLoggingDemo.class.getName());

	public static void main(String[] args) {
		System.out.println("****************************");
		demologger.fatal("This is FATAL Message");
		demologger.error("This is ERROR Message - Database Connection FAIL");
		demologger.warn("This is WARN Message");
		demologger.info("THIS IS INFO MESSAGE - Database Connection SUCCESS");
		demologger.debug("This is DEBUG Message");
		demologger.trace("This is TRACE Message");
		
		System.out.println("****************************");
		demologger.fatal("This is FATAL Message");
		demologger.error("This is ERROR Message - Database Connection FAIL");
		demologger.warn("This is WARN Message");
		demologger.info("THIS IS INFO MESSAGE - Database Connection SUCCESS");
		demologger.debug("This is DEBUG Message");
		demologger.trace("This is TRACE Message");	
	}
}
