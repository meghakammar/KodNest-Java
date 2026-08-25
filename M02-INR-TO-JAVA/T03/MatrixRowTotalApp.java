
import java.util.Scanner;

public class MatrixRowTotalApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int rowTotal = 0;
            for (int j = 0; j < columns; j++) {
                rowTotal += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + rowTotal);
        }
        scanner.close();
    }
}
