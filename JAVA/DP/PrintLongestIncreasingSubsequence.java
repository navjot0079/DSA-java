class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int dp[]=new int[n];
        int parent[]=new int[n];
         Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        int maxlen=1;
        int previdx=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i] && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    parent[i]=j;
                }
            }
            if(dp[i]>maxlen){
                maxlen=dp[i];
                previdx=i;
            }
        }
        while(parent[previdx]!=previdx){
            ans.add(arr[previdx]);
            previdx=parent[previdx];
        }
        ans.add(arr[previdx]);

        Collections.reverse(ans);
        
        return ans;
    }
}
