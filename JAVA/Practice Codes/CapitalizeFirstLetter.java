import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static String capitalizeWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
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
            System.out.println(capitalizeWords(sentence));
        }
        
        scanner.close();
    }
}
