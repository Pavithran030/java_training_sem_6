
import java.util.Scanner;

public class KaprekarNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int temp = num;

            if (num == 1) {
                System.out.println("Kaprekar Number");
                return;
            }

            long sq = (long) num * num;

            int norco = 0;
            while (temp > 0) {

                temp /= 10;
                norco++;
            }

            int ridivs = 1;
            for (int i = 0; i < norco; i++) {
                ridivs *= 10;
            }

            int right = (int) (sq % ridivs);
            int left = (int) (sq / ridivs);

            int sum = right + left;

            if (sum == num) {
                System.out.println("Kaprekar Number");
            } else {
                System.out.println("Not a Kaprekar Number");
            }
        }
    }
}
