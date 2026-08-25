
import java.util.Scanner;

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class FoodOrderDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the item and quantity
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        // Create one order with the first constructor
        FoodOrder order1 = new FoodOrder(item);

        // Create one order with the second constructor
        FoodOrder order2 = new FoodOrder(item, quantity);

        // Display both orders
        order1.display();
        order2.display();

        scanner.close();
    }
}
