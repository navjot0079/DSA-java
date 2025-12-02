import java.util.*;

public class DecodeString {
    
    static List<String> result = new ArrayList<>();
    
    public static void decode(String digits, int index, String current) {
        // Base case: reached end of string
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Take one digit
        int num1 = digits.charAt(index) - '0';
        if (num1 >= 1 && num1 <= 9) {
            char ch1 = (char) ('a' + num1 - 1);
            decode(digits, index + 1, current + ch1);
        }

        // Take two digits (if valid)
        if (index + 1 < digits.length()) {
            int num2 = Integer.parseInt(digits.substring(index, index + 2));
            if (num2 >= 10 && num2 <= 26) {
                char ch2 = (char) ('a' + num2 - 1);
                decode(digits, index + 2, current + ch2);
            }
        }
    }

    public static void main(String[] args) {
        String input = "1123";
        decode(input, 0, "");
        System.out.println(result);
    }
}
