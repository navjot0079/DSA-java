public class LongestRepeatingCharWithKoperations {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int result = characterReplacement(s, k);
        System.out.println("Length of the longest substring after replacement: " + result);
    }
    public static int characterReplacement(String s, int k) {
        int left=0,maxfreq=0,maxlen=0;
        int n=s.length();
        int freq[]=new int[26];
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);

            while((right-left+1)-maxfreq > k){
                freq[s.charAt(left++)-'A']--;
            }
            maxlen=Math.max(maxlen,(right-left+1));
        }
        return maxlen;
    }
}
