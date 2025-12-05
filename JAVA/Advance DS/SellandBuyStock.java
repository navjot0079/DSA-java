class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int r[]:dp) Arrays.fill(r,-1);
        return solve(dp,prices,n,0,1);
    }
    public int solve(int dp[][],int prices[],int n,int i,int buy){
        if(i>=n ) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        if(buy==1){
            return dp[i][buy]=Math.max(solve(dp,prices,n,i+1,0)-prices[i],solve(dp,prices,n,i+1,1));
        }
            return dp[i][buy]=Math.max(solve(dp,prices,n,i+2,1)+prices[i],solve(dp,prices,n,i+1,0));
    
    }
}
