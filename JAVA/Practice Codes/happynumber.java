import java.util.*;
public class happynumber {

  static boolean isHappy(int n) 
  {
    Set<Integer> seen = new HashSet<>();
    while (n != 1 && !seen.contains(n)) {
      seen.add(n);
      n = getSumOfSquares(n);
    }
    return n == 1;
  }
  private static int getSumOfSquares(int num) {
    int sum = 0;
    while (num > 0) {
      int digit = num % 10;
      sum += digit * digit;
      num /= 10;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(isHappy(n));
  }
}
