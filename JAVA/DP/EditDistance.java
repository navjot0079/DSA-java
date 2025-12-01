import java.util.Arrays;

public class EditDistance {
    public static int minDistance(String word1, String word2) {
        int m=word1.length(),n=word2.length();
        int dp[][]=new int[m+1][n+1];
        for(int r[]:dp) Arrays.fill(r,-1);
        return solve(dp,word1,word2,0,0);
    }
    public static int solve(int dp[][],String s1,String s2, int i, int j){
        if(i>=s1.length() ){
            return s2.length()-j;
        }
        if(j>=s2.length() ){
            return s1.length()-i;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=solve(dp,s1,s2,i+1,j+1);
        }
        int insert=solve(dp,s1,s2,i+1,j+1);
        int delete=solve(dp,s1,s2,i+1,j);
        int replace=solve(dp,s1,s2,i,j+1);

        return dp[i][j]=1+Math.min(insert,Math.min(delete,replace));
    }
    public static void main(String[] args) {
        String s1="horse",s2="ros";
        System.out.println(minDistance(s1, s2));
    }
}

