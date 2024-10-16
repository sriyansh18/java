import java.util.*;
public class arr {
    public static void display(int[][]arr,int rows,int columns){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
    public static void rowbysort(int[][]arr,int rows,int columns){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                Arrays.sort(arr[i]);
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        
}
    public static void linearsearch(int[][]arr,int columns,int rows,int x){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]==x){
                    System.out.println(+x+" is found at "+"["+i+","+j+"]");
                }
                
            }System.out.println();
        }
        
    }
    public static void sortbycol(int[][]arr,int columns){
        Arrays.sort(arr,(a,b)->Integer.compare(a[columns], b[columns]));
    }
    public static void fullarr(int[][] arr,int rows,int columns){
        int[] siuuu=new int[rows*columns];
        // populate
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                siuuu[columns*i+j]=arr[i][j];
            }
        }
        Arrays.sort(siuuu);
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=siuuu[columns*1+j];
                
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
                
            }System.out.println();
        }
        
        
        

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=76;
        int rows=2;
        int columns=4;
        int nums=1;
        int [][]arr={
            {9,8,76,5},
            {3,2,4,5},
            // {6,4,3,5}
        };
        linearsearch(arr, columns, rows, x);
        // fullarr(arr, rows, columns);
        // int [][] arr=new int[rows][columns];
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<columns;j++){
        //         arr[i][j]=nums;
        //         nums++;
        //     }
        // }
        // sortbycol(arr, columns);
        // rowbysort(arr, rows, columns);
        int rows=3;
        int columns=4;
        int nums=1;
        int [
            
        ][] arr=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=nums;
                nums++;
            }
        }
        // display(arr, rows, columns);

        //practice

        // System.out.println("enter the size of array");
        // int size=sc.nextInt();
        // int[] arr=new int[size];
        // System.out.println("enter the number you want to find");
        // int x=sc.nextInt();
        // System.out.println("enter the numbers for array");
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("the index of x is ");
        // for(int j=0;j<size;j++){
        //     if(arr[j]==x){
        //         System.out.println(j);
        //     }
            
        // }
        //2-D ARRAY
        // System.out.println("enter the no. of rows: ");
        // int rows=sc.nextInt();
        // System.out.println("enter the no. of columns: ");
        // int colms=sc.nextInt();
        // int[][] arra=new int[rows][colms];
        // System.out.println("enter the numbers for matrix: ");
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<colms;j++){
        //         arra[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<colms;j++){
        //         System.out.print(arra[i][j]+" ");
        //     }System.out.println();
        // }
        // System.out.println("enter the number you want to find: ");
        // int x=sc.nextInt();
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<colms;j++){
                // if (arra[i][j]==x){
                //     System.out.println("x is found at location: "+"("+i+","+j+")");
                // }
        //     }
        // }
        // slef tried
    //     System.out.println("enter the no. of rows:");
    //     int rows=sc.nextInt();
    //     System.out.println("enter the no. of columns:");
    //     int colms=sc.nextInt();
    //     int[][] arr=new int[rows][colms];
    //     System.out.println("enter the numbers in array:");
    //     for(int i=0;i<rows;i++){
    //         for(int j=0;j<colms;j++){
    //             arr[i][j]=sc.nextInt();
    //         }}
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<colms;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }System.out.println();
        
        // }
    // }

    
    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<columns;j++){
    //         System.out.print(arr[i][j]+" ");
    //     }System.out.println();
    
    // }
    }
}
