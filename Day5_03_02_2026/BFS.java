
import java.util.*;

public class BFS {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> ls = new HashMap<>();
        ls.put(0, Arrays.asList(1, 2));
        ls.put(1, Arrays.asList(0, 3));
        ls.put(2, Arrays.asList(0, 3));
        ls.put(3, Arrays.asList(1, 2));

//BFS Implemention starts here
        Queue<Integer> q = new LinkedList<>();

        // To avoid the duplicate values
        Set<Integer> se = new HashSet<>();

        //set 0 as a initial value for the both types
        q.add(0);
        se.add(0);

        //check the queue is empty
        while (!q.isEmpty()) {

            int d = q.remove();

            System.out.print(d + " -> ");
            for (int val : ls.get(d)) {
                if (!(se.contains(val))) {
                    q.add(val);
                    se.add(val);
                    // System.out.println("Quu -> " + q + " Set -> " + se);
                    // System.out.println("________________________");
                }
            }
        }
    }
}
