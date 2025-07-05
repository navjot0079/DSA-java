import java.util.ArrayList;

public class CycleDetectionGraph {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
       
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }
// directed graph
    public static boolean CycleDetection(ArrayList<Edge> graph[], boolean vis[], boolean rec[],int curr) {
        vis[curr]=true;
        rec[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }
            else if (!vis[e.dest] && CycleDetection(graph, vis, rec,e.dest)) {
                return true;
            }
        }
        rec[curr]=false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean vis[] = new boolean[v];
        boolean rec[] = new boolean[v];
        System.out.println(CycleDetection(graph, vis, rec,0));
        System.out.println();
    }
}
