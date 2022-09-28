class LearnGC
{
	private int x , y; //Instance variable
	
	public LearnGC()
	{
		x = 50;
		y = 80;
	}
	
	public void display()
	{
		System.out.println(x + "  " + y);
	}
	
}

public class P04_GC {

	public static void main(String[] args) {
		LearnGC obj1 = new LearnGC();
		
		LearnGC obj2 = new LearnGC();
		
		obj2.display();
		obj1.display();
		
		obj2 = null;
		
		System.gc(); //Free Obj2 memory
		
		System.out.println("AFTER CALLING GC");
		obj1.display();
		
		//obj2.display(); //WILL GENERATE ERROR
	}

}
