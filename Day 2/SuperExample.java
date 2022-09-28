class A4
{
   int  k = 10;
   A4()
   {
	 System.out.println("A4 CONSTRUCTOR");
   }	
}

class A5 extends A4
{
	int k=20;
	A5()
	{
	  //super();
	  System.out.println("A5 CONSTRUCTOR");
	  System.out.println(k+ " "+ super.k);
	}
}

public class SuperExample {

	public static void main(String[] args) {
		A5 obj = new A5();

	}

}
