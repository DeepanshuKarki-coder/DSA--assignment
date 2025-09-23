import java.util.*;
class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
     String str = sc.nextLine();
     char[] arr = str.toCharArray();
     
     reverse(arr,0,arr.length-1);
     System.out.print(new String(arr));
     
     
    }
    
    static void reverse(char[] arr,int left,int right){
        if(left>=right){
            return ;
        }
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
         reverse(arr,left+1,right-1);
    }
    
    
}