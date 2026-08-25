
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class ResultCalculatorDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstMark = scanner.nextInt();
        int secondMark = scanner.nextInt();
        int thirdMark = scanner.nextInt();

        ResultCalculator calculator = new ResultCalculator();

        int twoMarkTotal = calculator.getTotal(firstMark, secondMark);
        int threeMarkTotal = calculator.getTotal(firstMark, secondMark, thirdMark);

        System.out.println("Two-Mark Total: " + twoMarkTotal);
        System.out.println("Three-Mark Total: " + threeMarkTotal);

        scanner.close();
    }
}
