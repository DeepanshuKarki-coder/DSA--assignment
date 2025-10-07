public class LostSoldier {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0, 1, 2, 4, 5};

        int lost= find(arr, n);
        System.out.println(lost);
    }

    public static int find(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return totalSum - actualSum;
    }
}