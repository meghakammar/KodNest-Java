
public class StockApp {

    public static void main(String[] args) {
        int[] stock = {4, 12, 2, 9, 5};
        int reorderLevel = 5;

        int reorderCount = 0;

        for (int s : stock) {
            if (s <= reorderLevel) {
                reorderCount++;
            }
        }
        System.out.println("Items to reorder: " + reorderCount);
    }
}
