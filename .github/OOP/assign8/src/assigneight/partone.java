package assigneight;

import java.io.File;

import java.io.IOException;


public class partone {
	
	public static void main(String[] args) {
		
		try {
			
			File txtfile = new File("myfile.txt");
			
			if(txtfile.createNewFile()) {
				 
				System.out.println("file " + txtfile.getName() + " created at: " + txtfile.getAbsolutePath());
				
			} else {
				
				System.out.println("that file already exists.");
			}
			
			} catch (IOException i) {
				
				System.out.println("an error of type IOException occured");
				
				i.printStackTrace();
				
				
				
			}
			
			
		}
	}


