import java.util.*;

public class ExpressionConverter {

    // Precedence function for operators
    private static int precedence(char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    // Infix to Postfix Conversion (Shunting-yard algorithm)
    public static String infixToPostfix(String infix) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {  // Operand
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else {  // Operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Infix to Prefix Conversion
    public static String infixToPrefix(String infix) {
        StringBuilder reversed = new StringBuilder(infix).reverse();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) == '(') reversed.setCharAt(i, ')');
            else if (reversed.charAt(i) == ')') reversed.setCharAt(i, '(');
        }

        String postfix = infixToPostfix(reversed.toString());
        return new StringBuilder(postfix).reverse().toString();
    }





    public static void main(String[] args) {
        String infix = "A+B*(C^D-E)";
        System.out.println("Infix: " + infix);
        
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);

        String prefix = infixToPrefix(infix);
        System.out.println("Prefix: " + prefix);

        
    }
}
