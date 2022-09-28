/* An interface with exactly one abstract method becomes Functional 
  * Interface. We don’t need to use @FunctionalInterface annotation 
  * to mark an interface as Functional Interface. 
  * @FunctionalInterface annotation is a facility to avoid 
  * accidental addition of abstract methods in the functional 
  * interfaces.
  */

//INTERFACE
//1. NORMAL
//2. Functional
//3. MARKER - [Serializable] INTERFACE DOES NOT CONTAIN's ANY ABSTRACT METHOD 

//define a functional interface
@FunctionalInterface
interface FuncInterface 
{
    void func1(double x, int y);
    //void func2();
    
    default void normalFun()
    {
       System.out.println("INSIDE FUNCTIONAL INTERFACE NORMAL METHOD");
    }
    
    static void staticFunc()
    {
       System.out.println("INSIDE FUNCTIONAL INTERFACE STATIC METHOD");
    }
}

public class P04_Functional_Interface_LambdaFunction 
{
	public static void main(String[] args) 
	{
		FuncInterface faddobj = (double a, int b)-> System.out.println("THE SUM IS "+(a+b));
		
		faddobj.func1(20.25, 10);
		
        FuncInterface fmulobj = (double a, int b)-> System.out.println("THE MUL IS "+(a*b));
		
		fmulobj.func1(20.25, 10);
	}
}