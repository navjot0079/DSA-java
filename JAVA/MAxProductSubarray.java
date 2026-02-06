class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int maxp=nums[0];
        int maxn=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
           if(nums[i]<0){
            int temp=maxp;
            maxp=maxn;
            maxn=temp;
           }
           maxp=Math.max(nums[i],nums[i]*maxp);
           maxn=Math.min(nums[i],nums[i]*maxn);
           max=Math.max(max,maxp);
        }
        return max;
    }
}
