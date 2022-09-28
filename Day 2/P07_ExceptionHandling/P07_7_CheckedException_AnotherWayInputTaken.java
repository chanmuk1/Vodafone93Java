package P07_ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AnotherWay
{
	BufferedReader br = new BufferedReader
			            (new InputStreamReader(System.in));
    public void userInput1()
    {
      try
      {
    	System.out.println("Enter name ");
    	String name = br.readLine();
    	
    	System.out.println("UR name is "+ name);
      }catch(IOException e)
       {
    	  System.out.println("INSIDE CATCH");
       }
    }
    
    public void userInput2() throws IOException
    {
      	System.out.println("Enter name ");
    	String name = br.readLine();
    	
    	System.out.println("UR name is "+ name);
    }
    
}

public class P07_7_CheckedException_AnotherWayInputTaken {

	public static void main(String[] args) {
		AnotherWay ob = new AnotherWay();
		ob.userInput1(); 
        
		 try
	      {
			 ob.userInput2();
	      }catch(IOException e)
	       {
	    	  System.out.println("INSIDE CATCH");
	       }
	}
    
	/*public static void main(String[] args) throws IOException 
	{
		AnotherWay ob = new AnotherWay();
	    ob.userInput2();
	}*/
}
