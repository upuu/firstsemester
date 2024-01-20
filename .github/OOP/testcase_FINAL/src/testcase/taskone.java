package testcase;

public class taskone {
	int result;
	int aa;
	int bb;
	void addition(int a, int b) {
		
		aa = a;
		bb = b;
		
		result = aa+bb;
		
		
		System.out.println("the result is: " + result);
	}
	
	void subtraction (int c, int d) {
		aa = c;
		bb = d;
		result = aa-bb;
		
	}
	
	

	void result() {
		System.out.println("final value is: " + result);
	}
	
	void reset() {
		
		result = 0;
		aa = 0;
		bb = 0;
		
	}
	
	public static void main(String[] args) {  //a simple class to give the result of the 
											  //most recent calculation
		taskone dummy = new taskone();
		dummy.subtraction(2, 4);
		dummy.result();
		
		
	}
}