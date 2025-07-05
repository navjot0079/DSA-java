import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        scanner.close();
        
        
        
        String numStr = Integer.toString(number);
        StringBuilder newNumber = new StringBuilder();
        
        for (char digit : numStr.toCharArray()) {
            int incrementedDigit = ((digit - '0') + 1) % 10; // Add 1 and ignore carry
            newNumber.append(incrementedDigit);
        }
        
        System.out.println(newNumber.toString());
        
    }
}
