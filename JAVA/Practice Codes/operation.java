import java.util.Scanner;

public class operation {

    public static int factorial(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                continue;
            }
            else{
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int result = factorial(n);
        System.out.println(result);
        sc.close();
    }
}
