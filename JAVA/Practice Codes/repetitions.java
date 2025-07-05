import java.util.Scanner;

public class repetitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int maxlen=1;
        int max=1;
        for (int index = 1; index < name.length(); index++) {
            
            if(name.charAt(index)==name.charAt(index-1)){
                max++;
                maxlen=Math.max(max,maxlen);
            }
            else{
                
                max=1;
            }
        }
        System.out.println(maxlen);
        sc.close();

    }
}
