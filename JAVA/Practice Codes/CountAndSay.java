class Solution {
    public String countAndSay(int n) {
        String ans="1";
        int t=n;
        while(t-- >1){
        StringBuilder s=new StringBuilder();
            int cnt=1;
            for(int i=0;i<ans.length()-1;i++){
                if(ans.charAt(i)==ans.charAt(i+1)){
                    cnt++;
                }
                else{
                    s.append(cnt);
                    s.append(ans.charAt(i));
                    cnt=1;
                }
            }
            s.append(cnt);
            s.append(ans.charAt(ans.length()-1));
            ans=s.toString();
        }
        return ans;
    }
}
