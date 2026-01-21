
import java.util.*;

public class Book {

    private static String title = "A";
    private static String author = "B";

    public static void setter(String a, String b) {
        Book.title = a;
        Book.author = b;
    }

    public static String getter() {
        return title;
    }

    public static String getters() {
        return author;
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            String s1 = inp.next();
            String sal = inp.next();
            System.out.println("Default Value : " + title + " " + author);
            setter(s1, sal);
            System.out.println("Updated Value : " + getter() + " " + getters());
        }

    }
}
