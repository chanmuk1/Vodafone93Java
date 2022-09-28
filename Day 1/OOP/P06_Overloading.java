class LearnOverloading
{
	//METHOD OVERLOADING
	public void area(int side)
	{
		System.out.println("Square Area " + (side * side));
	}
	
	/* NOT OVERLOADING
	public int area(int k)
	{
		System.out.println("Square Area " + (side * side));
	}*/
	
	public void area(int l,int b)
	{
		System.out.println("Rectangle Area " + (l * b));
	}
	
	public void area(double r)
	{
		System.out.println("Circle Area " + (22/7 * r * r));
	}
}

public class P06_Overloading {

	public static void main(String[] args) {
		LearnOverloading obj1 = new LearnOverloading();
				
        obj1.area(5.5);
        obj1.area(4);
        obj1.area(10,20);
	}
}
