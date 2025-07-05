import java.util.Scanner;
import java.util.Stack;

public class removeconsecutivesubsequences {
    public static int[] remove(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for (int index = 0; index < arr.length;index++) {
            if(st.isEmpty()||st.peek()!=arr[index]) st.push(arr[index]);
            else if(arr[index]==st.peek()){
                if (index==n-1|| arr[index]!=arr[index+1]) {
                    st.pop();
                }
            }
        }
            int arr2[]=new int[st.size()];
            int m=arr2.length;
            for(int i=m-1;i>=0;i--){
                arr2[i]=st.pop();
            }
            return arr2;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int index = 0; index < arr.length; index++) {
            arr[index]=sc.nextInt();
        }
        int res[]=remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
}
