public class FirstOccurence {
    public static int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        int i=0,j=0;
        while(i<m){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                if(j==n) return i-j;
            }
            else{
                i=i-j+1;
                j=0;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }
}

