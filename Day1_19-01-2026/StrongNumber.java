
import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int inp = sc.nextInt();
            int store = 0;
            int temp = inp;
            while (temp != 0) {
                int digit = temp % 10;
                int fact = 1;
                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }
                temp /= 10;
                store += fact;
            }
            System.out.println(store == inp ? "Yes" : "No");
        }
    }
}
