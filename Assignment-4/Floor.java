public class Floor{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        int target = 5;

        System.out.println("Floor Element: " + findFloor(arr, target));
    }

    public static int findFloor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1; 

        while (low <= high) {
            int mid = (low+high) / 2;

            if (arr[mid] <= target) {
                ans = arr[mid]; 
                low = mid + 1;  
            } else {
                high = mid - 1; 
            }
        }

        return ans;
    }
}
