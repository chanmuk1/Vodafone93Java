package P07_ExceptionHandling;

class C3
{
     public void f1()
     {
    	 try
    	 {
    	   System.out.println("1st Line INSIDE F1");
    	 
    	   int x = 9 / 0;
    	   
//    	   int a[] = new int[5];//index no 0 1 2 3 4
//    	   a[15] = 50;
//    	   
//    	   C2 ob = null;
//    	   ob.f2();
//    	 
    	   System.out.println("Last Line Inside F1");
    	 }catch(ArithmeticException e) 
    	  {
    		 System.out.println("INSIDE AE CATCH BLOCK " +e.toString());
          }
    	 catch(ArrayIndexOutOfBoundsException e)
    	 {
    		 System.out.println("INSIDE AIOFB CATCH BLOCK " +e.toString());
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println("INSIDE EX CATCH BLOCK " +e.toString());
    	 }
     }

     public void f2()
     {
    	 System.out.println("INSIDE F2");
    	 try
    	 {
    	    int x = 9 / 0;
    	     	   
    	 // int a[] = new int[5];//index no 0 1 2 3 4
    	 // a[15] = 50;
    	     	   
    	 // C2 ob = null;
    	 // ob.f2();
    	     	 
    	    System.out.println("Last Line Inside F1");
    	 }catch(Exception e){}
    	  //UNREACHABLE CODE
//    	  catch(ArrayIndexOutOfBoundsException e){}
//    	  catch(ArithmeticException e){}
     }

}

public class P07_3_TryMultipleCatch {

	public static void main(String[] args) {
		C3 obj = new C3();
		obj.f1();
		obj.f2();

	}

}
