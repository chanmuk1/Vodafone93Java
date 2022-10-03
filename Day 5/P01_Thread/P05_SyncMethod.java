package P01_Thread;

class ProgLogic 
{
	 public synchronized void f1() 
	 {
	   try 
	   {
		 for(int i = 1; i <= 7; i++ )
		 {
	        System.out.println(i);
	        Thread.sleep(1000);
		 }
	   } catch(InterruptedException e) 
	     {
	         System.out.println("Interrupted");
	     }
	   System.out.println("F1 Method Last Line");
	 }
}

//SYNC BCZ 1 ProgLogic class OBJECT SHARED BY ALL THE THREAD 
//CREATED ONSIDE MAIN AND PASS IT AS PARAMETER 

class ThreadLogic implements Runnable 
{
	 private ProgLogic plobj;
	 private Thread t;
	 
	 public ThreadLogic(ProgLogic targ, String s) 
	 {
		 plobj = targ;
	     t = new Thread(this, s);
	     System.out.println(t);
	     t.start();
	 }
	 
	 public void run() 
	 {
		 plobj.f1();
	 }
}


public class P05_SyncMethod 
{
	public static void main(String[] args) 
	{
		ProgLogic plobj1 = new ProgLogic();
		
		ThreadLogic ob1 = new ThreadLogic(plobj1, "FIRST OBJECT");
		ThreadLogic ob2 = new ThreadLogic(plobj1, "SECOND OBJECT");
		ThreadLogic ob3 = new ThreadLogic(plobj1, "THIRD OBJECT");
		 
		
	}
}
