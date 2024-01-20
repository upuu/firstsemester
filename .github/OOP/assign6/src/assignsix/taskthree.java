package assignsix;

abstract class taskthree { //for task#3
	
	abstract void flavor(); //defining an abstract method 
	
	
	public static void main(String[] args) {
		
		lemon lem = new lemon();
		
		sugar sug = new sugar();
		
		lem.flavor();
		
		sug.flavor();
	}

}
