
public class MarksApp {

    public static void main(String[] args) {
        int[] marks = {70, 80, 60, 90, 50};
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = (double) total / marks.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
