//Multilevel INHERITENCE
class Multilevel_GrandParent
{
	private int x = 10;
	
	public void f1()
	{
		System.out.println("INSIDE GRAND PARENT F1() METHOD" );
		System.out.println("Private - "+ x +"\n");
	}
}

class Multilevel_Parent extends Multilevel_GrandParent
{
	public void f2()
	{
		System.out.println("INSIDE PARENT F2() METHOD" );
		//System.out.println("Private - "+ x);//Can't Access Parent PRIVATE MEMBER 
		System.out.println("Can't Access Parent PRIVATE MEMBER \n");
		
	}
}

class Multilevel_GrandChild extends Multilevel_Parent
{
	public void f3()
	{
		System.out.println("INSIDE GRAND CHILD F3()" );
		//System.out.println("Private - "+ x);//Can't Access Parent PRIVATE MEMBER 
		System.out.println("Can't Access Parent/GRAND PARENT PRIVATE MEMBER");
	}
}

public class P11_Multilevel_Inheritence 
{
	public static void main(String[] args) 
	{
		//GrandPARENT CLASS OBJECT CAN ONLY CALL ITS METHODS
		Multilevel_GrandParent obj_grandparent = new Multilevel_GrandParent();
		System.out.println("Using GrandParent Class Object");
		obj_grandparent.f1(); 
				
		//PARENT CLASS(Child of GrandParent) OBJECT CAN CALL ALL GRANDPARENT + IT's own METHODS
		Multilevel_Parent obj_parent = new Multilevel_Parent();
		System.out.println("Using PARENT CLASS(Child of GrandParent CLASS) Object");
		obj_parent.f1();
		obj_parent.f2();
		
		Multilevel_GrandChild obj_grandchild = new Multilevel_GrandChild();
		System.out.println("Using GrandChild CLASS(Child of Parent CLASS & Grandchild of GrandParent Class) Object");
		System.out.println("\nCALL GRANDPARENT F1 + PARENT F2 + IT's OWN F3 METHODS");
		obj_grandchild.f1();
		obj_grandchild.f2();
		obj_grandchild.f3();
	}
}