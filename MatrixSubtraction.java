
import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of matrices
        System.out.println("Enter the number of rows and columns of the matrices:");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        // Input first matrix
        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = inputMatrix(scanner, rows, columns);

        // Input second matrix
        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = inputMatrix(scanner, rows, columns);

        // Perform subtraction
        int[][] resultMatrix = subtractMatrices(matrix1, matrix2, rows, columns);

        // Display result
        System.out.println("The result of subtraction is:");
        displayMatrix(resultMatrix);
    }

    // Method to input matrix elements
    public static int[][] inputMatrix(Scanner scanner, int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
