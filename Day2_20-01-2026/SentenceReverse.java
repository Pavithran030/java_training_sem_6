
import java.util.*;

public class SentenceReverse {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Enter the Sentence : ");
            String s = inp.nextLine();
            String[] ls = s.split(" ");

            int si = ls.length;
            for (int i = si - 1; i >= 0; i--) {
                System.out.print(ls[i] + " ");
            }
        }
    }
}
