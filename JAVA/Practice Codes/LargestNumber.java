import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Integer[] nums = {32, 3, 30, 94, 9, 7};

        Arrays.sort(nums, (a, b) -> {
            String order1 = a.toString() + b.toString();
            String order2 = b.toString() + a.toString();
            return order2.compareTo(order1); 
        });

        if (nums[0] == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder largest = new StringBuilder();
        for (int num : nums) {
            largest.append(num);
        }

        System.out.println("Largest number: " + largest.toString());
    }
}
