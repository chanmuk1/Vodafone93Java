public class P05_FinalizeMethod
{
	public static void main(String[] args) {
		P05_FinalizeMethod obj1 = new P05_FinalizeMethod();
		P05_FinalizeMethod obj2 = new P05_FinalizeMethod();
        
        obj1.finalize(); // Explicit call to finalize method
        
        obj1 = null;
        System.out.println("Garbage collector is called");
        
        System.gc(); //Implicit call to finalize() method
	}
	
	@Override
    protected void finalize()
    {
        System.out.println("Finalize method is called.");
    }  
}
