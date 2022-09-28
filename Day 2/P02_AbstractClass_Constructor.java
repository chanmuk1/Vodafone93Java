abstract class AbstractClass_Parent2
{
   abstract public void roomclean();
   
   //CONSTRUCTOR
   public AbstractClass_Parent2()
   {
	   System.out.println("INSIDE ABSTRACT CLASS CONSTRUCTOR");
   }
	
   public void feespayment() 
   {
	   System.out.println("DRAFT");
   }   
}

class AbstractClass_Child12 extends AbstractClass_Parent2
{
	//CONSTRUCTOR
	public AbstractClass_Child12()
	{
		//super();
		System.out.println("INSIDE CHILD CLASS CONSTRUCTOR");
	}
	
	@Override
	public void roomclean() 
	{
       System.out.println("USING WATER");
	}	
}

public class P02_AbstractClass_Constructor {

	public static void main(String[] args) {
		AbstractClass_Child12 obj_child = new AbstractClass_Child12();

	}

}
