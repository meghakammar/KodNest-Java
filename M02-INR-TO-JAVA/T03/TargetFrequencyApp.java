
import java.util.Scanner;

public class TargetFrequencyApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read target value
        int target = scanner.nextInt();

        // Count occurrences of the target value
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        // Output frequency report
        System.out.println("Frequency of " + target + ": " + count);
    }
}
