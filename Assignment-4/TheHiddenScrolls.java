import java.util.*;
public class TheHiddenScrolls{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt(), target=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){ 
            mat[i][j]=sc.nextInt();
          }
        }
        int i=0,j=m-1; 
      boolean found=false;
        while(i<n && j>=0){
            if(mat[i][j]==target){
              found=true;
              break;
            }
            else if(mat[i][j]>target){ 
              j--;
        }
            else {
              i++;
            }
        }
        System.out.println(found);
    }
}