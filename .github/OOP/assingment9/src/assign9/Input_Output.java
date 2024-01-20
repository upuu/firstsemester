package assign9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Input_Output 
	{
	public static void main(String args[]) throws IOException
	{	 
	char c;
	BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	do
	{
	c = (char) obj.read();
	System.out.print(c);
	} while(c != 'q');
	}

}

