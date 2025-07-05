public class Mergesort {
    public static void main(String[] args) {
        
        int arr1[] = {4, 7, 11, 12, 14, 19, 25}; 
        int arr2[] = {8, 13, 15, 16}; 
        int n=arr1.length+arr2.length;
        int arr[] = new int[n]; 

        int j = 0; 
        int k = 0; 

        for (int i = 0; i < n; i++) {
            if (j < arr1.length && (k >= arr2.length || arr1[j] <= arr2[k])) {
                arr[i] = arr1[j];
                j++;
            } else {
                arr[i] = arr2[k];
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
