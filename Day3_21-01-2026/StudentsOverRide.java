
class Person {

    void displayName() {
        String name = "RedHat";
        System.out.println(name);
    }

}

class Student extends Person {

    void displayMarks() {
        int marks = 10;
        System.out.println(marks);
    }
}

public class StudentsOverRide {

    public static void main(String[] args) {
        Student p = new Student();
        p.displayName();
        p.displayMarks();
    }

}
