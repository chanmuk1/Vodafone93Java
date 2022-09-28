package P07_ExceptionHandling;

class C4
{
     public int f1()
     {
    	 try
    	 {
    	   System.out.println("1st Line INSIDE F1");
    	 
    	   int x = 9 / 1;
    	   
    	   return 5;
    	   //System.out.println("Last Line Inside F1");
    	 }finally 
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

public class P07_4_FinallyMain {

	public static void main(String[] args) {
		C4 obj = new C4();
		obj.f1();
		obj.f2();


	}

}
