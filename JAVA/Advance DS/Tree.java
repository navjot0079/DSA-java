
import java.util.*;

public class Tree {
    class Node {
    int data;
    Node left;
    Node right; 
}
    Node root;
    Scanner sc=new Scanner(System.in);

    public Node createTree(){
        return createTree(null);
    }
    private Node createTree(Node root){
        if(!sc.hasNext()){
            return null;
        }
        int val=sc.nextInt();
        Node nn=new Node();
        nn.data=val;

        boolean hlc=sc.nextBoolean();
        if(hlc==true){
            nn.left=createTree(nn);
        }
        boolean hrc= sc.nextBoolean();
        if(hrc==true){
            nn.right=createTree(nn);
        }
        
        return nn;
    }
    private void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }   
    public void preOrder(){
        preOrder(root);
}
public int max(Node root){
    if(root==null){
        return -1;
    }
    int maxi=Math.max(root.left.data, root.right.data);
    return Math.max(maxi, root.data);   
}
public static void main(String[] args) {
    Tree t=new Tree();
    t.root=t.createTree();
    t.preOrder();
    System.out.println(t.max(t.root));
}
}
