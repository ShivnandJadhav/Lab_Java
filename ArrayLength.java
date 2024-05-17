
import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Input size of the array
			System.out.println("Enter the size of the array:");
			int size = scanner.nextInt();

			// Declare an array of given size
			int[] array = new int[size];

			// Input array elements
			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < size; i++) {
			    array[i] = scanner.nextInt();
			}

			// Display array elements
			System.out.println("Array elements:");
			for (int i = 0; i < size; i++) {
			    System.out.print(array[i] + " ");
			}
			System.out.println(); // for line break

			// Find array length
			int length = array.length;
			System.out.println("Array length: " + length);
		}
    }
}
