
public class AdjacentMatrix {

    static int[][] gra = new int[4][4];

    public static void main(String[] args) {

        edge(0, 1);
        edge(0, 2);
        edge(1, 3);
        edge(2, 3);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(gra[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void edge(int a, int b) {
        gra[a][b] = 1;
        gra[b][a] = 1;

    }
}
