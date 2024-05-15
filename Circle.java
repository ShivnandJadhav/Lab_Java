
public class Circle {

	double radius;
	String color;
	
	//Default constructor
	public Circle() {
		super();
		this.radius=0;
		this.color="";
		
	}
	
	
	//Parameterized constructor
	public  Circle(double radius, String color) {
	super();
	this.radius=radius;
	this.color=color;
	
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Creating Circle objects using different constructors
        Circle circle1 = new Circle(); // Default constructor
        Circle circle2 = new Circle(2.5, "blue"); // Parameterized constructor
        
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Area of circle2: " + circle2.getArea());
        
	}

}
