public class patternprac {
    // public static void main(String[]args){
    //     int n=5;
    // for(int i=1;i<=2*n-1;i++){
    //     if (i<=n){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }}
    //     else if (i>n){
    //         for(int j=1;j<2*n-i+1;j++){
    //             System.out.print("*");
    //         }
    //     }System.out.println();
    // }
    // }
    // public static void main(String[]args){
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=2*i-1;j++){
    //             System.out.print("*");
    //         }System.out.println();
    //     }
    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=2*i-1;j++){
    //             System.out.print("*");
    //         }System.out.println();
    //     }
    //     }
    // public static void main(String[]args){
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i*2-1;j++){
    //             if((j)%2==0){
    //                 System.out.print("!");
    //             }
    //             else System.out.print("*");
    //         }System.out.println();
    //     }
    // }

        // public static void main(String[] args) {
        //     int n = 5; // Number of rows in the largest part of the pattern
        
        //     for (int i = 1; i <= 2 * n - 1; i++) {
        //         // Determine the number of stars to print on the current line
        //         int starsToPrint;
        //         if (i <= n) {
        //             starsToPrint = i; // Increase the number of stars up to n
        //         } else {
        //             starsToPrint = 2 * n - i; // Decrease the number of stars after n
        //         }
        
        //         // Print the stars
        //         for (int j = 1; j <= starsToPrint; j++) {
        //             System.out.print("*");
        //         }
        
        //         // Move to the next line after printing stars
        //         System.out.println();
        //     }
        // }
        public static void main(String[] args) {
            int n = 5; // Number of rows in the largest part of the pattern
        
            for (int i = 1; i <= 2 * n - 1; i++) {
                // Determine the number of stars to print on the current line
                int starsToPrint;
                if (i <= n) {
                    starsToPrint = i; // Increase the number of stars up to n
                } else {
                    starsToPrint = 2 * n - i; // Decrease the number of stars after n
                }
        
                // Print the stars
                for (int j = 1; j <= starsToPrint; j++) {
                    System.out.print("*");
                }
        
                // Move to the next line after printing stars
                System.out.println();
            }
        }
        
    }
