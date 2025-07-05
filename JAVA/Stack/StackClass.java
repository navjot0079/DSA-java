package Stack;
import java.util.Stack;
public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);
        System.out.println("Top element : "+ st.peek());
        System.out.println("last element" + st.pop());
        System.out.println("is stack empty?"+ st.empty());
        st.pop();
        st.pop();
        System.out.println(st.pop());
        System.out.println(st.size());
        st.pop();
        System.out.println("is stack empty?"+st.empty());
        System.out.println(st.size());
        
       
    }
}
