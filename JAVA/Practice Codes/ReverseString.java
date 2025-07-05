
    import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < T; i++) {
            String sentence = scanner.nextLine();
            System.out.println(reverseString(sentence));
        }
        
        scanner.close();
    }
}

