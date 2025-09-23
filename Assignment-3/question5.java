import java.util.*;
class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
      }
      
      System.out.print(summarray(arr,0));
      
       
    }
    static int summarray(int[] arr,int index){
        if(index==arr.length){
            return 0;
        }
        return arr[index] + summarray(arr,index+1);
    }
              
 }