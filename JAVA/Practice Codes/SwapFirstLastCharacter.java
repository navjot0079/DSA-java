import java.util.Scanner;

public class SwapFirstLastCharacter {
    public static String swapFirstLastChar(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 1) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                result.append(last).append(word, 1, word.length() - 1).append(first).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < T; i++) {
            String sentence = scanner.nextLine();
            System.out.println(swapFirstLastChar(sentence));
        }
        
        scanner.close();
    }
}