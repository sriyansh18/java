public class reversing {
    public static void rotate(int[] arr){
        int k=4;
        int num=arr[arr.length-1];
        for(int i=1;i<k;i++){
            for(int j=arr.length-2;j>=0;j--){
                arr[i+1]=arr[i];
            }
        }
        arr[0]=num;}   

    public static void main(int[] args){
        int[] arr={1,2,5,4,6,7,8};
        rotate(arr);
        
    }
}
