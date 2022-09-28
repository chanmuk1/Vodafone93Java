abstract class AbstractClass_Parent
{
   abstract public void roomclean();
	
   public void feespayment() 
   {
	   System.out.println("DRAFT");
   }   
}

class AbstractClass_Child1 extends AbstractClass_Parent
{
	@Override
	public void roomclean() 
	{
       System.out.println("USING WATER");
	}
}

class AbstractClass_Child2 extends AbstractClass_Parent
{
	@Override
	public void roomclean() 
	{
		System.out.println("USING OTHER WAY");
	}
}

public class P01_AbstractClass 
{
	public static void main(String[] args) 
	{
		// Can't create object of an abstract class but reference can be created.
		//AbstractClass_Parent obj = new AbstractClass_Parent();
		
		AbstractClass_Child1 objch1 = new AbstractClass_Child1();
		objch1.feespayment();
		objch1.roomclean();
	
		AbstractClass_Child2 objch2 = new AbstractClass_Child2();
		objch2.feespayment();
		objch2.roomclean();
	}
}