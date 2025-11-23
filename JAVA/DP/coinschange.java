import java.util.Arrays;

public class coinschange {
    public static int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount + 1];
        for (int r[] : dp)
            Arrays.fill(r, -1);
        int res = solve(coins, amount, dp, coins.length - 1);
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    public static int solve(int arr[], int target, int dp[][], int i) {
        if (i == 0) {
            if (target % arr[i] == 0)
                return target / arr[0];
            return Integer.MAX_VALUE;
        }
        if (target < 0)
            return Integer.MAX_VALUE;
        ;
        if (dp[i][target] != -1)
            return dp[i][target];
        int take = Integer.MAX_VALUE;
        if (arr[i] <= target) {
            int temp = solve(arr, target - arr[i], dp, i);
            if (temp != Integer.MAX_VALUE)
                take = 1 + temp;
        }
        int nottake = solve(arr, target, dp, i - 1);
        return dp[i][target] = Math.min(take, nottake);
    }

    public static void main(String[] args) {
        int arr[]={1,2,5};
        int amt=11;
        System.out.println(coinChange(arr, amt));
    }
}
