import java.util.*;

public class queuereverse {
    
    public static void print(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> st=new Stack<>();
        while (!queue.isEmpty()) {
            st.push(queue.remove());
        }
        while (!st.isEmpty()) {
            queue.add(st.pop());
        }
        print(queue);
    }
    public static void rotatebyk(Queue<Integer> queue,int k){
        Stack<Integer> st=new Stack<>();
        while (st.size()!=k) {
            st.push(queue.remove());
        }
        while (!st.isEmpty()) {
            queue.add(st.pop());
        }
        print(queue);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int k=3;
        rotatebyk(queue,k);
          // Output: 1 2 3 4 5
    }
}
