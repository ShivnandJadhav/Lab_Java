
public class TypeVoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int size = 5; // Change the size as needed
	        printPattern(size);
	    }

	    public static void printPattern(int size) {
	        for (int i = 1; i <= size; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	}

}
