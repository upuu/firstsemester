package assigneight;
import java.io.File;

public class partthree {
	
	public static void main(String[] args) {
		
		File MyFile = new File("myfile.txt");
		
		if(MyFile.delete()) {
			
			System.out.println("Deleted the file: " + MyFile.getName());
		
		} else {
			
			System.out.println("something went wrong and the file couldnt be deleted.");
		}
		
		
	}

}
