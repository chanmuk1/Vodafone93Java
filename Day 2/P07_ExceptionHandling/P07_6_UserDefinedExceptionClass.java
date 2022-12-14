package P07_ExceptionHandling;

import java.util.Scanner;

//USER DEFINED EXCEPTION CLASS

//1. SHOULD BE CHILD OF EXCEPTION CLASS
class UserDefinedExClass extends Exception
{
	private String msg;

	//2. CREATE CONSTRUCTOR
	public UserDefinedExClass(String msg) {
		this.msg = msg;
	}
	
	public String disp()
	{
		return msg;
	}
	
	//3. OVERRIDE TOSTRING METHOD
	@Override
	public String toString()
	{
		return msg;
	}
}

class Logic
{
    //public void voterOrNot() throws UserDefinedExClass
   public void voterOrNot() throws UserDefinedExClass //Exception
    {
      //try
      //{
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Age");
    	int age = sc.nextInt();
    	
    	if (age >= 18)
    		System.out.println("VALID VOTER");
    	else
    		throw new UserDefinedExClass("INVALID VOTER GENERATED BY THROW KEYWORD");
      
      //}catch(UserDefinedExClass e) {}	
     }
}

public class P07_6_UserDefinedExceptionClass {

	public static void main(String[] args) {
		Logic ob = new Logic();
	
		try
		{
		  ob.voterOrNot();
		  
		}catch(UserDefinedExClass e)
		 {
			System.out.println(e.disp());
			System.out.println(e.toString());
		 }
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.toString());
		}
	}
}
