import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int arr[]={2,1,4,9};
        int n=4;
        int dp[]=new int[n];
        Arrays.fill(dp, -1);
        int a = solve(arr,dp,0,n-2);
        int b = solve(arr,dp,1,n-1);
        System.out.println(Math.max(a, b));
    }
    public static int solve(int arr[],int dp[],int st,int end){
        if (st>end) {
            return 0;
        }
        dp[st]=arr[st];
        dp[st+1]=Math.max(dp[st+1], dp[st]);
        for (int i = st+2; i <=end; i++) {
            dp[i]=Math.max(dp[i-1], dp[i-2]+arr[i]);
        }
        
        return dp[end];
    }
}
