
import java.util.Scanner;

interface Printable {

    void print(String s1);
}

class Book implements Printable {

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}

class Newspaper implements Printable {

    @Override
    public void print(String s2) {
        System.out.println(s2);

    }

}

public class Interfaces {

    public static void main(String[] args) {
        Printable p1 = new Book();
        Printable p2 = new Newspaper();
        try (Scanner inp = new Scanner(System.in)) {
            String books = inp.next();
            String news = inp.next();
            p1.print(books);
            p2.print(news);
        }
    }
}
