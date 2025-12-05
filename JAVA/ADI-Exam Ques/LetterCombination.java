import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombination {
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        solve(ans, map, digits, new StringBuilder(), 0);
        return ans;
    }

    public static void solve(List<String> ans, HashMap<Character, String> map, String digits, StringBuilder s, int idx) {
        if (s.length() == digits.length()) {
            ans.add(new String(s));
            return;
        }
        String letter = map.get(digits.charAt(idx));
        for (int i = 0; i < letter.length(); i++) {
            s.append(letter.charAt(i));
            solve(ans, map, digits, s, idx + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public static void main(String[] args) {
        String str = "52";
        System.out.println(letterCombinations(str));
    }
}
