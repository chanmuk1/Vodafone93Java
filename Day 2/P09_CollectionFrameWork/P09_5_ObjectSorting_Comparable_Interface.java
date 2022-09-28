package P09_CollectionFrameWork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee1 implements Comparable<Employee1>
{
	  private String name;
	  private int empid;
	  
	  public Employee1(String name, int empid) 
	  {
	    this.name = name;
	    this.empid = empid;
	  }
	  
	  public String getName()
	  {
		  return name;
	  }
	  
	  public int getEmpId()
	  {
		  return empid;
	  }

	@Override
	public int compareTo(Employee1 empobj1) 
	{
		//ascending order by AGE
	    return this.empid - empobj1.getEmpId();
	    
		//ascending order by NAME
	    //return this.getName().compareTo(empobj1.getName());
	        
	    //descending order by AGE
	    //return empobj1.getEmpId() - this.empid;
	    
	  //descending order by NAME
	    //return empobj1.getName().compareTo(this.getName());
	}
}

public class P09_5_ObjectSorting_Comparable_Interface 
{
	public static void main(String[] args) 
	{
		List<Employee1> emplist = new ArrayList<Employee1>();
		
		emplist.add(new Employee1("David", 50));
		emplist.add(new Employee1("Naveen", 10));
		emplist.add(new Employee1("Alex", 80));
		emplist.add(new Employee1("Richard", 40));
		        
	    System.out.println("Before Sorting Names: ");
	    for(Employee1 eobj:emplist)
	    {
	    	System.out.println("Name - " + eobj.getName()+ " EMPID - "+eobj.getEmpId());
	    }
	    
	    Collections.sort(emplist);
	          
	    System.out.println("\n After Sorting Names \n");
	    for(Employee1 eobj:emplist)
	    {
	    	System.out.println("Name - " + eobj.getName()+ " EMPID - "+eobj.getEmpId());
	    }
	}
}