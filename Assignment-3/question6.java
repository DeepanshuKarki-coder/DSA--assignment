import java.util.*;

class question6 {

    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        question6 question = new question6();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = scanner.nextInt();
        System.out.println("Ways to climb " + n + " stairs: " + question.climbStairs(n));
    }
}
