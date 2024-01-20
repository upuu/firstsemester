package assign9;

import java.util.*;

public class taskthree {
	
	
	
	public static void main(String[] args) {
		
		Vector<Object> vec = new Vector<>(4,1);
		
		vec.addElement(15);
		
		vec.addElement("string");
		
		vec.addElement(2);
		
		vec.addElement(2);
		
		System.out.println("this vector is very similar to an array, but is synchronized. the capacity increment of this vector is " + vec.capacity() + "\n this vector looks like so:" + vec);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i<5; i++)
		{
			stack.push(i); //using the push functionality of stacks to add elements
		
		}
		System.out.println("after pushing ints 0-4 in that order onto the stack, it looks like this: " + stack);
		
		stack.pop();
		
		System.out.println("after using the pop() function once, the stack now looks like so: " + stack + ". These are a few of the unique utilities stacks offer!");
		
		
		
		
	}

}
