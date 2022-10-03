package P01_Thread;

class A1
{
    public void f1()
    {
    	Thread t = Thread.currentThread();
	    System.out.println("Current thread: " + t);
    	
	    System.out.println("INSIDE A1 Class F1 Method");
    	for(int i=1;i<=10;i++)
    		System.out.println("INSIDE A1 Class F1 " + i);
    }
}

//THREAD iS AN OBJECT OF THREAD CLASS
// System Defined Thread which is created by OS and assigned it 
// to execute our code. That thread is called as main thread.

public class P01_SingleMainThread 
{
	public static void main(String[] args) 
	{
		A1 obj1 = new A1();
		obj1.f1();
		
		System.out.println("INSIDE main Method");
    	for(int i=1;i<=10;i++)
    		System.out.println("INSIDE main "+i);

	}

}
