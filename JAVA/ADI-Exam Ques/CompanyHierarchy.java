class Node {
    int val;
    Node left,right;

    Node(int val){
        this.val=val;
    }
}
public class CompanyHierarchy {
    public static int countleaves(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return countleaves(root.left)+ countleaves(root.right);
    }
    public static int countnonleaves(Node root){
        if(root==null) return 0;
        if (root.left==null && root.right==null) {
            return 0;
        }
        return 1+countnonleaves(root.left)+countnonleaves(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        a.left=new Node(2);
        a.right=new Node(3);
        a.left.left=new Node(4);
        a.left.right=new Node(5);
        a.right.left=new Node(6);

        System.out.println("Leaf nodes " +countleaves(a));
        System.out.println("non leaf nodes "+countnonleaves(a));
    }
}