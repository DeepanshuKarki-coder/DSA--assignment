public class Door {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,9};
        int n=arr.length;
        int target=7;
        int result=bs(arr,target,n);
        System.out.println(result);
    }
    public static int bs(int[] arr, int target, int n) {
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target) {
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
    }
    return -1;
}
}