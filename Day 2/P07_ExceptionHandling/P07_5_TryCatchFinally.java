package P07_ExceptionHandling;

class C5
{
     public void f1()
     {
    	 try
    	 {
    	   System.out.println("1st Line INSIDE F1");
    	 
    	   int x = 9 / 0;
    	   
    	   System.out.println("Last Line Inside F1");
    	 }catch(ArithmeticException e)
    	  {
    		 System.out.println("INSIDE CATCH BLOCK "+ e.toString());
    	  }
    	  finally 
    	  {
    		 System.out.println("INSIDE FINALLY BLOCK ");
    		 System.out.println("FINALLY BLOCK ALWAYS EXECUTED");
          }
     }

     public void f2()
     {
    	 System.out.println("INSIDE F2");
     }

}

public class P07_5_TryCatchFinally {

	public static void main(String[] args) {
		C5 obj = new C5();
		obj.f1();
		obj.f2();

	}

}
