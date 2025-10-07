public class AncientScroll {
    public static void main(String[] args){
        int [] arr={2,5,7,8};
        int n=arr.length;
        int target=7;
        int result=Search(arr,n,target);
        System.out.println(result);
    }
    public static int Search(int[] arr, int n, int target){

        for(int i=0; i<n; i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;

    }
}