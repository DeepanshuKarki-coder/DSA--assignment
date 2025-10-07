public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target = 6;

        System.out.println(upperBound(arr, target));
    }

    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int n= arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                n = mid;     
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return n;
    }
}
