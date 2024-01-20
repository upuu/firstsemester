package assign9;

import java.util.*;

public class tasktwo<T> { //generic class defined
	
	private T t;
	
	public void set(T t) {
		
		this.t = t;
		
	}
	
	public T get() {
		
		return t;
	}

	public static void main(String[] args) {
		
		tasktwo<String> stringobj = new tasktwo<String>();
		
		tasktwo<Integer> intobj = new tasktwo<Integer>();
		
		stringobj.set("This generic class can take strings! ");
		
		intobj.set(155);
		
		System.out.println("I instantiated two objects, one was created with T as a string and another as an int, the variable for the object string obj is: " + stringobj.get()
				+ "\n and the variable value for the object intobj is: " + intobj.get() );
		
		
		

	}

}
