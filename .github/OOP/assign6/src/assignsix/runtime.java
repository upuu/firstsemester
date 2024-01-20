package assignsix;

public class runtime { 
	
	void message() {  //writing the message that will display upon calling this method, assuming the object is of this class
		
		System.out.println("hello, this is the parent class!");
			
	}
	
	public static void main(String[] args) {
		
		runtime object = new runtime(); //creating object of the parent class
		
		object.message(); //message is called for the first time
		
		object = new runtimechild(); //changing the variable "object" to an object of the first child class
		
		object.message(); //calling the same method after restating the "object" variable
		
		object = new runtimechildtwo(); //yet again altering the object var
		
		object.message(); //calling the method for the last time
		
	}

}

