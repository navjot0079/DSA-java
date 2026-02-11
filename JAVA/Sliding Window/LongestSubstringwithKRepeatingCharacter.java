public class LongestSubstringwithKRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aaabb";
        int k = 3;
        int result = longestSubstring(s, k);
        System.out.println("Length of the longest substring where each character appears at least " + k + " times: " + result);
    }
    public static int  longestSubstring(String s, int k) {
        int ans=0,n=s.length();
        for(int targetunique=0;targetunique<=26;targetunique++){
            int left=0,right=0;
            int unique=0,countk=0;
            int freq[]=new int [26];
            while(right<n){
                int idx=s.charAt(right)-'a';
                if(freq[idx]==0) unique++;
                freq[idx]++;
                if(freq[idx]==k) countk++;
                right++;

                while(unique>targetunique){
                    int lidx=s.charAt(left)-'a';
                    if(freq[lidx]==k) countk--;
                    freq[lidx]--;
                    if(freq[lidx]==0) unique--;
                    left++;
                }
            if(unique==countk && unique==targetunique){
                ans=Math.max(ans,right-left);
            }
            }
        }
        return ans;
    }
}
