import java.util.*;

public class reversestringstack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> stack = new Stack<>(); 
        String input=sc.nextLine();
        int n=input.length();
        for (int i = 0; i < n; i++) {
            stack.push(input.charAt(i)); 
        }
        String res="";
        while (!stack.isEmpty()) {
            res+=stack.pop();
        }

        
        System.out.println(res);
        sc.close();
    }
}
