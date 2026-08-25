
import java.util.Scanner;

public class MinMaxApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the array size
        int size = scanner.nextInt();

        // 2. Create an integer array using the runtime size
        int[] numbers = new int[size];

        // 3. Read and store all array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 4. Initialise minimum and maximum with the first element
        int min = numbers[0];
        int max = numbers[0];

        // 5. Traverse the remaining elements
        for (int i = 1; i < size; i++) {
            // 6. Update minimum whenever a smaller value is found
            if (numbers[i] < min) {
                min = numbers[i];
            }
            // 7. Update maximum whenever a larger value is found
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 8. Display the final minimum and maximum values
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
