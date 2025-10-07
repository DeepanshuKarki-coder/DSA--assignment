import java.util.Scanner;
public class TreasureIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        int[][] arr = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;
        int maxRow = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i + 1;
            }
        }

        System.out.println("Row " + maxRow + " (sum=" + maxSum + ")");
        sc.close();
    }
}

