public class SumofRootToLeafBinaryNumber {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(0);
            root.right = new TreeNode(1);
            root.left.left = new TreeNode(0);
            root.left.right = new TreeNode(1);
            root.right.left = new TreeNode(0);
            root.right.right = new TreeNode(1);
    
            int result = sumRootToLeaf(root);
            System.out.println("Sum of Root-to-Leaf Binary Numbers: " + result);
    }
    public static int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    private static int dfs(TreeNode node, int currentSum) {
        if (node == null) {
            return 0;
        }
        currentSum = currentSum * 2 + node.val;
        if (node.left == null && node.right == null) {
            return currentSum;
        }
        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }
}
