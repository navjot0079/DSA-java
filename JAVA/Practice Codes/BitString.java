import java.util.Scanner;

public class BitString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int ans=1;
        for(int i=0;i<n;i++){
            ans*=2;
        }
        System.out.println(ans);
        s.close();
    }
}
