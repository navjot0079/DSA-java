import java.util.Scanner;

public class goodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                for (int j = i + 1; j < str.length() && (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
                || str.charAt(j) == 'u') ; j++) {
                
                    count++;
                }
                if(count>max){
                    max = count;
                    x = i;
                }
            }
            
        }
        sc.close();
        System.out.println(str.substring(x, x+max));
    }
}