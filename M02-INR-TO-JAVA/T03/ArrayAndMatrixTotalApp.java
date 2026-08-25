
import java.util.Scanner;

public class ArrayAndMatrixTotalApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int arrayTotal = 0;

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
            arrayTotal += array[i];
        }
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        int matrixTotal = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
                matrixTotal += matrix[i][j];
            }
        }

        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);

        scanner.close();
    }
}
