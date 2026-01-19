
import java.util.Scanner;

public class TariffCal {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int month;
            int rent;
            int days;
            month = sc.nextInt();
            rent = sc.nextInt();
            days = sc.nextInt();

            if (month < 1 | month >= 12) {
                System.out.println("Invalid Input");
                return;
            }

            if (month == 4 | month == 6 | month == 5 | month == 11 | month == 12) {
                float a = (rent * 20) / 100;
                System.out.println("Tariff : " + ((rent * days) + a));
            } else {
                System.out.println("Tariff : " + (rent * days));
            }
        }
    }
}
