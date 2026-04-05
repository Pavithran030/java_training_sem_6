
import java.util.*;

public class Test1 {

    static boolean canDo(int[] arr, int M, long maxTime) {
        int count = 1, sum = 0;
        for (int a : arr) {
            if (sum + a > maxTime) {
                count++;
                sum = a;
            } else {
                sum += a;
            }
        }
        return count <= M;
    }

    public static long minTime(int[] arr, int M) {
        long left = Arrays.stream(arr).max().getAsInt();
        long right = Arrays.stream(arr).asLongStream().sum();
        long ans = right;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (canDo(arr, M, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minTime(arr, M));
        sc.close();
    }
}
