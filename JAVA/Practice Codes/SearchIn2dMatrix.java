public class SearchIn2dMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        boolean result = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + result);
    }
     public static boolean searchMatrix(int[][] matrix, int target) {
        int left=0,right=matrix[0].length-1;
        while(left<matrix.length && right>=0){
            if(matrix[left][right]==target ){
                return true;
            }
            else if(matrix[left][right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}
