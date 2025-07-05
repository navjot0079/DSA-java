import java.util.LinkedList;
import java.util.Queue;

public class Treenode {
    public static class Node {
        int val;
        Node left;
        Node right;
    
        // Constructor
        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root){
        if(root==null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    public static int sumofnodes(Node root){
        if(root==null) return 0;
         return root.val+ sumofnodes(root.left)+sumofnodes(root.right);

    }

    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }

    public static int sizeoftree(Node root){
        if(root==null) return 0;
        return 1+ sizeoftree(root.left) + sizeoftree(root.right);
    }

    public static int maxvalue(Node root){
        if (root==null) {
            return Integer.MIN_VALUE;
        }
        int a=root.val;
        int b=maxvalue(root.left);
        int c=maxvalue(root.right);
        return Math.max(a, Math.max(c, b));
    }

    public static int minval(Node root){
        if (root==null) {
            return Integer.MAX_VALUE;
        }
        int a=root.val;
        int b=minval(root.left);
        int c=minval(root.right);
        return Math.min(a, Math.min(c, b));
    }

    public static int product(Node root){
        if (root==null) {
            return 1;
        }
        return root.val*product(root.left)*product(root.right);
    }

    public static void nthlevel(Node root,int n){
        if (root==null) {
            return;
        }
        if(n==1) {System.out.print(root.val+" ");
    return;}
        nthlevel(root.left, n-1);
        nthlevel(root.right, n-1);

    }

    public static void bfs(Node root) {
    if (root == null) return;
    
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    
    while (!queue.isEmpty()) {
        Node temp = queue.poll();
        System.out.print(temp.val + " ");
        
        if (temp.left != null) {
            queue.add(temp.left);
        }
        if (temp.right != null) {
            queue.add(temp.right);
        }
    }
}

    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(2);
        Node b=new Node(33);
        root.left=a;
        root.right=b;
        Node c=new Node(15);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(46);
        Node f=new Node(7);
        b.left=e;
        e.right=f;
       // preorder(root);
         System.out.println(sizeoftree(root));
        // System.out.println(sumofnodes(root));
        // System.out.println(maxvalue(root));
         System.out.println(height(root));
        // System.out.println(minval(root));
        // System.out.println(product(root));
        //  inorder(root);
        // nthlevel(root, 3);
       bfs(root);
    }
    
}
