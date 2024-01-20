package assignsix;

public class compile { //for task#2
	
	static void average(int a, int b) {
		
		System.out.println("the average of your two numbers is: " + (a+b)/2);
	}
	
	static void average(int a, int b, int c) {
		
		System.out.println("The average of your three numbers is: " + (a+b+c)/3);
		

	}

	public static void main(String[] args) { //two methods with different parameters have been created
		
		average(2, 4); //the same-name method is called
		
		average(7,7,4);//but with different parameters, resulting in compile-time polymorphism through method overloading
		
		
		
	}
}
