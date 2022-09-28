
class A1
{
   private int x = 50;
   private static int y = 60;
   
   public void f1()
   {
	   System.out.println(x);
	   System.out.println(y);
	   f2();
   }
   
   public static void f2()
   {
	   //System.out.println(x);
	   System.out.println(y);
	   //f1();
   }

}

class A2
{
   static class A3
   {  }

}


public class StaticExample {

	public static void main(String[] args) {
//		A1 obj1 = new A1();
//		obj1.f1();
		
		A1.f2();
		

	}

}
