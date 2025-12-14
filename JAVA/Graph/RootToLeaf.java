/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        dfs(graph,new ArrayList<>(),root);
        return graph; 
    }
    public static void dfs( ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> list,Node root){
        if(root==null ){
            return;
        }
        list.add(root.data);
        if(root.left==null && root.right==null){
             graph.add(new ArrayList<>(list));
        }
        else{
         dfs(graph,list,root.left);
        dfs(graph,list,root.right);
        }
        list.remove(list.size()-1);
    }
}
