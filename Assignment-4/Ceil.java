public class Ceil {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target = 5;

        System.out.println("Ceil Element: " + findCeil(arr, target));
    }

    public static int findCeil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid]; 
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}