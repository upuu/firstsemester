package testcase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  //imports
import java.util.Random;
import java.io.*;

public class rolltwo extends JFrame { //class declaration with JFrame as superclass
	
	private int die1,die2;  //some global variables
	private int total;     // die rolls and total of both
	
	
	public rolltwo() { //default constructor overloaded
		
		super("dice game!"); //title on top on window
		setPreferredSize(new Dimension(400,300)); //set frame dimensions
		setDefaultCloseOperation(EXIT_ON_CLOSE); //make the app exit when its closed
		pack(); //make it fit window size regardless
		
		startermethod(); //call method containing body of program
	}
	
	private void startermethod(int c) throws IOException {  //starter method with parameter, used for printing to file
			File f = new File("testcase.txt");
			try (FileWriter fw = new FileWriter(f, true)){
			fw.write(String.valueOf(c)); //prints total of last rolls to a file f
			fw.close();
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}catch (IOException e) {
			e.printStackTrace();
			}		
	}	
	
	
	
	
	private void startermethod() { //method declaration
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();  //gui objects created
		
		Random randy = new Random();
		
		JButton rollButton = new JButton("press this to roll two dice!");
		
		
		
		rollButton.setBounds(250,550,200,50); //setting specifications for the GUI button
		rollButton.addActionListener(new ActionListener() { //adding an object of the ActionListener and overriding its method actionPerformed
			@Override
			public void actionPerformed(ActionEvent e) {
				rollButton.setEnabled(false); 
				die1 = randy.nextInt(1, 7);
				die2 = randy.nextInt(1,7);
				total = die1 + die2;
				
				JOptionPane.showMessageDialog(frame.getComponent(0), total); //on button press, causes die to be randomized and total to be printed
				
				try {
					startermethod(total); //calling the first method to print total to file
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				rollButton.setEnabled(true); //re-enabling the rollButton to allow the application to be used over and over again
			}
		});
		panel.add(rollButton); //adding the button to the main panel
		
		
		this.getContentPane().add(rollButton);
		
	}
	
	
	public static void main(String[] args) { //main method, uses swing util to 
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() { //running a new instance of rolltwo() and calling its constructor, which calls the setup method
				new rolltwo().setVisible(true);
			}
		});
	}
}
				
				
				
				
			
			
		
		
	

