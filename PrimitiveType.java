
public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Integer: " + multiplyIntegers(5, 10));

	        System.out.println("Double: " + divideDoubles(15.5, 3.0));

	        System.out.println("Float: " + addFloats(3.5f, 2.5f));

	        System.out.println("Long: " + subtractLongs(1000000L, 500000L));

	        System.out.println("Short: " + multiplyShorts((short) 20, (short) 10));

	        System.out.println("Byte: " + addBytes((byte) 100, (byte) 50));

	        System.out.println("Char: " + concatenateChars('H', 'i'));

	        System.out.println("Boolean: " + checkBoolean(true, false));
	    }

	   
	    public static int multiplyIntegers(int a, int b) {
	        return a * b;
	    }

	   
	    public static double divideDoubles(double a, double b) {
	        return a / b;
	    }

	    // Method for adding two floats
	    public static float addFloats(float a, float b) {
	        return a + b;
	    }

	   
	    public static long subtractLongs(long a, long b) {
	        return a - b;
	    }

	  
	    public static short multiplyShorts(short a, short b) {
	        return (short) (a * b);
	    }

	 
	    public static byte addBytes(byte a, byte b) {
	        return (byte) (a + b);
	    }

	  
	    public static String concatenateChars(char a, char b) {
	        return String.valueOf(a) + String.valueOf(b);
	    }

	    
	    public static boolean checkBoolean(boolean a, boolean b) {
	        return a && b;

	}

}
