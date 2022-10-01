package singleton;

class Singleton
{
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;
  
    // variable of type String
    private String s;
      
    // private constructor restricted to this class itself
    private Singleton()
    {
    	System.out.println("INSIDE CONSTRUCTOR WILL EXECUTE ONLY ONCE \n");
        s = "ChAnDaNsIr";
    }
  
    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
  
        return single_instance;
    }
    
    public String getS() {
		return s;
	}

	public void changetoUpperCase() 
	{
		s = s.toUpperCase();
	}
	
	public void changetoLowerCase() 
	{
		s = s.toLowerCase();
	}
}

public class Singleton_Pattern_Private_Constructor 
{
	public static void main(String[] args) 
	{
		// instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
  
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
  
        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();
        
//        System.out.println("USING X Object "+x.getS());
//        System.out.println("USING Y Object "+y.getS());
//        System.out.println("USING Z Object "+z.getS());
        
  
        // changing variable of instance x
        x.changetoUpperCase();
  
        System.out.println("String from x is " + x.getS());
        System.out.println("String from y is " + y.getS());
        System.out.println("String from z is " + z.getS());
        System.out.println("\n");
  
        // changing variable of instance z
        z.changetoLowerCase();
  
        System.out.println("String from x is " + x.getS());
        System.out.println("String from y is " + y.getS());
        System.out.println("String from z is " + z.getS());
	}

}
