public class StringPermutation {
    public static void swap(StringBuilder s,int i,int j){
        char temp=s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }
    public static void solve(StringBuilder s,int i){
        if(i==s.length()){
            System.out.println(s);
            return;
        }
        for(int k=i;k<s.length();k++){
            swap(s, i, k);
            solve(s, i+1);
            swap(s, i, k);
        }
    }
    public static void main(String[] args) {
        String s="ABC";
        solve(new StringBuilder(s),0);
    }
}
