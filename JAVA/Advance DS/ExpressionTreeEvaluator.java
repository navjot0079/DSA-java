class TreeNode {
    String val;
    TreeNode left, right;

    TreeNode(String val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class ExpressionTreeEvaluator {

    public static int evaluate(TreeNode root) {
        if (root.left == null && root.right == null) {
            return Integer.parseInt(root.val);
        }

        int leftVal = evaluate(root.left);
        int rightVal = evaluate(root.right);

        switch (root.val) {
            case "+":
                return leftVal + rightVal;
            case "-":
                return leftVal - rightVal;
            case "*":
                return leftVal * rightVal;
            case "/":
                
                if (rightVal == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return leftVal / rightVal;  
            default:
                throw new IllegalArgumentException("Invalid operator: " + root.val);
        }
    }

    public static void main(String[] args) {
        /*
            Example Expression Tree:
            
                    *
                   / \
                  +   -
                 / \ / \
                42 43 45 47
                
            Expression = (42 + 43) * (45 - 47)
            Expected Result = 85 * (-2) = -170
        */

        TreeNode root = new TreeNode("*");
        root.left = new TreeNode("+");
        root.right = new TreeNode("-");

        root.left.left = new TreeNode("42");
        root.left.right = new TreeNode("43");
        root.right.left = new TreeNode("45");
        root.right.right = new TreeNode("47");

        int result = evaluate(root);
        System.out.println("Result = " + result);
    }
}
