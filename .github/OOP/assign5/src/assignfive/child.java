package assignfive;

public class child extends taskone {   //child class defined
	
	void childmethod() {
		System.out.println("this is child class");
	}
	
	public static void main(String[] args) { //main statement to create objects for task
		
		taskone p = new taskone(); //parent object created
		child c = new child(); //child object created
		
		p.parentmethod(); //parent obj calling parent method
		c.childmethod(); //child obj calling child method
		c.parentmethod(); //child obj calling parent method
		
		
		
	}
	
	
	
}