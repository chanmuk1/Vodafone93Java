package P09_CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Employee
{
	  private String name;
	  private int empid;
	  
	  public Employee(String name, int empid) 
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
}

class AgeComparator implements Comparator<Employee> 
{

   	@Override
    public int compare(Employee empobj1, Employee empobj2) 
    {
       //ascending order by AGE
       //return Integer.compare(empobj1.getEmpId(), empobj2.getEmpId());
       
       //descending order by AGE
       return Integer.compare(empobj2.getEmpId(),empobj1.getEmpId());
   }
}

class NameComparator implements Comparator<Employee> 
{

   	@Override
    public int compare(Employee empobj1, Employee empobj2) 
    {
       //ascending order by NAME
	   //return empobj1.getName().compareTo(empobj2.getName());
	   
	    
	  //descending order by NAME
	  return empobj2.getName().compareTo(empobj1.getName());
    }
}


public class P09_6_ObjectSorting_Comparator_Interface 
{
	public static void main(String[] args) 
	{
		List<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(new Employee("David", 50));
		emplist.add(new Employee("Naveen", 10));
		emplist.add(new Employee("Alex", 80));
		emplist.add(new Employee("Richard", 40));
		        
	    System.out.println("Before Sorting Names: ");
	    for(Employee eobj:emplist)
	    {
	    	System.out.println("Name - " + eobj.getName()+ " EMPID - "+eobj.getEmpId());
	    }
	    
	    //AgeComparator agecompobj = new AgeComparator();
	    //Collections.sort(emplist,agecompobj);
	    
	    NameComparator namecompobj = new NameComparator();
	    Collections.sort(emplist,namecompobj);
	    
	          
	    System.out.println("\n After Sorting Names \n");
	    for(Employee eobj:emplist)
	    {
	    	System.out.println("Name - " + eobj.getName()+ " EMPID - "+eobj.getEmpId());
	    }
	}
}