import java.util.Scanner;

public class NumSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            System.out.println(findSpiralValue(x, y));
        }
        sc.close();
    }

    static long findSpiralValue(long x, long y) {
        long maxXY = Math.max(x, y);
        long maxValue = maxXY * maxXY;

        if (x == maxXY) { 
            return (maxXY % 2 == 1) ? maxValue - (y - 1) : (maxValue - (2 * maxXY - x - y));
        } else { 
            return (maxXY % 2 == 1) ? (maxValue - (2 * maxXY - x - y)) : maxValue - (x - 1);
        }
    }
}
