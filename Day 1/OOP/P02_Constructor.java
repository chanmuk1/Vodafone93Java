import java.util.Scanner;

class Person
{
	private String empid;
	private String name;
	private String city;
	
	private Scanner sc = new Scanner(System.in);
	
	//USER DEFINED NO ARGUMENT CONSTRUCTOR
	Person()
	{
		city = "Delhi"; 
	}
	
	public void userInput()
	{
		System.out.println("Enter Emp Id ");
		empid = sc.next();
		System.out.println("Enter Name ");
		name = sc.next();
	}
	
	public void display()
	{
		System.out.println("Emp Id is " + empid);
		System.out.println("Emp Name is " + name);
		System.out.println("Emp City is " + city);
	}
}

public class P02_Constructor {

	public static void main(String[] args) {
		Person emp1obj = new Person();
		Person emp2obj = new Person();
		
		emp1obj.userInput();
		emp1obj.display();
		
		emp2obj.userInput();
		emp2obj.display();

	}

}
