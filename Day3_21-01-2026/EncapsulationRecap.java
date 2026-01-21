
import java.util.Scanner;

public class EncapsulationRecap {

    private String name = "Apple";
    private int salary = 2000;

    public String gett() {
        return name;
    }

    public int getter() {
        return salary;
    }

    public void setter(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        EncapsulationRecap e = new EncapsulationRecap();
        try (Scanner inp = new Scanner(System.in)) {
            String s1 = inp.next();
            int sal = inp.nextInt();
            System.out.println("Default Value : " + e.gett() + " " + e.getter());
            e.setter(s1, sal);
            System.out.println("Updated Value : " + e.gett() + " " + e.getter());
        }

    }

}
