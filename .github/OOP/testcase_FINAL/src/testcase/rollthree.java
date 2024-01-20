package testcase;

import java.util.Scanner;

import java.util.Random;

public class rollthree {
	
	
	public void gamestarter() {
		System.out.println("Hello there and welcome to my dice game! if you would like to play with two dice, type two, if you would like to play with one, type one.");
		
		Scanner choice = new Scanner(System.in);
		
		String selection = choice.nextLine();
		
		
		
		if(selection.equals("two")) {
			
			diegame();
		}
		else {
			diegameone();
		}
		
	}
	public void diegameone() {
		
		Random randy = new Random();
		
		int dice;
		Scanner onedie = new Scanner(System.in);
		
		String choicee = "yes";
		
			while(choicee.equals("yes")){
			System.out.println("welcome to the one die version of dice! please choose either high or low by typing high or low");
			
			String callone = onedie.nextLine();
			
			dice = randy.nextInt(7);
			
			
			
			if(dice >=4 && callone.equals("high")) {
				
				System.out.println("Congrats! you win! You called:" + callone + " and the roll was: " + dice);
				
			}else if (dice <=3 && callone.equals("low")) {
				
				System.out.println("Congrats! you win! You called:" + callone + " and the roll was: " + dice);
			
			}else {
				System.out.println("Sorry, you lost! You called: " + callone + " and the roll was: " + dice);
			}
			System.out.println("would you like to play again? type yes to continue, maybe to return to the menu, and anything else to exit");
			
			choicee = onedie.nextLine();
			
			if(choicee.equals("maybe")){
				gamestarter();
			}else if (choicee.equals("yes")) {
				continue;
			}else {
				break;
			}
				
			
			}
	}
	public void diegame() {
		
		int dieone;
		int dietwo;
		
		
		Scanner caller = new Scanner(System.in);
		
		Random rand = new Random();
		String x = "yes";
		while(x.equals("yes")) {
			
			System.out.println("please call high, low, or six by calling high, low, or six");
				
			String call = caller.nextLine();
			
			dieone = rand.nextInt(7);
			dietwo = rand.nextInt(7);
			
			int total = dieone + dietwo;
			
			if(total >=7 && call.equals("high")) {
				
				System.out.println("Congratulations! you win! your call was: " + call + " and the die roll was: " + total);		
				
			}
			else if(total <= 5 && call.equals("low")) {
				
				System.out.println("Congratulations! you win! your call was: " + call + " and the die roll was: " + total);
			}
			else if(total == 6 && call.equals("six")) {
				
				System.out.println("Congratulations! you win! your call was: " + call + " and the die roll was: " + total);
				
			}
			else {
				System.out.println("Sorry, you lose! Your call was: " + call + " and the die roll was: " + total);
			}
			
			
			System.out.println("would you like to play again? type yes to continue, maybe to return to the menu, and type anything else to exit the game.");
			
			x = caller.nextLine();
			
			if(x.equals("yes")) {
				continue;
			}else if (x.equals("maybe")) {
				gamestarter();
			}else {
				break;
			}
			
		
			}
		}
	

}
