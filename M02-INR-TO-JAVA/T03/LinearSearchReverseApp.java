
import java.util.Scanner;

public class LinearSearchReverseApp {

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

        // Linear search for the target value
        boolean isFound = false;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                isFound = true;
                break; // Stop after the first match
            }
        }

        // Output search result
        if (isFound) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        // Print array in reverse order without modifying the original array
        System.out.print("Reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
