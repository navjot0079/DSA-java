import java.util.*;
public class StringCompression {

public static String compress(String str){
        if(str==null||str.length()==0) return "";
    int cnt=1;
    StringBuilder s=new StringBuilder();
    for(int i=0;i<str.length()-1;i++){
        if(str.charAt(i)==str.charAt(i+1)){
            cnt++;
        }
        else{
            s.append(str.charAt(i)).append(cnt);
            cnt=1;
        }
    }
    s.append(str.charAt(str.length()-1)).append(cnt);
    return s.toString();
}

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String ans=compress(input);
        sc.close();
        System.out.print(ans);
    }
}