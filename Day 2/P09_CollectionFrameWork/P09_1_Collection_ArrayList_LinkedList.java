package P09_CollectionFrameWork;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;

class ArrayList_LinkedList 
{
	// Java ArrayList class can contain duplicate elements.
	// Java ArrayList class maintains insertion order.
	// Java ArrayList class is non synchronized.
	// Java ArrayList allows random access because array works at the index basis.
	// In Java ArrayList class, manipulation is slow because a lot of shifting needs 
	    // to be occurred if any element is removed from the array list.
	  
	 private ArrayList<Integer> valuelist = new ArrayList<Integer>();
	 //private List<Integer> valuelist1 =  new ArrayList<Integer>();

	  
	  // Java LinkedList class can contain duplicate elements.
	  // Java LinkedList class maintains insertion order.
	  // Java LinkedList class is non synchronized.
	  // In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
	  // Java LinkedList class can be used as list, stack or queue.
	
	  private LinkedList<Integer> lvaluelist = new LinkedList<Integer>();
	 //private List<Integer> lvaluelist =  new LinkedList<Integer>();
	  
	  private Scanner sc = new Scanner(System.in);
	  
	  private String reply="";
	  
	  public void userInput()
	  {
		  do
		  {
			  System.out.println("Enter Any Value & Give Duplicate Value");
			  int val =  sc.nextInt();
			 
			  //ADD TO ARRAY LIST
			  valuelist.add(val);
			  
			//ADD TO Linked LIST
			   lvaluelist.add(val);
			  
			  System.out.println("ADD MORE Y/N");
			  reply = sc.next();
			  
		  }while(reply.equalsIgnoreCase("y"));
	  }
	  
	  public void displayArrayList()
	  {
		 System.out.println("\n SIZE OF ARRAY LIST IS " + valuelist.size());
		 System.out.println("ARRAY LIST CONTAINS ");
		 
		 //USING FOR EACH LOOP
		 System.out.println("USING FOR EACH LOOP");
		 for(Integer ival : valuelist)
		 {
		     System.out.println(ival);
		 }
		 
		// System.out.println("USING FOR EACH LOOP");
		// valuelist.forEach(System.out::println);
	  }
	  
	  public void displayLinkedList()
	  {
		 System.out.println("\n SIZE OF LINKED LIST IS " + lvaluelist.size());
		 System.out.println("LINKED LIST CONTAINS ");
		 
		 for(Integer ival : lvaluelist)
		 {
		     System.out.println(ival);
		 }
	  }
	  
	 public void insertValueAtPosition()
	 {
		 System.out.println("\n Enter position no where u want to insert");
		 int index = sc.nextInt();
		 System.out.println("Enter Int Value u want to insert");
		 int val = sc.nextInt();
		 
		 valuelist.add(index, val);
		 lvaluelist.add(index, val);
	 }
	 
	 public void updateValue()
	 {
		 System.out.println("Enter position no where u want to UPDATE");
		 int index = sc.nextInt();
		 System.out.println("Enter NEW Int Value");
		 int val = sc.nextInt();
		 
		 valuelist.set(index, val);
		 lvaluelist.set(index, val);
	 }
	 
	  public void sort()
	  {
		  Collections.sort(valuelist);
		  Collections.sort(lvaluelist);
	  }
	  
	  public void search()
	  {
		  System.out.println("Enter no u want to search");
		  int no = sc.nextInt();
		  boolean f = valuelist.contains(no);
		  //boolean f = lvaluelist.contains(no);
		  
		  if(f)
			  System.out.println("FOUND");
		  else
			  System.out.println("NOT FOUND");
		  
	  }
	  
	  public void delete()
	  {
		  System.out.println("Enter Index no u want to del");
		  int no = sc.nextInt();
		  valuelist.remove(no);
		  lvaluelist.remove(no);
	  }
}

public class P09_1_Collection_ArrayList_LinkedList 
{
	public static void main(String[] args) 
	{
		ArrayList_LinkedList obj = new ArrayList_LinkedList();
		obj.userInput();
		obj.displayArrayList();
		obj.displayLinkedList();
		
		System.out.println();
		obj.insertValueAtPosition();
		obj.displayArrayList();
		obj.displayLinkedList();
		
		System.out.println();
		obj.updateValue();
		obj.displayArrayList();
		obj.displayLinkedList();
		
		System.out.println("AFTER SORTING.....");
		obj.sort();
		obj.displayArrayList();
		obj.displayLinkedList();
		
		System.out.println();
		obj.search();
		
		System.out.println();
		obj.delete();
		obj.displayArrayList();
		obj.displayLinkedList();
		
    }
}