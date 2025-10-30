import java.util.ArrayList;
import java.util.Stack;

public class TopoSort{
    public static void main(String[] args) {
        int n=6;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }   
        graph.get(5).add(0);
        graph.get(5).add(2);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);
        boolean[] vis=new boolean[n];
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,graph,st);
            }
        }
        while (!st.isEmpty()) {
            ans.add(st.peek());
            st.pop();
        }
        System.out.println(ans);
    }
    public static void dfs(int curr,boolean vis[],ArrayList<ArrayList<Integer>> graph,Stack<Integer> st){
        vis[curr]=true;
        for(int neighbour: graph.get(curr)){
            if (!vis[neighbour]) {
                dfs(neighbour,vis,graph,st);
            }
        }
        st.push(curr);
    }
}