
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Input size of the array
			System.out.println("Enter the size of the array:");
			int size = scanner.nextInt();

			// Input array elements
			System.out.println("Enter the elements of the array:");
			int[] array = new int[size];
			for (int i = 0; i < size; i++) {
			    array[i] = scanner.nextInt();
			}

			// Input element to search
			System.out.println("Enter the element to search:");
			int element = scanner.nextInt();

			// Perform search
			int index = searchElement(array, element);

			// Display result
			if (index != -1) {
			    System.out.println("Element found at index: " + index);
			} else {
			    System.out.println("Element not found in the array.");
			}
		}
    }

    // Method to search for an element in the array
    public static int searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
