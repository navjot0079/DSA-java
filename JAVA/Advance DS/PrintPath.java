import java.util.Scanner;

public class PrintPath{
    public static void printpath(int n,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printpath(n-1, str+"1 ");
        if (n>=2) {
        printpath(n-2, str+"2 ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        printpath(n,"");
        sc.close();
    }
}