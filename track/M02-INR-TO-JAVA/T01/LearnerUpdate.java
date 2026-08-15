
import java.util.Scanner;

class Learner {

    int id;
    String name;
    int javaScore;
}

public class LearnerUpdate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Learner learner1 = new Learner();
        learner1.id = scanner.nextInt();
        learner1.name = scanner.next();
        learner1.javaScore = scanner.nextInt();

        Learner learner2 = new Learner();
        learner2.id = scanner.nextInt();
        learner2.name = scanner.next();
        learner2.javaScore = scanner.nextInt();

        int newScore = scanner.nextInt();

        System.out.println("Before Update");
        System.out.println(learner1.id + " - " + learner1.name + " - " + learner1.javaScore);
        System.out.println(learner2.id + " - " + learner2.name + " - " + learner2.javaScore);

        learner1.javaScore = newScore;

        System.out.println("After Update");
        System.out.println(learner1.id + " - " + learner1.name + " - " + learner1.javaScore);
        System.out.println(learner2.id + " - " + learner2.name + " - " + learner2.javaScore);

        scanner.close();
    }
}
