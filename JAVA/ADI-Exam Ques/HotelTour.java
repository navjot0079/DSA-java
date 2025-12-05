import java.util.*;
public class HotelTour {
    public static int shortestPath(int n) {
        if (n == 1) return 0;

        boolean[] vis = new boolean[n + 1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 0});
        vis[1] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int node = cur[0], dist = cur[1];

            if (node == n) return dist;

            int next1 = node + 1;
            int next2 = node * 3;

            if (next1 <= n && !vis[next1]) {
                vis[next1] = true;
                q.add(new int[]{next1, dist + 1});
            }

            if (next2 <= n && !vis[next2]) {
                vis[next2] = true;
                q.add(new int[]{next2, dist + 1});
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(shortestPath(n));
    }
}

