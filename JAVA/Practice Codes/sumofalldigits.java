import java.util.Scanner;
public class sumofalldigits {
    public static int sumOfDigits(int n){
        if (n < 0) {
            return -sumOfDigits(-n); // Handle negative numbers
        }
        if (n == 0) {
            return 0; // Base case
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sumOfDigits(n));
        sc.close();
    }

}
