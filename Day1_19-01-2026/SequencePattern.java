
import java.util.Scanner;

public class SequencePattern {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int seq = sc.nextInt();

            for (int i = 1; i <= seq; i++) {
                if (i % 2 != 0) {
                    System.out.print((i * i) - 1 + " "); 
                }else {
                    System.out.print((i * i) - 2 + " ");
                }
            }
        }
    }

}
