package P01_Thread;

public class P02_MainThreadStoreInObject 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
	    System.out.println("Current thread: " + t);
		
	    // change the name of the thread
		t.setName("My Thread");
		t.setPriority(7);
		System.out.println("After name change: " + t);
		
		try 
		{
		  for(int n = 5; n > 0; n--) 
		  {
		     System.out.println(n);
		     Thread.sleep(2000);//milli sec
		  }
		}catch(InterruptedException e) 
		 {
		    System.out.println("Main thread interrupted");
		 }
	}
}