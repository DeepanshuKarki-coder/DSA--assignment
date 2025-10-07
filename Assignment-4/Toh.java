public class Toh {
    public static void main(String[] args) {
        int n = 3;
        int moves = towerOfTemples(n, 'A', 'C', 'B');
        System.out.println("Total moves: " + moves);
    }
    public static int towerOfTemples(int n, char source, char destination, char helper) {
        if (n == 0) {
            return 0;
        }

        int moves1 = towerOfTemples(n - 1, source, helper, destination);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        int moves2 = towerOfTemples(n - 1, helper, destination, source);
        
        return moves1 + 1 + moves2;
    }
}