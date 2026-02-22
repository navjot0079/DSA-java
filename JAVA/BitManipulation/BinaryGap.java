public class BinaryGap {
    public static void main(String[] args) {
        int N = 22;
        int result = binaryGap(N);
        System.out.println("The longest binary gap for " + N + " is: " + result);
    }
    public static int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int last = -1;
        int maxGap = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (last != -1) {
                    maxGap = Math.max(maxGap, i - last);
                }
                last = i;
            }
        }
        return maxGap;
    }
}
