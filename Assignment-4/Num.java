import java.util.Scanner;
class Num {
    static void PrintNum(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        PrintNum(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintNum(1,n);
    }

}