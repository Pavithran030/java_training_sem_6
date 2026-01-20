
import java.util.Scanner;

public class ArrayInsertion {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int size = inp.nextInt();

            int[] ins = new int[size + 1];

            for (int i = 0; i < size; i++) {
                ins[i] = inp.nextInt();
            }
            System.out.print("Enter the Index to Insert : ");
            int ind = inp.nextInt();
            System.out.print("Enter the value to Insert : ");
            int val = inp.nextInt();

            for (int j = ind; j < size; j++) {
                int temp = ins[j];
                ins[j] = val;
                ins[j + 1] = temp;
            }
            for (int i : ins) {
                System.out.println(i);
            }
        }
    }
}
