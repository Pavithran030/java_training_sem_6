
import java.util.*;

public class StudentsMarks {

    private String name;
    private int marks = 0;

    public void setter(String a, int b) {
        name = a;
        marks = b;
    }

    public void display() {
        System.out.println("Name : " + name + "\n" + "Marks : " + marks);
    }

    public static void main(String[] args) {
        // Employee e = new Employee();
        try (Scanner inp = new Scanner(System.in)) {
            String na = inp.next();
            int ma = inp.nextInt();

            StudentsMarks sm = new StudentsMarks();
            if (ma >= 0 && ma <= 100) {
                sm.setter(na, ma);
            } else {
                sm.setter(na, 0);
            }
            sm.display();
        }

    }

}
