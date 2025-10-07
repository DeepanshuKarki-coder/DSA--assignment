import java.util.Scanner;
public class Diagonal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int[n][m];

        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array: ");
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        int Diagonal1 = 0;
        int Diagonal2 = 0;

        for (int i = 0; i < n; i++) {
            Diagonal1 += arr[i][i];              
            Diagonal2 += arr[i][m - 1 - i];  
        }
        System.out.println(Diagonal1);
        System.out.println(Diagonal2);
        

    }  
}