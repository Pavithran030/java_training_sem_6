
import java.util.*;

public class DFS {

    static Map<Integer, List<Integer>> ls = new HashMap<>();

    static Set<Integer> se = new HashSet<>();

    public static void main(String[] args) {

        ls.put(0, Arrays.asList(1, 2));
        ls.put(1, Arrays.asList(0, 3));
        ls.put(2, Arrays.asList(0, 3));
        ls.put(3, Arrays.asList(1, 2));

        dfs(0);
    }

    static void dfs(int a) {
        System.out.print(a + " -> ");
        se.add(a);

        for (int val : ls.get(a)) {

            if (!se.contains(val)) {
                dfs(val);
            }
        }

    }
}
