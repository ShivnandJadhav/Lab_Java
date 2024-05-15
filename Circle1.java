
public class Circle1 extends Shapes {

	double radius;
	
	public Circle1(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void calculateArea() {
		area = Math.PI*radius*radius;
		System.out.println("Area of circle:" + area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
