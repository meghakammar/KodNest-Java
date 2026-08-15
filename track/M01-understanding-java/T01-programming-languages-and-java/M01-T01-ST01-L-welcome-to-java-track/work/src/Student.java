
public class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Anu";
        age = 19;
        height = 5.0;
    }

    Student(String name) {
        this.name = name;
        Student(String name
        , int age, double height
            
        )
        {
            this.name = name;
            this.age = age;
            this.height = height;
        }
        void display
            
        ()
            {
                System.out.println(name);
            System.out.println(age);
            System.out.println(height);
        }
            

    public class StudentApplication {

        public static void main(String[] args) {
            Student s2 = new Student();
            s2.display();
            Student s3 = new Student("Manu");
            s2.display;
            Student s1 = new Student("Raja", 20, 5.2);
        }
    }
}
