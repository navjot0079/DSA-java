import java.util.Stack;

public class InsertAtBottom2 {
    public static void optimizingusingrecursion(Stack<Integer> st,int value){
        if(st.isEmpty()){
            st.push(value);
            return;
        }
        int top=st.pop();
        optimizingusingrecursion(st, value);
        st.push(top);

        
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        
        int item=60;
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        optimizingusingrecursion(st, item);
        System.out.println(st);
    }
}
