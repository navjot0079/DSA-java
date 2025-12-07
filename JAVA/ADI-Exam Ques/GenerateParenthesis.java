import java.util.*;

public class GenerateParenthesis {
    public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        solve(n,ans,"",0,0);
        return ans;
    }
    public static void solve(int n,ArrayList<String> ans,String s,int open,int close){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n){
            solve(n,ans,s+'(',open+1,close);
        }
        if(close<open){
            solve(n,ans,s+')',open,close+1);
        }
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(generateParenthesis(n));
    }
}
