
import java.util.Scanner;

public class CollatzSequence {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int seq = sc.nextInt();
            int count = 0;
            while (seq > 1) {
                if (seq % 2 != 0) {
                    seq = (3 * seq) + 1;
                } else {
                    seq = seq / 2;
                }
                if (seq != 1) {
                    System.out.print(seq + " -> ");
                } else {
                    System.out.println(seq);
                }
                count++;
            }
            System.out.println("Total Number " + count);
        }
    }

}
