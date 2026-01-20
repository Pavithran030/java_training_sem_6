
import java.util.*;

public class PrimePairs {

    public static void main(String[] a) {
        try (Scanner inp = new Scanner(System.in)) {

            int num = inp.nextInt();

            List<Integer> lst = new ArrayList<>();

            if (num == 1) {
                System.out.println("Not a Prime Number ");
                return;
            }
            for (int j = 2; j <= num; j++) {
                boolean tr = true;
                for (int i = 2; i <= Math.sqrt(j); i++) {
                    if (j % i == 0) {
                        tr = false;
                        break;
                    }
                }
                if (tr) {
                    lst.add(j);
                }
            }

            System.out.println(lst.toString());

            // int left = 0, right = lst.size() - 1;
            int count = 0;
            String temp = "";

            for (int i = 0; i < lst.size(); i++) {
                for (int j = 1; j < lst.size(); j++) {
                    if (lst.get(j) - lst.get(i) == 6) {
                        count++;
                        System.out.print("(" + lst.get(i) + "," + lst.get(j) + "),");
                    }
                }
            }

            System.out.println("\nTotal Pairs : " + count);
            System.out.println(temp);
        }

    }
}
