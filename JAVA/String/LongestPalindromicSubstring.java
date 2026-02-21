public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    public static String expand(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
    public static String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        if(n==1) return s;
        for(int i=0;i<n;i++){
                String p1=expand(s,i,i+1);
                if(p1.length()>ans.length()){
                    ans=p1;
                }

                String p2=expand(s,i,i);
                if(p2.length()>ans.length()){
                    ans=p2;
                }
            
        }
        return ans;
    }
    
}
