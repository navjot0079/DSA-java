import java.util.Arrays;

public class MinimumPathSum {
    public static int solve(int grid[][],int i,int j,int dp[][]){
        int m=grid.length;
        int n=grid[0].length;

        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(i==m-1 && j==n-1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        
        int down=solve(grid,i+1,j,dp);
        int right=solve(grid,i,j+1,dp);
        dp[i][j]=grid[i][j]+Math.min(down,right);
        return dp[i][j];
    }
    public static void main(String[] args) {
        int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int r[]:dp) Arrays.fill(r,-1);
        int ans=solve(grid,0,0,dp);
        System.out.println(ans);
    }
}
