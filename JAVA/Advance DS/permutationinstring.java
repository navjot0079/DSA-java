import java.util.Arrays;
public class permutationinstring {

    public static void main(String[] args) {
        String inputString = "ABC";
        char [] chars=inputString.toCharArray();
        Arrays.sort(chars);
        String input=new String(chars);
        System.out.println("permutations of "+inputString+"are ");
        solve(input,"");
    }
    public static void solve(String rem,String curr){
        if(rem.length()==0){
            System.out.println(curr);
            return;
        }
        for(int i=0;i<rem.length();i++){
            char c=rem.charAt(i);
            String newcurr=curr+c;
            String newrem=rem.substring(0,i)+rem.substring(i+1);
            solve(newrem,newcurr);
        }
    }

}


