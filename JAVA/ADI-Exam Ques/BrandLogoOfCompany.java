import java.util.HashMap;

public class BrandLogoOfCompany {
    public static Character solve(String husband,HashMap<Character,Integer> map){
        for(int i=0;i<husband.length();i++){
           char c=husband.charAt(i);
            if(map.containsKey(c)){
                return c;
            }
        }
        return 'h';
    }
    public static void main(String[] args) {
        String husband="nimish";
        String wife="seema";
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<wife.length();i++){
            char c=wife.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, i);
            }
        }
        System.out.println("Brand logo is "+ solve(husband,map));
    }
}
