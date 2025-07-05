import java.util.Scanner;

public class PalindromeWordCounter {
    
    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static int countPalindromeWords(String sentence) {
        String[] words = sentence.split(" "); // Split words by spaces
        int count = 0;
        
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        
        int result = countPalindromeWords(sentence);
        System.out.println(result);
    }
}