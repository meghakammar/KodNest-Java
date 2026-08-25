
class Robot {

    // Constructor of the Robot class
    Robot() {
        System.out.println("Beep beep! Robot reporting for Java duty!");
    }

    // Optional: Add a method to give the robot actions to perform
    void doTask() {
        System.out.println("Robot is performing its assigned task.");
    }
}

public class Main {

    public static void main(String[] args) {
        // Instantiate the object and call a method to resolve the unused variable warning
        Robot r = new Robot();
        r.doTask();
    }
}
