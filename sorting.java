public class sorting {
    // bubble sort
    // public static void main(String[]args){
        // int arr[]={7,8,9,65,43,24,54};
        // int temp=0;
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //         temp=arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp;
        //     }}
        // }
        // for(int i=0;i<arr.length;i++)
        // System.out.print(arr[i]+" ");
    // }
    

    //selection sort
    // public static void main(String[]args){
        // int arr[]={7,8,9,65,43,24,54};
        // int temp=0;
        //     for(int i=0;i<arr.length-1;i++){
        //     int smallest=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[smallest]>arr[j]){
        //         smallest=j;
        //     }}
        //     temp=arr[smallest];
        //     arr[smallest]=arr[i];
        //     arr[i]=temp;
        // }
        // for(int i=0;i<arr.length;i++)
        // System.out.print(arr[i]+" ");
    // }

    //insertion sort

    public static void main(String[]args){
        int arr[]={7,8,9,6,4,2,5};
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
                while(j >= 0 && arr[j] > current) {
                    //Keep swapping
                    arr[j+1] = arr[j];
                    j--;
                }
            arr[j+1] = current;
        }
    
 
        
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
