import java.util.Arrays;

public class superseq {
    public static void main(String[] args) {
        
        String s1="abac";
        String s2="cab";
        int m=s1.length();
        int n=s2.length();

        int dp[][]=new int[m+1][n+1];

        // Build LCS table
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        // Print DP table
        for(int[] row: dp){
            System.out.println(Arrays.toString(row));
        }

        // Build SCS from LCS table
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (s1.charAt(i-1) == s2.charAt(j-1)) {
                sb.append(s1.charAt(i-1));
                i--; j--;
            } 
            else if (dp[i-1][j] > dp[i][j-1]) {
                sb.append(s1.charAt(i-1));
                i--;
            } 
            else {
                sb.append(s2.charAt(j-1));
                j--;
            }
        }

        // leftovers
        while (i > 0) sb.append(s1.charAt(i-- - 1));
        while (j > 0) sb.append(s2.charAt(j-- - 1));

        // Reverse to get final SCS
        System.out.println(sb.reverse().toString());
    }
}
