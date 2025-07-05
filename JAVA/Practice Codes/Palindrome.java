public class Palindrome {
    public static boolean palindrome(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "abacabcb";
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j <= name.length(); j++) {
                String word = name.substring(i, j);
                if (palindrome(word)) {
                    System.out.println(word);
                }
            }
        }
    }
}
