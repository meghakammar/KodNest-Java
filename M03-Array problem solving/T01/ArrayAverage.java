
import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        double average = (double) sum / n;

        System.out.println(sum);
        System.out.printf("%.2f\n", average);

        scanner.close();
    }
}
