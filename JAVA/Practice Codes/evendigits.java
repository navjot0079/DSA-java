import java.util.*;
public class evendigits {

    public static int evenDigits(int n) {
        if (n == 0) {
            return 0; // Base case
        }
        int digit = n % 10;
        if (digit % 2 == 0) {
            return evenDigits(n / 10) * 10 + digit; // Recursive step
        } else {
            return evenDigits(n / 10); // Skip odd digits
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = evenDigits(Math.abs(n)); // Handle negative numbers
        System.out.print(result == 0 ? 0 : result); // Print -1 if no even digits
        sc.close();
    }

}
