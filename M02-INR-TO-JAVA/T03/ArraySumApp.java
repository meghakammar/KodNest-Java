
import java.util.Scanner;

public class ArraySumApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        System.out.println("Total: " + total);

        scanner.close();
    }
}
