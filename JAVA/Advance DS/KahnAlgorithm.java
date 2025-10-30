import java.util.*;

public class KahnAlgorithm {
    public static void main(String[] args) {
        int n = 6;
        int edges[][] = { {2, 3}, {3, 1}, {4, 0}, {4, 1}, {5, 0}, {5, 2} };

        int indegree[] = new int[n];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int edge[] : edges) {
            int a = edge[0];
            int b = edge[1];
            list.get(a).add(b);  // a → b
            indegree[b]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.poll();
            topo.add(curr);

            for (int nei : list.get(curr)) {
                indegree[nei]--;
                if (indegree[nei] == 0) {
                    q.offer(nei);
                }
            }
        }

        if (topo.size() == n) {
            System.out.println("Topological order: " + topo);
        } else {
            System.out.println("Graph has a cycle!");
        }
    }
}
