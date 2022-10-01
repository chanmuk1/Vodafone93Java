package mypackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstLoggingDemo {
	
	private static Logger demologger = 
			                   LogManager.getLogger(FirstLoggingDemo.class.getName());
	
	public static void main(String[] args) {
		System.out.println("THIS WILL PRINT IN CONSOLE");
		demologger.fatal("MYPACK -This is FATAL Message");
		demologger.error("MYPACK - This is ERROR Message - Database Connection FAIL");
		demologger.warn("MYPACK - This is WARN Message");
		demologger.info("MYPACK - THIS IS INFO MESSAGE - Database Connection SUCCESS");
		demologger.debug("MYPACK - This is DEBUG Message");
		demologger.trace("MYPACK - This is TRACE Message");	
	}
}
