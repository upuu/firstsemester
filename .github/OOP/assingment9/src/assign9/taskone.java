package assign9;

import java.util.*;

public class taskone {
	
	HashSet<String> family = new HashSet<String>(); //creating hashset
	
	Deque<String> deque = new ArrayDeque(); //creating a deque
	
	List<String> fruitbowl = new ArrayList<String>(); //list 
	
	public static void main(String[] args) {
		
		taskone test = new taskone();
		
		test.family.add("joe");
		test.family.add("bob");
		test.family.add("joe"); //this wont work since sets cannot have duplicate values
		
		System.out.println("This set contains: " + test.family.size() + " unique values! which are values: " + test.family);
		
		test.deque.addFirst("first place"); //adding some elements to the deque
		test.deque.addFirst("first place");
		test.deque.addLast("i am last!");
		
		System.out.println("this is how our deque looks initially: "  + test.deque);   
		
		test.deque.removeFirst();  //using some distinct deque functionality
		
		System.out.println("after using the removeFirst functionality, the deque looks like: " + test.deque);
		
		test.fruitbowl.add("apple");
		test.fruitbowl.add("apple"); //adding dupes to demonstrate functionality 
		test.fruitbowl.add("banana");
		test.fruitbowl.add("pear");
		test.fruitbowl.add("apple");
		
		
		System.out.println("arraylists contain indexed elements, and can accept duplicates! this list contains: " + test.fruitbowl + "as proof, the value at the 2nd index is: " + test.fruitbowl.get(2) );
		
	}
	
	
	
	
	
	
	
	
	

}
