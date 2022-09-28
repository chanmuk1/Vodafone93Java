
public class P08_Autoboxing 
{
	public static void main(String[] args) 
	{
		int x = 10;
		
		Integer obj1 = new Integer(10);
		Integer obj2 = 100;//AUTOBOXING
		Integer obj3 = obj1 + obj2; //UNBOXING for obj11, obj2 BOXING for obj3
		System.out.println(obj3); //UNBOXING
	}
}