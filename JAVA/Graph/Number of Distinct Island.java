class Solution {
    int n, m;
    int[][] grid;

    public int countDistinctIslands(int[][] grid) {
        this.grid = grid;
        n = grid.length;
        m = grid[0].length;

        boolean[][] vis = new boolean[n][m];
        HashSet<ArrayList<String>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == 1) {
                    ArrayList<String> shape = new ArrayList<>();
                    dfs(i, j, i, j, vis, shape);
                    set.add(shape);   // store unique signature
                }
            }
        }

        return set.size();
    }

    private void dfs(int r0, int c0, int r, int c, boolean[][] vis, ArrayList<String> shape) {
        vis[r][c] = true;

        // record relative position as a string
        shape.add((r - r0) + "," + (c - c0));

        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };

        for (int k = 0; k < 4; k++) {
            int nr = r + dr[k];
            int nc = c + dc[k];

            if (nr >= 0 && nc >= 0 && nr < n && nc < m 
                && !vis[nr][nc] && grid[nr][nc] == 1) {
                dfs(r0, c0, nr, nc, vis, shape);
            }
        }
    }
}
