
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        this.planName = "Basic";
        this.price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class MobilePlanApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectedPlanName = scanner.next();
        int selectedPlanPrice = scanner.nextInt();

        MobilePlan defaultPlan = new MobilePlan();
        MobilePlan selectedPlan = new MobilePlan(selectedPlanName, selectedPlanPrice);

        defaultPlan.display();
        selectedPlan.display();
    }
}
