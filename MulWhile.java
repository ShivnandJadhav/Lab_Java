import java.util.Scanner;

public class MulWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number to Print its Multiplication Table:");
		int number = s.nextInt();
		
		System.out.println("Multiplication Table of  "+ number + " is :"
				+ "");
		
		int multiplier=1;
		while (multiplier <=10) {
			System.out.println(number + "x"+ multiplier + "=" + (number*multiplier));
			multiplier++;
		}
		s.close();

	}

}
