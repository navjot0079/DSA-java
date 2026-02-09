public class MaximumPoints{
    public static void main(String[] args) {
        int[] points = {1, 2, 3, 4, 5};
        int k = 2;
        int maxPoints = maxPoints(points, k);
        System.out.println("Maximum points: " + maxPoints);
    }
    public static int maxPoints(int[] nums, int k) {
        int left=0,sum=0,mini=Integer.MAX_VALUE;
        int n=nums.length;
        int wsum=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            if(right-left<n-k){
                wsum+=nums[right];
            }
            if(right-left+1==n-k){
                mini=Math.min(mini,wsum);
                wsum-=nums[left];
                left++;
            }
        }
        if(n==k) return sum;
        return sum-mini;
    }
}