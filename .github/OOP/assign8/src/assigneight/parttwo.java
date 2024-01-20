package assigneight;
import java.io.FileWriter;
import java.io.IOException;


public class parttwo {
	
	
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("myfile.txt");
			
			writer.write("My first java file content!");
			
			writer.close();
			
			System.out.println("file has been written to.");
			
		} catch (IOException i) {
			System.out.println("something went wront and an error occured.");
			i.printStackTrace();
		}
		
	}
}
	


