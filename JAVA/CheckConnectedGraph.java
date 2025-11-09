import java.util.ArrayList;

public class CheckConnectedGraph {
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> graph){
        vis[node]=true;
        for(int n:graph.get(node)){
            if (!vis[n]) {
                dfs(n, vis, graph);
            }
        }
    }
    public static boolean check(boolean vis[],ArrayList<ArrayList<Integer>> graph,int n){
        int start=-1;
        for(int i=0;i<n;i++){
            if (graph.get(i).size()>0) {
                start=i;
                break;
            }
        }
        if (start== -1) {
            return true;
        }
        dfs(start,vis,graph);
        for(int i=0;i<n;i++){
            if (graph.get(i).size()>0 && !vis[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int v=5;
        int edges[][]={{0,1},{1,2},{4,3}};
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        for(int e[]:edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        boolean vis[]=new boolean[v];
        
        if (check(vis,graph,v)) {
            System.out.println("Graph is connected");
        }
        else{
            System.out.println("Graph is not connected");

        }
    }
}
