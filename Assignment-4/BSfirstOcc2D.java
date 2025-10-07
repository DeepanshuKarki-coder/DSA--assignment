import java.util.*;
public class BSfirstOcc2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int r = -1;
        int c = -1;
        outerLoop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == target) {
                    r = i;
                    c = j;
                    break outerLoop;
                }
            }
        }
        System.out.println("(" + r + "," + c + ")");
    }
}