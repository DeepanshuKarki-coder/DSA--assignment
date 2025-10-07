public class KingFeast{
    public static void main(String[] args) {
        int[] arr={2,7,1,9,5};
        int n=arr.length;
        int max=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}