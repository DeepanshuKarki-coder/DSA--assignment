public class Basket {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int n=arr.length;
        int target=25;

        int result=search(arr,n,target);

        System.out.println(result);
}
    public static int search(int[] arr, int n, int target){

           for(int i=0; i<n; i++){
            if(target==arr[i]){
               return i;
            }
        }
        return -1;
    }
}