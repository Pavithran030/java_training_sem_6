
import java.util.*;

public class TwoPointerSorting {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {

            System.out.print("Enter the Array Size : ");
            int size = inp.nextInt();
            int[] lst = new int[size];
            for (int i = 0; i < size; i++) {
                lst[i] = inp.nextInt();
            }

            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (lst[i] < lst[j]) {
                        int temp = lst[i];
                        lst[i] = lst[j];
                        lst[j] = temp;
                    }

                }
            }

            int l = 0, r = size - 1;
            while (l < r) {
                System.out.println(lst[l] + " " + lst[r]);
                l++;
                r--;
            }
            if (l == r) {
                System.out.println(lst[l] + " 0");
            }
        }
    }
}
