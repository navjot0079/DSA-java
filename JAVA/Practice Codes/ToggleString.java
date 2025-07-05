public class ToggleString {

    public static void main(String[] args) {
        String str = "a2Bas56Bhj";
        String sb = new String();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                continue;
            }
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            } else {
                ch = Character.toLowerCase(ch);
            }
            // sb.setCharAt(i,ch);
            // sb.append(ch);
        }
        str = sb.toString();
        System.out.println(str);
    }
}