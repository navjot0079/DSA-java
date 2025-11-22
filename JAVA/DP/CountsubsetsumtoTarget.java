import java.util.Arrays;

public class CountsubsetsumtoTarget {
    public static int MOD = 1000000007;

    public static int perfectSum(int[] arr, int target) {
        int dp[][] = new int[arr.length][target + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        return solve(arr, target, dp, 0);
    }

    public static int solve(int[] arr, int target, int dp[][], int i) {

        // reached end → check if sum is matching
        if (i == arr.length) {
            return target == 0 ? 1 : 0;
        }
        if (dp[i][target] != -1)
            return dp[i][target];

        // take
        int take = 0;
        if (arr[i] <= target) {
            take = solve(arr, target - arr[i], dp, i + 1);
        }

        // not take
        int notTake = solve(arr, target, dp, i + 1);

        dp[i][target] = (take + notTake) % MOD;
        return dp[i][target];
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 16, 8, 10};
        int  K = 10;
        System.out.println(perfectSum(arr,K));
    }
}
