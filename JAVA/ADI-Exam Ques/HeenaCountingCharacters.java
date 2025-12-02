import java.util.HashMap;
import java.util.Map;

public class HeenaCountingCharacters {
    public static void main(String[] args) {
        String str = "helloworld";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(str.charAt(i))) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
        String s="";
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            s+=entry.getKey()+""+entry.getValue()+" ";
        }
        System.out.println(s.trim());
    }
}
