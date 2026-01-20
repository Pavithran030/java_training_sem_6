
import java.util.*;

public class ConsecutiveInterchange {

    static String paris(int[] lst, int si) {
        String re = "";
        for (int i = 0; i < si - 1; i += 2) {
            int temp = lst[i];
            lst[i] = lst[i + 1];
            lst[i + 1] = temp;
        }
        for (int s : lst) {
            re += s;
        }
        return re;
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Enter the Encrypted Msg : ");
            String st = inp.next();
            int si = st.length();
            int[] lst = new int[si];

            for (int i = 0; i < si; i++) {
                lst[i] = Character.getNumericValue(st.charAt(i));
            }
            if (si % 2 == 0) {
                System.out.println("Enter the Decrypted Msg : " + paris(lst, si));
            } else {
                System.out.println("Enter the Decrypted Msg : " + paris(lst, si - 1));
            }

        }
    }
}
