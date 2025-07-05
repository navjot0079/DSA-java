public class lowerandupperbound {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int tar = 5; 

        int i = 0;
        int n = arr.length - 1;
        int lower = -1;
        int upper = -1;

        while (i <= n) {
            int mid = i + (n - i) / 2;

            if (arr[mid] == tar) {
                lower = tar;
                upper = (mid + 1 < arr.length) ? arr[mid + 1] : tar;
                break;
            } else if (arr[mid] < tar) {
                i = mid + 1;
            } else {
                upper = arr[mid];
                n = mid - 1;
            }
        }

        if (lower == -1) {
            lower = upper;
        }

        if (upper != -1) {
            System.out.println("Lower = " + lower + ", Upper = " + upper);
            System.out.println("Upper - Lower = " + (upper - lower));
        } else {
            System.out.println("No element greater than target found.");
        }
    }
}
