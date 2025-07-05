
import java.util.Stack;

public class InsertAtBottom {
    static void bruteforceusingAnotherStack(Stack<Integer> st,int item){
        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(item);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
    static void removebottom(Stack<Integer> st,int item){
        Stack<Integer> temp=new Stack<>();
        while (st.size() > 1) {
            temp.push(st.pop());
        }
        
        st.pop();
        
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int n=5;
        int item=60;
        for (int i = 0; i < n; i++) {
            st.push(10*i);
        }
        System.out.println(st);
        bruteforceusingAnotherStack(st, item);
        System.out.println(st);
        removebottom(st, item);
        System.out.println(st);
    }
}
