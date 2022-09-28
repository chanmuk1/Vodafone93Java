package P07_ExceptionHandling;

class C1
{
     public void f1()
     {
    	 System.out.println("1st Line INSIDE F1");
    	 
    	 int x = 9 / 0;
    	 
    	 System.out.println("Last Line Inside F1");
     }

     public void f2()
     {
    	 System.out.println("INSIDE F2");
     }
}

public class P07_1_WithOutExceptionHandle {

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.f1();
		obj.f2();
	}
}
