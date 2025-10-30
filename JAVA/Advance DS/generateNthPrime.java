public class generateNthPrime {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        int num=1;
        while(count<n){
            num++;
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println(num);
    }
}
