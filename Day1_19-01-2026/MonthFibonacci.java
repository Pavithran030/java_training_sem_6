
import java.util.Scanner;

public class MonthFibonacci {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int month = sc.nextInt();
            int a = 0, b = 1, re = 0;

            switch (month) {
                case 1 -> {
                    System.out.print(a);
                }
                case 2 -> {
                    System.out.print(b);
                }
                case 3 -> {
                    for (int i = 3; i <= month; i++) {
                        re = a + b;
                        a = b;
                        b = re;
                    }
                    System.out.print(re);
                }
            }
        }
    }

}
