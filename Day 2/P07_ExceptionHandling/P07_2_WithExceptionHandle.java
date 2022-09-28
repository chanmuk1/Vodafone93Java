package P07_ExceptionHandling;

class C2
{
     public void f1()
     {
    	 try
    	 {
    	   System.out.println("1st Line INSIDE F1");
    	 
    	   int x = 9 / 0;
    	   
//    	  int a[] = new int[5];//index no 0 1 2 3 4
//    	   a[15] = 50;
    	   
//    	   C2 ob = null;
//    	   ob.f2();
    	 
    	   System.out.println("Last Line Inside F1");
    	 }catch(Exception e) 
    	  {
    		 System.out.println("INSIDE CATCH BLOCK " +e.toString());
          }
     }

     public void f2()
     {
    	 System.out.println("INSIDE F2");
     }

}
public class P07_2_WithExceptionHandle {

	public static void main(String[] args) {
		C2 obj = new C2();
		obj.f1();
		obj.f2();

	}

}
