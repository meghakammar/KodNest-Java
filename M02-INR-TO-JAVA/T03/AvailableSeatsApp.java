
import java.util.Scanner;

public class AvailableSeatsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        int availableCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 0) {
                    availableCount++;
                }
            }
        }
        System.out.println("Available seats: " + availableCount);
        scanner.close();
    }
}
