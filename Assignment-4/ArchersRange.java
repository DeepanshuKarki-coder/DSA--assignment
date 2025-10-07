public class ArchersRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int target = 2;
        int index = firstOccur(arr, target);
        System.out.println(index);
    }
    public static int firstOccur(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]) {
                return i;
            }
        }
        return -1;
    }
}