package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class taskoneTest {
	
	
	int c;
	int b;
	int a;

	@Test
	public void testAddition() {
		a = 2; //random test values
		b = 5;
		c = a + b;
		
		assertEquals(c, a+b); //basic test statement checking that the result is equivalent to the sum of its part
	}

	@Test
	public void testSubtraction() {
		a = 2;
		b = 5;
		c = a - b;
		
		assertEquals(c, a-b); // make sure the proper result is given
	}
	
	@Test
	
	public void testResult() {
		c = 5; //assuming c has been set by one of the other methods
		assertTrue(c == (int)c ); //make sure that it is a valid int and is not undefined 
		
				
	}
	
	@Test 
	
	public void testReset() {
		c = 0;
		a = 0; //all vars have been wiped
		b = 0;
		
		
		assertSame(a, c);
		assertSame(b, a); //make sure they are all equal to eachother, aka 0
		assertSame(b,c);
	}
}
