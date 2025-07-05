import java.util.Scanner;

public static int solve(int n) {
    int digits = String.valueOf(n).length();
    int ans = (digits - 1) * 9;

    int base = 0;
    for (int i = 1; i <= 9; i++) {
        int num = 0;
        for (int j = 0; j < digits; j++) {
            num = num * 10 + i;  
        }
        if (num <= n) {
            ans++;
        }
    }

    return ans;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        System.out.println(solve(t));
        // int arr[]=new int[t];
        // int k=0;
        // while(t-- >0){
        //     int ans=0;
        //     int n=sc.nextInt();
        //     arr[k]=solve(n);
        //     k++;
        //     }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
            sc.close();
        }
    

