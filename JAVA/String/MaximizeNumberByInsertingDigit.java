import java.util.*;

public class MaximizeNumberByInsertingDigit {
    public static void solve(String str,int k,ArrayList<String> list){
        
        for(int i=0;i<=str.length();i++){
            String temp=str.substring(0,i)+ k+str.substring(i);
            list.add(temp);
        }
    }
    public static void main(String[] args) {
        int n=6673;
        int k=6;
        String str=String.valueOf(n);
        ArrayList<String> list=new ArrayList<>();
        solve(str,k,list);
        int ans=0;
        for(String l:list){
            ans=Math.max(ans,Integer.parseInt(l));
        }
        System.out.println(ans);
    }
}
