import java.util.Scanner;

public class CoinPiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            long total = a + b;
            long min = Math.min(a, b);
            long max = Math.max(a, b);

            if (total % 3 == 0 && min * 2 >= max) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }

        System.out.print(result.toString());
        scanner.close();
    }
}
