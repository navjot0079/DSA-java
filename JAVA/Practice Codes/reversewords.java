
import java.util.Stack;

public class reversewords {
    public static String reverseWordsi(String s) {
        String[] words = s.split(" "); 
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<word.length();i++){
                stack.push(word.charAt(i));
            }
       
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        reversed.append(" ");
    }

        return reversed.toString().trim();
    }
    public static void main(String[] args) {
        String input = "Hello World This is Java";
        String output = reverseWordsi(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);
        
    }
}
