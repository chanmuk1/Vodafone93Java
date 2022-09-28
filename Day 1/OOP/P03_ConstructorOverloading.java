import java.util.Scanner;

class Employee
{
	private String empid;
	private String name;
	private String city;
	
	private Scanner sc = new Scanner(System.in);
	
	//CONSTRUCTOR OVERLOADING
	//USER DEFINED NO ARGUMENT CONSTRUCTOR
	Employee()
	{
		city = "Delhi";
	}
	//USER DEFINED 1 ARGUMENT CONSTRUCTOR
	Employee(String empcity)
	{
		city = empcity;
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
public class P03_ConstructorOverloading {

	public static void main(String[] args) {
		Employee emp1obj = new Employee("MUMBAI"); // WILL CALL 1 ARG CONSTRUCTOR
		Employee emp2obj = new Employee(); //WILL CALL NO ARG CONSTRUCTOR
		
		emp1obj.userInput();
		emp1obj.display();
		
		emp2obj.userInput();
		emp2obj.display();

	}

}
