
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        // Define an array of integers
        int[] array = {5, 2, 8, 3, 1, 7, 4, 6};

        // Sort the array in ascending order
        Arrays.sort(array);

        // Display the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

