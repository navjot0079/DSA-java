import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int a=0,b;
        try{
            // a=sc.nextInt();
            // b=sc.nextInt();
            // System.out.println(a/b);
            int arr[]=new int[3];
            System.out.println(arr[3]);
        }
        catch(ArithmeticException ex){
            System.out.println("Cannot divide zero");
            // b=sc.nextInt();
            // System.out.println(a/b);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("IndexOutOfBoundsException");
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("at last");
        sc.close();
    }
}
