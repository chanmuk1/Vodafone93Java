//SIMPLE OR SINGLE INHERITENCE
class SINGLE_INHERITENCE_Parent
{
	//ACCESS SPECIFIER
	private int x = 10;
		
	public void f1()
	{
		System.out.println("INSIDE PARENT F1() METHOD" );
		System.out.println("Private - "+ x +"\n");
	}
}

class SINGLE_INHERITENCE_Child extends SINGLE_INHERITENCE_Parent
{
	public void f2()
	{
		System.out.println("INSIDE CHILD F2() METHOD" );
		//System.out.println("Private - "+ x);//Can't Access Parent PRIVATE MEMBER 
		System.out.println("Can't Access Parent PRIVATE MEMBER");
	}
}

public class P10_Simple_Inheritence {

	public static void main(String[] args) {
		
		//PARENT CLASS OBJECT CAN ONLY CALL ALL PARENT CLASS METHODS
		SINGLE_INHERITENCE_Parent obj_parent = new SINGLE_INHERITENCE_Parent();
		System.out.println("Using Parent Class Object");
		obj_parent.f1(); 
		
		//CHILD CLASS OBJECT CAN CALL ALL PARENT + CHILD CLASS METHODS
		SINGLE_INHERITENCE_Child obj_child = new SINGLE_INHERITENCE_Child();
		System.out.println("Using Child Class Object");
		obj_child.f1();
		obj_child.f2();
	}
}
