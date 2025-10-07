public class Parade {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};

        System.out.println(Sorted(arr1));
    }
    public static boolean Sorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}