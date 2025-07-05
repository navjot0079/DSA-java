import java.util.Scanner;
public class primefactors {
    public static void factors(int n){
        int i=2;
        while(n!=1){
            if(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            else{
                i++;
            }
        }
        
    }
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factors(n);
        sc.close();
    }

}
