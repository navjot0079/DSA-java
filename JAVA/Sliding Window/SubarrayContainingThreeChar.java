import java.util.HashMap;

public class SubarrayContainingThreeChar {
    public static int numberOfSubstrings(String s) {
        int n=s.length();
        int left=0,cnt=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()==3){
                cnt+=n-right;
                char d=s.charAt(left);
                map.put(d,map.get(d)-1);
                if(map.get(d) == 0) map.remove(d);
                left++;
            }
           
        }
        return cnt;
    }
    public static void main(String[] args) {
        String s = "abcabc";
        int count = numberOfSubstrings(s);
        System.out.println("Number of subarrays containing 'a', 'b', and 'c': " + count);
    }
}
