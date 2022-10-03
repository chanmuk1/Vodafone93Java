package P01_Thread;

class ProgLogic1 
{
	 public void f1() 
	 {
	   for(int i = 1; i <= 10; i++ )
	   {
	        System.out.println(i);
	   }
	  
	   System.out.println("F1 Method Last Line");
	 }
}

//SYNC BCZ 1 ProgLogic class OBJECT SHARED BY ALL THE THREAD 
//CREATED ONSIDE MAIN AND PASS IT AS PARAMETER 

class ThreadLogic1 implements Runnable 
{
	 ProgLogic1 plobj;
	 Thread t;
	 
	 public ThreadLogic1(ProgLogic1 targ, String s) 
	 {
		 plobj = targ;
	     t = new Thread(this, s);
	     System.out.println(t);
	     t.start();
	 }
	 	
	 public void run() 
	 {
		 //The synchronized Statement
		 synchronized(plobj) 
		 { // synchronized block
			 plobj.f1();
	     }
     }
}

public class P06_SyncStatement 
{
	public static void main(String[] args) 
	{
		ProgLogic1 plobj1 = new ProgLogic1();
		
		ThreadLogic1 ob1 = new ThreadLogic1(plobj1, "FIRST OBJECT");
		ThreadLogic1 ob2 = new ThreadLogic1(plobj1, "SECOND OBJECT");
		ThreadLogic1 ob3 = new ThreadLogic1(plobj1, "THIRD OBJECT");

		
	}
}
