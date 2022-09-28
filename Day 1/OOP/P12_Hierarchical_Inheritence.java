class Hierarchical_Parent
{ 
    private int x = 10;
	
	public void parentFunction()
	{
		System.out.println("INSIDE Hierarchical_Parent parentFunction() METHOD" );
		System.out.println("Private - "+ x +"\n");
	}	

}

class Hierarchical_Child1 extends Hierarchical_Parent
{ 
	public void f1()
	{
		System.out.println("INSIDE Hierarchical_Child1 F1() METHOD" );		
	}		
}

class Hierarchical_Child2 extends Hierarchical_Parent
{
	public void f2()
	{
		System.out.println("INSIDE Hierarchical_Child2 F2() METHOD" );		
	}		
}

class Hierarchical_Child3 extends Hierarchical_Parent
{
	
	public void f2()
	{
		System.out.println("INSIDE Hierarchical_Child3 F2() METHOD" );		
	}		
}


public class P12_Hierarchical_Inheritence {

	public static void main(String[] args) {
		Hierarchical_Child1 child1obj = new Hierarchical_Child1();
		child1obj.parentFunction();
		child1obj.f1();
		
		System.out.println("\n FUNCTION CALL USING CHILD2 CLASS OBJECT");
		Hierarchical_Child2 child2obj = new Hierarchical_Child2();
		child2obj.parentFunction();
		child2obj.f2();
		
		System.out.println("\n FUNCTION CALL USING CHILD3 CLASS OBJECT");
		Hierarchical_Child3 child3obj = new Hierarchical_Child3();
		child3obj.parentFunction();
		child3obj.f2();

	}

}
