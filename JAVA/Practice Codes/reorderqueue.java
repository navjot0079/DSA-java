import java.util.*;

public class reorderqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int n = 8;

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        int half = n / 2;

        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        for (int i = 0; i < n - half; i++) {
            q.add(q.remove());
        }

        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());   // from stack (first half)
            q.add(q.remove()); // from queue (second half)
        }

        // Print result
        System.out.println(q); // Expected: [1, 5, 2, 6, 3, 7, 4, 8]
    }
}
