public class Staircase {
    public static int count(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;    
            b = c;    
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 4;
        int result=count(n);
        System.out.println(result);
    }
}