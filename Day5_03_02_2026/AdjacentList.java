
import java.util.*;

public class AdjacentList {

    static Map<Integer, List<Integer>> lst = new HashMap<>();

    public static void main(String[] args) {

        addedge(0, 1);
        addedge(0, 2);
        addedge(1, 3);
        addedge(2, 3);

        for (int k : lst.keySet()) {
            System.out.print(k + " -> ");
            for (int l : lst.get(k)) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

    }

    static void addedge(int a, int b) {
        lst.putIfAbsent(a, new ArrayList<>());
        lst.get(a).add(b);
        lst.putIfAbsent(b, new ArrayList<>());
        lst.get(b).add(a);
    }

}
