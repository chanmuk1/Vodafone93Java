package P01_Thread;

class Example1 extends Thread 
{
	 Thread userdefinedthred;
	 public Example1() 
	 {
	   	 //CREATE OBJECT OF THREAD CLASS means create user defined thread
		 super("USER Thread");
		 
		 System.out.println("USER thread: " + this);
		 
		 userdefinedthred = this;
		 System.out.println("USER thread: " + userdefinedthred);
		 
		 userdefinedthred.start(); // Start the thread
	 }
	 
	 // This is the entry point for the user defined thread.
	 @Override
	 public void run() 
	 {
	    try 
	    {
	    	for(int i = 20; i > 0; i--) 
	    	{
	    		System.out.println("User Defined Thread: " + i);
	    		Thread.sleep(500);
	    	}
	    } catch (InterruptedException e) 
	      {
	    	 System.out.println("Child interrupted.");
	      }
	    
	    System.out.println("TERMINATE USER DEFINED THREAD..END RUN METHOD");
	 }
}


public class P04_UserDefinedThreadUsingThreadClassChild 
{
	public static void main(String[] args) 
	{
		Example1 ob = new Example1(); // create a new thread
		// new Example1(); //NO Name Object Creation
		 
		try 
		{
		  for(int i = 20; i > 0; i--) 
		  {
			  System.out.println("Main Thread: " + i);
			  Thread.sleep(1000);
		  }
		} catch (InterruptedException e) 
		  {
		     System.out.println("Main thread interrupted.");
		  }
		
		System.out.println("TERMINATING Main thread.");
	}
}
