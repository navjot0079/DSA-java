import java.util.Scanner;
import java.util.Stack;

public class validparenthesis {
    public static int minbracket(String input){
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            
            else if (ch == ')' || ch == '}' || ch == ']') {
                 
                char top = st.peek();
                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) {
                    st.pop();
                } 
            }
        }
        
        return st.size();
    }

    public static boolean isValid(String input) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    return false;  
                }
                
                char top = st.peek();
                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) {
                    st.pop();
                } else {
                    return false; 
                }
            }
        }
        
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(minbracket(input));
        
        // if (isValid(input)) {
        //     System.out.println("Valid");
        // } else {
        //     System.out.println("Not Valid");
        // }
        
        sc.close();
    }
}