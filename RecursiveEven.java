
public class RecursiveEven {

    public static void cal(int n) {

        if (n == 0) {
            return;
        }

        // cal(n - 1); // ascending to descending 
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }

        cal(n - 1); // descending to ascending

    }

    public static void main(String[] args) {
        cal(10);
    }

}
