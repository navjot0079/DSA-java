public class PrimeNumberfromBinaryRepresentation {
    public static void main(String[] args) {
        int left = 6;
        int right = 10;
        System.out.println("Count of numbers with prime set bits between " + left + " and " + right + ": " + countPrimeSetBits(left, right));
    }
    public static boolean check(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int countPrimeSetBits(int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
            int ans=0;
            String bits=Integer.toBinaryString(i);
            for(int a:bits.toCharArray()){
                if(a=='1')ans++;
            }
            if(check(ans)) cnt++;
        }
    return cnt;
    }
}
