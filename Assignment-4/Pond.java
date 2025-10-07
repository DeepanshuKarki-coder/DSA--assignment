import java.util.Scanner;
public class Pond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] arr=new int[n][n];

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
        int sum=0;
         for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    sum++;
                }
            }
        }
         System.out.println(sum);
        


        
    }  
}