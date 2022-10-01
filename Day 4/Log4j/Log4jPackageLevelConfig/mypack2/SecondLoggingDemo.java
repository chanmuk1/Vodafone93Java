package mypack2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecondLoggingDemo {
	
	private static Logger demologger = 
			                   LogManager.getLogger(SecondLoggingDemo.class.getName());
	
	public static void main(String[] args) {
		System.out.println("****************************");
		demologger.fatal("MYPACK2 - This is FATAL Message");
		demologger.error("MYPACK2 - This is ERROR Message - Database Connection FAIL");
		demologger.warn("MYPACK2 - This is WARN Message");
		demologger.info("MYPACK2 - THIS IS INFO MESSAGE - Database Connection SUCCESS");
		demologger.debug("MYPACK2 - This is DEBUG Message");
		demologger.trace("MYPACK2 - This is TRACE Message");
		
		System.out.println("****************************");
		demologger.fatal("MYPACK2 - This is FATAL Message");
		demologger.error("MYPACK2 - This is ERROR Message - Database Connection FAIL");
		demologger.warn("MYPACK2 - This is WARN Message");
		demologger.info("MYPACK2 - THIS IS INFO MESSAGE - Database Connection SUCCESS");
		demologger.debug("MYPACK2 - This is DEBUG Message");
		demologger.trace("MYPACK2 - This is TRACE Message");	
		
	}
}
