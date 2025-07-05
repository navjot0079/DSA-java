import java.util.*;

public class longestsequenceofconsecutivenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        HashSet<Integer> hset = new HashSet<>();
        
        System.out.println("Enter numbers (type 'done' to finish):");

        while (sc.hasNextInt()) { 
            int a = sc.nextInt();
            arrList.add(a);
            hset.add(a);
        }
        sc.close(); 

        int maxlen = 0;

        for (int num : arrList) {
            if (!hset.contains(num - 1)) { 
                int cnt = 1;
                int current = num + 1;

                while (hset.contains(current)) {
                    cnt++;
                    current++;
                }

                maxlen = Math.max(maxlen, cnt);
            }
        }

        System.out.println("Longest consecutive sequence length: " + maxlen);
    }
}
