public class functions {
    static int a=3;
    public static void main(String[] args) {
        int b=12;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);

    }
    public static void swap(int a,int b) {
        int t=a;
        a=b;
        b=t;
    }
}
