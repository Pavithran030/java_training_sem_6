
import java.util.Scanner;

public class TrendyNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int num = sc.nextInt();

            if (num > 99 && num <= 999) {
                int mid = (num / 10) % 10;

                if (mid % 3 == 0) {
                    System.out.println("Trendy Number..");
                } else {
                    System.out.println("Not a Trendy Number..");
                }

            } else {
                System.out.println("Not a Trendy Number..");
            }
        }
    }
}
