
import java.util.Scanner;

public class DiscountFirst {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int flipprice, flipdis, flipdel;
            int snapprice, snapdis, snapdel;
            int amprice, amdis, amdel;

            flipprice = sc.nextInt();
            flipdis = sc.nextInt();
            flipdel = sc.nextInt();

            snapprice = sc.nextInt();
            snapdis = sc.nextInt();
            snapdel = sc.nextInt();

            amprice = sc.nextInt();
            amdis = sc.nextInt();
            amdel = sc.nextInt();

            int fdis = flipprice - (flipprice * flipdis) / 100 + flipdel;
            int sdis = snapprice - (snapprice * snapdis) / 100 + snapdel;
            int adis = amprice - (amprice * amdis) / 100 + amdel;

            System.out.println(fdis + " " + sdis + " " + adis);

            if (fdis == sdis && fdis == adis && sdis == adis) {
                System.out.println("In Flipkart : " + fdis);
            } else if (fdis < sdis && fdis < adis) {
                System.out.println("In Flipkart : " + fdis);
            } else if (sdis < fdis && sdis < adis) {
                System.out.println("In Snapdeal : " + sdis);
            } else {
                System.out.println("In Amazon : " + adis);
            }
        }
    }
}
