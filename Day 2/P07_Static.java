class LearnStatic
{
	private int x; //NORMAL VARIABLE
	private static int y; //STATIC VARIABLE
	
	public LearnStatic()
	{
		x = 50;
	}
	
	//STATIC METHOD
	public static void f1() 
	{
		System.out.println("INSIDE STATIC METHOD F1");
		System.out.println("VALUE OF y INSIDE F1 " + y);
		y++;
		//System.out.println("VALUE OF x INSIDE F1 " + x);
	}
	
	//STATIC METHOD
	public static void f2() 
	{
		System.out.println("\nINSIDE STATIC METHOD F2");
		System.out.println("VALUE OF y INSIDE F2 " + y);
	}

	//NORMAL METHOD
	public void f3() 
	{
		System.out.println("\nINSIDE NORMAL METHOD F3");
		System.out.println("VALUE OF Static y INSIDE F3 " + y);
		System.out.println("VALUE OF Normal x INSIDE F3 " + x);
		x++;
		y++;
	}
	
	public void f4() 
	{
		System.out.println("\nINSIDE NORMAL METHOD F4");
		System.out.println("VALUE OF STATIC y INSIDE F4 " + y);
		System.out.println("VALUE OF NORMAL x INSIDE F4 " + x);
	}
	
	//STATIC BLOCK
	static
	{
		System.out.println("INSIDE STATIC BLOCK..IT EXECUTE FIRST");
	}
}

//OUTER CLASS
class LearnStatic_1
{
    //INNER CLASS
	static class LearnStatic_2
    {
    	
    }
}

public class P07_Static {

	public static void main(String[] args) {
		//LearnStatic.f1();
		//LearnStatic.f2();
		
		LearnStatic obj1 = new LearnStatic();
		LearnStatic obj2 = new LearnStatic();
		
		obj1.f3(); //CLASSNAME.METHODNAME()
		obj2.f4();
		
		//obj1.f4();
	}
}
