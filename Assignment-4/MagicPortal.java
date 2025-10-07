public class MagicPortal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 8},
            {3, 6, 10},
            {7, 9, 12}
        };
        int target = 9;

        if (activatePortal(matrix, target)) {
            System.out.println("Activated");
        } else {
            System.out.println("Failed");
        }
    }

    public static boolean activatePortal(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0, col = m - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true; 
            } else if (matrix[row][col] > target) {
                col--; 
            } else {
                row++; 
            }
        }

        return false; 
    }
}