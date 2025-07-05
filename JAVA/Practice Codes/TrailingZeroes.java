import java.util.Scanner;

public class TrailingZeroes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextInt();
        int trailingZeroes=0;
        for (int i = 5; i <= n; i *= 5) {
            trailingZeroes += n / i;
        }
         System.out.println( trailingZeroes);
        scanner.close();
    }
}
