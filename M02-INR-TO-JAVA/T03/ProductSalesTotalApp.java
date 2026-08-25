
import java.util.Scanner;

public class ProductSalesTotalApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int products = scanner.nextInt();
        int months = scanner.nextInt();

        int[][] sales = new int[products][months];

        for (int i = 0; i < products; i++) {
            for (int j = 0; j < months; j++) {
                sales[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < products; i++) {
            int productTotal = 0;
            for (int j = 0; j < months; j++) {
                productTotal += sales[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + productTotal);
        }

        scanner.close();
    }
}
