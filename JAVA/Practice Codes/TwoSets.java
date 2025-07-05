import java.util.ArrayList;
import java.util.Scanner;

public class TwoSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        long totalSum = (long) n * (n + 1) / 2;

        // If the sum is odd, it's not possible to divide into two equal subsets
        if (totalSum % 2 != 0) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        long target = totalSum / 2;

        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();

        while (n > 0) {
            if (target >= n) {
                set1.add(n);
                target -= n;
            } else {
                set2.add(n);
            }
            n--;
        }

        System.out.println(set1.size());
        for (int num : set1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(set2.size());
        for (int num : set2) {
            System.out.print(num + " ");
        }
    }
}
