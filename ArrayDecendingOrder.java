
import java.util.Scanner;
import java.util.Arrays;

public class ArrayDecendingOrder {
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

			// Sort the array in descending order
			Arrays.sort(array);
			for (int i = 0; i < size / 2; i++) {
			    int temp = array[i];
			    array[i] = array[size - i - 1];
			    array[size - i - 1] = temp;
			}

			// Print the array in descending order
			System.out.println("Array in descending order:");
			for (int num : array) {
			    System.out.print(num + " ");
			}
		}
    }
}

