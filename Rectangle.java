
public class Rectangle extends Shapes{

	double lenght;
	double width;
	
	public Rectangle(double lenght, double width) {
		this.lenght = lenght;
		this.width = width;
		
	}
	
	@Override
	
	public void calculateArea() { 
		area = lenght*width;
		System.out.println("Area of Rectangle: "+ area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle1 c1 = new Circle1(4);
		c1.calculateArea();
		
		Rectangle r = new Rectangle(4,6);
		r.calculateArea();
	}

}
