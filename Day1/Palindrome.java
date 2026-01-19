
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            String inps;
            inps = inp.next();

            String re = "";

            for (int i = 0; i < inps.length(); i++) {
                char c1 = inps.charAt(i);
                if ((c1 >= 'a' && c1 <= 'z') || (c1 >= 'A' && c1 <= 'Z')) {
                    re += inps.charAt(i);
                }
            }
            String rev = "";

            for (int i = re.length(); i <= 0; i--) {
                rev += re.charAt(i);
            }

            if (re.equalsIgnoreCase(rev)) {
                System.out.println("The Given String is Palindrome");
            } else {
                System.out.println("The Given String is Not a Palindrome");
            }
        }
    }
}
