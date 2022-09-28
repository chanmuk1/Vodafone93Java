class BlockExample
{
	//STATIC BLOCK
	static
	{
		System.out.println("INSIDE STATIC BLOCK..");
	}
	
	//ANONYMOUS BLOCK
	{
		System.out.println("INSIDE Anonymous BLOCK..");
	}
	
	//CONSTRUCTOR
	public BlockExample(String msg)
	{
		System.out.println(msg + "INSIDE Constructor..");
	}
	
	//STATIC METHOD
	public static void f1()
	{
		System.out.println("INSIDE F1");
	}

}

public class P08_ConstructorStaticBlockAnonymousBlock {

	public static void main(String[] args) {
		BlockExample obj = new BlockExample("1st Object CREATE ");
		BlockExample obj1 = new BlockExample("2nd Object CREATE ");
		
//		BlockExample.f1();
//		BlockExample.f1();
	}

}
