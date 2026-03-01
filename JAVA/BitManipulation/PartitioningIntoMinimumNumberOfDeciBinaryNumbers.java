public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        String n = "82734";
        int result = minPartitions(n);
        System.out.println("Minimum number of deci-binary numbers: " + result);
    }
    public static int minPartitions(String n) {
        int cnt=0;
        for(Character c:n.toCharArray()){
            cnt=Math.max(cnt,c-'0');
        }
        return cnt;
    }
}
