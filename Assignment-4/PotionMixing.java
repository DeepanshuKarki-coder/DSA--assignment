public class PotionMixing{
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7};
        int n=arr.length;
        int target = 6;
        find(arr, n, target);
    }
    public static void find(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + "," + j);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
}