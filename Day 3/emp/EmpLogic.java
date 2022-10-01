package emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpLogic {
	
	private ArrayList<EmpDetails> alist = new ArrayList<EmpDetails>();
	private Scanner sc = new Scanner(System.in);
	
	public void userInput()
	{
		EmpDetails emp;
		String reply="";
		do
		{
			emp = new EmpDetails();
			
			System.out.println("Enter Emp ID");
			int eid = sc.nextInt();
			emp.setEmpid(eid);
			
			System.out.println("Enter Emp Name");
			emp.setEmpname(sc.next());
			
			System.out.println("Enter Emp Email");
			emp.setEmpemail(sc.next());
			
			//ADD OBJECT INTO ARRAYLIST
			alist.add(emp);
			
			System.out.println("WANT TO ADD ANOTHER EMP Y/N ");
			reply = sc.next();
			
		}while(reply.equalsIgnoreCase("y"));
	}
		
	public void display()
	{
		for(EmpDetails empobj: alist)
		{
			System.out.println("EmpID is "+empobj.getEmpid());
			System.out.println("Emp Name is "+empobj.getEmpname());
			System.out.println("Emp Email is "+empobj.getEmpemail());
			System.out.println();
		}
	}
}
