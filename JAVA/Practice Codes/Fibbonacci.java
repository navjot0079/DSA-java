import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);

        for(int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
        ab.close();
    }
}
