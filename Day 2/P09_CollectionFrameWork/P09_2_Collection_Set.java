package P09_CollectionFrameWork;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
//import java.util.Set;
import java.util.TreeSet;

class SetDemo 
{
	// HashSet stores the elements by using a mechanism called hashing.
	// HashSet contains unique elements only.
	private HashSet<Integer> hashvalueset = new HashSet<Integer>();
	  //private Set<Integer> hashvalueset =  new HashSet<Integer>();

	
	// Contains unique elements only like HashSet.
	// Provides all optional set operations, and permits null elements.
	// Maintains insertion order.
	 private LinkedHashSet<Integer> linkvalueset = new LinkedHashSet<Integer>();
	 //private Set<Integer> linkvalueset =  new LinkedHashSet<Integer>();
	
	 // Contains unique elements only like HashSet.
	 // Access and retrieval times are quiet fast.
	 // Maintains ascending order.
	 private TreeSet<Integer> treevalueset = new TreeSet<Integer>();
	 //private Set<Integer> treevalueset =  new TreeSet<Integer>();
	  	  
	  private Scanner sc = new Scanner(System.in);
	  
	  private String reply="";
	  
	  public void userInput()
	  {
		  do
		  {
			  System.out.println("Enter Any Int Value & Give Duplicate Value");
			  int val =  sc.nextInt();
			 
			  //ADD TO HASH SET 
			  //NO DUPLICATE ALLOWED
			  //ADDING ORDER NOT FOLLOWED
			  hashvalueset.add(val);
			  
			  //ADD TO LINKED HASH SET 
			  //NO DUPLICATE ALLOWED
			  //ADDING ORDER FOLLOWED
			  linkvalueset.add(val);
			  
			 //ADD TO TREE SET :- AUTOMATICALLY SORTED 
			  //NO DUPLICATE ALLOWED
			  //ADDING ORDER NOT FOLLOWED
			  treevalueset.add(val);
			  
			  System.out.println("ADD MORE Y/N");
			  reply = sc.next();
			  
		  }while(reply.equalsIgnoreCase("y"));
	  }
	  
	  public void displayHashSet()
	  {
		 System.out.println("SIZE OF HASH SET IS " + hashvalueset.size());
		 System.out.println("HASH SET CONTAINS ");
		 
		 for(Integer ival : hashvalueset)
		 {
		     System.out.println(ival);
		 }
	  }
	  
	  public void displayLinkedHashSet()
	  {
		 System.out.println("SIZE OF LINKED HASH SET IS " + linkvalueset.size());
		 System.out.println("LINKED HASH SET CONTAINS ");
		 
		 for(Integer ival : linkvalueset)
		 {
		     System.out.println(ival);
		 }
	  }
	  
	  public void displayTreeSet()
	  {
		 System.out.println("SIZE OF TREE SET IS " + treevalueset.size());
		 System.out.println("TREE SET CONTAINS ");
		 
		 for(Integer ival : treevalueset)
		 {
		     System.out.println(ival);
		 }
	  }
	  
	  public void search()
	  {
		  System.out.println("Enter no u want to search");
		  int no = sc.nextInt();
		  boolean f = hashvalueset.contains(no);
		  //boolean f = linkvalueset.contains(no);
		  //boolean f = treevalueset.contains(no);
		  if(f)
			  System.out.println("FOUND");
		  else
			  System.out.println("NOT FOUND");
		  
	  }
	 
	  public void delete()
	  {
		  System.out.println("Enter Value u want to del");
		  int no = sc.nextInt();
		  hashvalueset.remove(no);
		  linkvalueset.remove(no);
		  treevalueset.remove(no);
	  }
}

public class P09_2_Collection_Set {

	public static void main(String[] args) {
		SetDemo obj = new SetDemo();
		obj.userInput();
		
		obj.displayHashSet();
		obj.displayLinkedHashSet();
		obj.displayTreeSet();
		
		System.out.println("SEARCHING RESULT...");
		obj.search();
		
		obj.delete();
		System.out.println("AFTER DELETE....");
		obj.displayHashSet();
		obj.displayLinkedHashSet();
		obj.displayTreeSet();

	}

}
