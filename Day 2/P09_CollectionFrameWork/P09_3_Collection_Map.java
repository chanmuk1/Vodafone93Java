package P09_CollectionFrameWork;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class MapDemo 
{
	// A HashMap contains values based on the key.
	// It contains only unique elements.
	// It may have one null key and multiple null values.
	// It maintains no order.
    private HashMap<Integer,String> hashmaplist = new HashMap<Integer,String>();
	//private Map<Integer,String> hashmaplist =  new HashMap<Integer,String>();

    
   //It is same as HashMap instead maintains insertion order.
	 private LinkedHashMap<Integer,String> linkedhashmaplist = new LinkedHashMap<Integer,String>();
	 //private Map<Integer,String> linkedhashmaplist =  new LinkedHashMap<Integer,String>();
	
	 
	 // A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
	 // It contains only unique elements.
	 // It cannot have null key but can have multiple null values.
	 // It is same as HashMap instead maintains ascending order.
	 private TreeMap<Integer,String> treemaplist = new TreeMap<Integer,String>();
	 //private Map<Integer,String> treemaplist =  new TreeMap<Integer,String>();
	  
	 private Scanner sc = new Scanner(System.in);
	  
	  private String reply="";
	  
	  public void userInput()
	  {
		  do
		  {
			  System.out.println("Enter int key Value & Don't Give Duplicate Value");
			  int key =  sc.nextInt();
			  System.out.println("Enter STRING Value & U can Enter Duplicate Value");
			  String value =  sc.next();
			 
			  //ADD TO HASH MAP
			  hashmaplist.put(key,value);
			  
			  //ADD TO Linked HASH MAP
			  linkedhashmaplist.put(key,value);
			  
			//ADD TO TREE MAP
			  treemaplist.put(key,value);
			  
			  System.out.println("ADD MORE Y/N");
			  reply = sc.next();
			  
		  }while(reply.equalsIgnoreCase("y"));
	  }
	  
	  public void displayHashMap()
	  {
		 System.out.println("SIZE OF HASH MAP IS " + hashmaplist.size());
		 System.out.println("HASH MAP CONTAINS ");
		 
		 //USING JAVA 8 LAMBDA EXPRESSION 
		// System.out.println("Using JAVA 8 LAMBDA EXPRESSION FOR EACH");
		// hashmaplist.forEach((k, v) -> System.out.println("Key IS: " + k + ", VALUE IS: " + v));
		 
		 
		 // USING FOR EACH LOOP
		 for(Integer key : hashmaplist.keySet())
		 {
			 String value = hashmaplist.get(key);
		     System.out.println("Key IS: " + key +", VALUE IS: " +value);
		 } 
		 
	  }
	  
	  public void displayLinkedHashMap()
	  {
		 System.out.println("SIZE OF LINKED HASH MAP IS " + linkedhashmaplist.size());
		 System.out.println("LINKED HASH MAP CONTAINS ");
		 
		// USING FOR EACH LOOP
		for(Integer key : linkedhashmaplist.keySet())
		{
			 String value = linkedhashmaplist.get(key);
			 System.out.println("Key IS: " + key +", VALUE IS: " +value);
		}
	  }
	  
	  public void displayTreeMAP()
	  {
		 System.out.println("SIZE OF TREE MAP IS " + treemaplist.size());
		 System.out.println("TREE MAP CONTAINS ");
		 
		 for(Integer key : treemaplist.keySet())
		 {
			  String value = treemaplist.get(key);
			  System.out.println("Key IS: " + key +", VALUE IS: " +value);
		 }
	  }
	  
	  public void search()
	  {
		  System.out.println("Enter key no u want to search");
		  int key = sc.nextInt();
		  boolean f = hashmaplist.containsKey(key);
		  //boolean f = linkedhashmaplist.contains(no);
		  //boolean f = treemaplist.contains(no);
		  if(f)
		  {
			  System.out.println("FOUND & VALUE IS " + hashmaplist.get(key));
			  //System.out.println("FOUND & VALUE IS " + linkedhashmaplist.get(key));
			  //System.out.println("FOUND & VALUE IS " + treemaplist.get(key));
		  }
		  else
			  System.out.println("NOT FOUND");
	  }
	  
	  public void delete()
	  {
		  System.out.println("Enter key u want to del");
		  int key = sc.nextInt();
		  hashmaplist.remove(key);
		  linkedhashmaplist.remove(key);
		  treemaplist.remove(key);
	  }
}

public class P09_3_Collection_Map {

	public static void main(String[] args) {
		MapDemo obj = new MapDemo();
		obj.userInput();
		
		obj.displayHashMap();
		System.out.println();
		obj.displayLinkedHashMap();
		System.out.println();
		obj.displayTreeMAP();
		
		System.out.println();
		System.out.println("SEARCHING RESULT...");
		obj.search();
		
		System.out.println();
		obj.delete();
		System.out.println("AFTER DELETE....");
		obj.displayHashMap();
		System.out.println();
		obj.displayLinkedHashMap();
		System.out.println();
		obj.displayTreeMAP();

	}

}
