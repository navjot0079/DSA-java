class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int dp[][]=new int[n][n+1];
        for(int r[]:dp) Arrays.fill(r,-1);
        return solve(n-1,n,price,dp);
        
    }
    public int solve(int i,int n,int price[],int dp[][]){
        if(i==0) return n*price[0];
        if(dp[i][n]!=-1) return dp[i][n];
        int rodlen=i+1;
        int nottake=solve(i-1,n,price,dp);
        int take=Integer.MIN_VALUE;
        if(rodlen<=n){
            take=price[i]+solve(i,n-rodlen,price,dp);
        }
        return dp[i][n]=Math.max(take,nottake);
    }
}
