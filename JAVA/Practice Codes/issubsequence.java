import java.util.*;

public class issubsequence {

    static boolean strSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++; 
            }
            i++; 
        }

        return j == str2.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        in.nextLine();
        
        while (t-- > 0) {
            String a = in.next();
            String b = in.next();
            
            if (strSubsequence(a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
