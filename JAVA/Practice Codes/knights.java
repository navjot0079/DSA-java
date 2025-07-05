import java.util.Scanner;
public class knights {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); 
        for (int n = 1; n <= k; n++) {
            long totalWays = (long) n * n * (n * n - 1) / 2; 
            long attackWays = 4 * (n - 1) * (n - 2); 
            long validWays = totalWays - attackWays; 
            System.out.println(validWays);
        }

        sc.close();
    }
}


