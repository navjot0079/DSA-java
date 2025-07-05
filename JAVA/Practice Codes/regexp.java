import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
public class regexp {
     public static void main(String[] args) {
    //     System.out.println(Pattern.matches("[^abc]", "a"));
    //     System.out.println(Pattern.matches("[a-g]", "h"));
    //     System.out.println(Pattern.matches("[abc]+", "aaa"));
    //     System.out.println(Pattern.matches("[a-z]+", "abc"));
    //     System.out.println(Pattern.matches("[a-z]+[0-9]+[a-z]", "abcd1234xyz"));


        // String str="today date is 10 April 2025 2347";
        // String str2="\\d{4}";
        // Pattern p=Pattern.compile(str2);
        // Matcher m=p.matcher(str);
        // while(m.find()){
        //     System.out.println(m.group());
        //     System.out.println(m.start()+" "+ m.end());
        // }
        // String replaced=m.replaceAll("@");
        // System.out.println(replaced);

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Pattern pattern=Pattern.compile("\\b[A-Z][a-zA-Z]*\\b");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        sc.close();
    }
}
