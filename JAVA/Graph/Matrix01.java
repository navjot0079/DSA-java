import java.util.*;

public class matrix01 {
    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int dis[][] = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    dis[i][j] = 0;
                    q.offer(new int[] { i, j });
                } else {
                    dis[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int dirs[][] = { { 1, 0 }, { 0, 1 }, { 0, -1 }, { -1, 0 } };
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int cell[] = q.poll();
                int u = cell[0], v = cell[1];
                for (int dir[] : dirs) {
                    int nu = u + dir[0];
                    int nv = v + dir[1];
                    if (nu >= 0 && nu < m && nv >= 0 && nv < n) {
                        if (dis[nu][nv] > dis[u][v] + 1) {
                            dis[nu][nv] = dis[u][v] + 1;
                            q.offer(new int[] { nu, nv });
                        }
                    }
                }
            }
        }
        return dis;
    }
    public static void main(String[] args) {
        int mat[][]={{0,0,0},{0,1,0},{1,1,1}};
        System.out.println(updateMatrix(mat));
    }
}
    
