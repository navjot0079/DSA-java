import java.util.*;
public class PartitionPalindrome {
    public static void main(String[] args) {
        String str="aab";
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        solve(0,str,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    public static void solve(int i,String s,ArrayList<String> path,ArrayList<ArrayList<String>> ans){
        if(i==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int idx=i;idx<s.length();idx++){
            if (isPalindrome(s,i,idx)) {
                path.add(s.substring(i,idx+1));
                solve(idx+1, s, path, ans);
                path.remove(path.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s,int i, int j){
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
