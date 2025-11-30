import java.util.Arrays;

public class LongestPalindromesubseq {
     public static int lps(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int r[]:dp) Arrays.fill(r,-1);
        return solve(dp,s,0,n-1);

    }
    public static int solve(int dp[][],String s,int i,int j){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=2+solve(dp,s,i+1,j-1);
        }
        int left=solve(dp,s,i+1,j);
        int right=solve(dp,s,i,j-1);
        return dp[i][j]=Math.max(left,right);
    }
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(lps(s));
    }
}
