package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		/*
		// Create a list of Integer values.
		List<Integer> nolist1 = Arrays.asList(7,-5,10,-3,12);
		System.out.println("Original list: " + nolist1);
				 
		// demonstration of map method
		List<Integer> squarelist = nolist1.stream().map(x -> x*x).
				                           collect(Collectors.toList());
		System.out.println("After Square list: " +squarelist);
		*/
		
		
		/*
		List<Integer> nolist1 = Arrays.asList(7,-5,10,-3,12);
		System.out.println("Original list: " + nolist1);
		
		// demonstration of forEach method only for display
		nolist1.stream().map(x->x*x).forEach(y -> System.out.println(y));
		System.out.println("Original list: " + nolist1);
		*/
		
		
		/*
		// create a list of String
	    List<String> namelist = Arrays.asList("Reflection","Service","Collection","School");
	  
	    // demonstration of filter method
	    List<String> result = namelist.stream().filter(s->s.endsWith("n")).
	                          						collect(Collectors.toList());
	    System.out.println("After Filtering: " +result);
	  */
		
	    
		/*
		List<Integer> list1 = Arrays.asList(7,-5,10,-3,12);
		System.out.println("Before Sorting: " +list1);
	    // demonstration of sorted method
	    List<Integer> sortedlist =
	            			list1.stream().sorted().collect(Collectors.toList());
	    System.out.println("After Sorting: " +sortedlist);
	  */
		
		/*
		List<String> list1 = Arrays.asList("Jay","Abir","Rik","Eshan","Chandan");
		System.out.println("Before Sorting: " +list1);
		// demonstration of sorted method
	    List<String> sortedlist =
	            			list1.stream().sorted().collect(Collectors.toList());
	    System.out.println("After Sorting: " +sortedlist);
	  
		*/
	  
	    /*	    
		List<Integer> nolist1 = Arrays.asList(7,5,10,3,12);
		System.out.println("Original list: " + nolist1);
	    // demonstration of reduce method
		// SUM OF ALL EVEN NO
	    int sumevenno =
	    		nolist1.stream().filter(x->x%2==1).reduce(0,(ans,i)-> ans+i);
	  
	    System.out.println("ALL EVEN NO SUM " + sumevenno);
        */
	}

}
