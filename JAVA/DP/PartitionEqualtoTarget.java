import java.util.*;
public class PartitionEqualtoTarget {

    static boolean equalPartition(int arr[]) {
        int sum = 0;
        for (int num : arr) sum += num;

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        boolean dp[] = new boolean[target + 1];
        dp[0] = true;

        for (int num : arr) {
            for (int t = target; t >= num; t--) {
                dp[t] = dp[t] || dp[t - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = equalPartition(arr);

        if (result) {
            System.out.println("Array can be partitioned into two equal subsets.");
        } else {
            System.out.println("Array cannot be partitioned into two equal subsets.");
        }

        sc.close();
    }
}


