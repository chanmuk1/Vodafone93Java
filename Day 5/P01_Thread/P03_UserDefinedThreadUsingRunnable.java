package P01_Thread;

class Example implements Runnable 
{
	 Thread userdefinedthred;

	 public Example() 
	 {
	   	 //CREATE OBJECT OF THREAD CLASS means create user defined thread
		 userdefinedthred = new Thread(this, "USER Thread");
		 
		 System.out.println("USER thread: " + userdefinedthred);
		 
		 userdefinedthred.setPriority(6);
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

public class P03_UserDefinedThreadUsingRunnable 
{
	public static void main(String[] args) 
	{
		Example ob = new Example(); // create a new thread
		// new Example(); //NO Name Object Creation
		 
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