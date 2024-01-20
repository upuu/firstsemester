package assignfive;

public class member {  //parent class and its data members
	String Name;
	int Age;
	String PhoneNumber;
	String Address;
	int Salary;
	
	void printsalary() { //requested salary method
		
		System.out.println(Salary);
	}
	
	void setData(String n, int a, String p, String ad, int s) { //creating a method to make it easier to set data values later on
		
		Name = n;
		Age = a;
		PhoneNumber = p;
		Address = ad;
		Salary = s;
	}
	void printData() { //method for printing out the objects data, placing here in case a child uses it
		
		System.out.println("This entity is named: " + Name + ". Is the age of: " + Age +
		". Has a phone number of: " + PhoneNumber + ". Has an address of: " + Address + ". And, has a salary of: " + Salary + ".");
	
	}
	
	public static void main(String[] args) { //main method for creating objects and using methods
		
		Employee em = new Employee(); //defining the employee object
		
		Manager m = new Manager(); //defining the manager object
		
		em.setData("Rowan", 20, "6133334321", "25 Cranberry road", 100000);  //setting employee objects data values
		
		m.setData("Bob Bossington", 40, "3127374444", "99 Olive street", 250000); //setting manager objects data values
		
		em.printData(); //using the print method to print out their data values, as per the method of their parent class
		
		m.printData();  //^^^^^
		
	}
	
	

}
