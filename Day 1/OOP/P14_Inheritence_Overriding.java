class Inheritence_Overriding_Parent
{
	public void disp()
	{
		System.out.println("INSIDE PARENT Class DISPLAY..");
	}
}

class Inheritence_Overriding_Child extends Inheritence_Overriding_Parent
{
	//METHOD OVERRIDING
	@Override
	public void disp()
	{
	   super.disp();
	   System.out.println("INSIDE CHILD Class - OVERRIDED DISPLAY METHOD");	
	   super.disp();
	}
}

public class P14_Inheritence_Overriding {

	public static void main(String[] args) {
		Inheritence_Overriding_Child obj_child = new Inheritence_Overriding_Child();
		obj_child.disp();
	}

}
