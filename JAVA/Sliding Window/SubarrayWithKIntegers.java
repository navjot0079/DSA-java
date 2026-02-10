import java.util.HashMap;

public class SubarrayWithKIntegers{
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums, k)-solve(nums, k-1);
    }
    public static  int solve(int nums[],int k){
        int n=nums.length;
        int left=0,right=0;
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<n){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;
            }
            cnt+=right-left+1;
            right++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        int result = subarraysWithKDistinct(nums, k);
        System.out.println("Number of subarrays with exactly " + k + " distinct integers: " + result);
    }
}
