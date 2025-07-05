import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter your num: ");
        for(int i=2;i<20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        ab.close();
    }
}
