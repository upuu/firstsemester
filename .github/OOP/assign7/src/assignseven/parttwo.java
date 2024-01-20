package assignseven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class parttwo {

	public static void main(String[] args) {

		try {
			
			Scanner numbies = new Scanner(System.in);

			int a[] = {5, 5, 5};
			
			System.out.println("enter a number");
			int x = numbies.nextInt();
			
			System.out.println("enter a number to divide the first number by, the result will be indexed into an array containing 3 values.");
			int y = numbies.nextInt();
			
			int result = x/y;
			
			System.out.println(a[result]);

		}catch(ArithmeticException e) {
			System.out.println("you cannot divide by zero!");

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("that is not a valid index for this array.");

		}catch(InputMismatchException e) {
			System.out.println("that is not a valid integer!");
		
		}finally {
			System.out.println("the program has finished or has encountered an error, and will now terminate.");
		}






	
	}

}