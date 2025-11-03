import java.util.*;

// Disjoint Set (Union-Find)
class DisjointSet {
    ArrayList<Integer> parent = new ArrayList<>();
    ArrayList<Integer> rank = new ArrayList<>();

    public DisjointSet(int n) {
        for (int i = 0; i < n; i++) {
            parent.add(i);
            rank.add(0);
        }
    }

    public int findupar(int node) {
        if (node == parent.get(node))
            return node;
        int ulp = findupar(parent.get(node));  // find ultimate parent
        parent.set(node, ulp);  // path compression
        return ulp;
    }

    public void unionbyrank(int u, int v) {
        int ulpu = findupar(u);
        int ulpv = findupar(v);
        if (ulpu == ulpv) return;

        if (rank.get(ulpu) < rank.get(ulpv)) {
            parent.set(ulpu, ulpv);
        } else if (rank.get(ulpu) > rank.get(ulpv)) {
            parent.set(ulpv, ulpu);
        } else {
            parent.set(ulpv, ulpu);
            rank.set(ulpu, rank.get(ulpu) + 1);
        }
    }
}

public class  Kruskalalgo{
    static int KruskalMST(int V, int[][] edges) {
        // Sort all edges by weight
        Arrays.sort(edges, Comparator.comparingInt(o -> o[2]));

        DisjointSet ds = new DisjointSet(V);
        int mstWeight = 0;
        List<int[]> mstEdges = new ArrayList<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            // Include edge if it doesn't form a cycle
            if (ds.findupar(u) != ds.findupar(v)) {
                mstWeight += wt;
                mstEdges.add(edge);
                ds.unionbyrank(u, v);
            }
        }

        // Optional: Print the edges included in MST
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (int[] e : mstEdges) {
            System.out.println(e[0] + " - " + e[1] + " (weight: " + e[2] + ")");
        }

        return mstWeight;
    }

    // For testing
    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {
            {0, 1, 10},
            {0, 2, 6},
            {0, 3, 5},
            {1, 3, 15},
            {2, 3, 4}
        };

        int mstWeight = KruskalMST(V, edges);
        System.out.println("Total weight of MST = " + mstWeight);
    }
}
