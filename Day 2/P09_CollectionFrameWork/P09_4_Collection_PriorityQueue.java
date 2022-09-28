package P09_CollectionFrameWork;

import java.util.PriorityQueue;

public class P09_4_Collection_PriorityQueue {

	public static void main(String[] args) {
		// Creating a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Using the add() method
        pq.add(40);
        pq.add(20);
        pq.add(60);
        System.out.println("PriorityQueue: " + pq);

        // Using the offer() method
        pq.offer(10);
        System.out.println("Updated PriorityQueue: " + pq);
        
     // Using the peek() method
        int val = pq.peek();
        System.out.println("Accessed Element: " + val);
        System.out.println("PriorityQueue: " + pq);
        
     // Using the poll() method
        int val1= pq.poll();
        System.out.println("Removed Element Using poll(): " + val1);
        System.out.println("PriorityQueue: " + pq);
        
     // Using the remove() method
        boolean result = pq.remove(40);
        System.out.println("Is the element 2 removed? " + result);
        System.out.println("PriorityQueue: " + pq);
	}
}