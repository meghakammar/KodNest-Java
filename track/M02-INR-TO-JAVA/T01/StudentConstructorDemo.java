
import java.util.Scanner;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class StudentConstructorDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        Student student = new Student(fullName);
        student.display();
        scanner.close();
    }
}
