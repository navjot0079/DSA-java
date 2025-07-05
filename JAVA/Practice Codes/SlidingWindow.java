import java.util.ArrayDeque;
import java.util.Deque;
public class SlidingWindow {
    static int[] firstnegative(int[] arr, int k) {
        int n = arr.length;
        int idx = 0;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) dq.add(i);

            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) dq.removeFirst();
            
            if (i >= k - 1) {
                ans[idx++] = dq.isEmpty() ? 0 : arr[dq.peekFirst()];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, -1, 3, -3, 4, -6, 7, 8, 9};
        int[] ans = firstnegative(arr, 3);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
}