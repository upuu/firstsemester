package assignfive;

public class Square extends Rectangle {
	
	void squaremethod() {
		
		System.out.println("Square is a rectangle");
	}
	
	
	public static void main(String[] args) {
		
		Square sqobj = new Square(); //creating object of square
		
		sqobj.shapemethod(); //calling shape method from square object
		
		sqobj.rectanglemethod(); //calling rectangle method from square object
	}

}
