import java.util.*;
public class function {
    public static void printMyName(String name){
        System.out.println(name+" chauhan");
        return;
    }
public static int calsum(int a,int b){
    int sum=a+b;
    return sum;
}
public static int calproduct(int c,int d){
    int product=c*d;
    return product;
}
public static void calfactorial(int n){
    if(n<0){
        System.out.println("invalid number");
        return;
    }
    int factorial=1;
    for(int i=n;i>=1;i--){
        factorial=factorial*i;
    }
    System.out.println(factorial);
    return;
}
public static void calavg(int x,int y,int z){
    int avg=(x+y+z)/3;
    System.out.println(avg);
}
public static void calsumodd(int s){
    int sumofod=0;
        for(int i=0;i<=s;i++){
            if(i%2==1){
                sumofod=sumofod+i;
            }
            else continue;
        }System.out.println(sumofod);
    
}
public static int calgreater(int a,int b){
    int great=0;
    if(a>b){
        great=a;
    }
    else great=b;
    System.out.println(great+" is the gratest");
    return great;
}
public static float calcircum(float r){
    float circum=(2*r)*22/7;
    System.out.println(circum);
    return circum;
}
public static void eligvoter(int x){
    if(x>18){
        System.out.println("You are eligible for voting");
    }
    else System.out.println("You are not eligible for voting");
    return ;
}
public static void dowhil(String[]args){
    int i=1;
    do{
        System.out.println(i);
        i++;
    }while(i>0);
}
public static void calpower(int a,int b){
    double result = Math.pow(a, b);
    System.out.println(result);
    return;
}
// public static void nums(int n,String continu){
//     int zero=0;
//     int positive=0;
//     int negative=0;
//     if (continu=="y"){
//         int z=n;
//         if (z==0){
//             zero+=1;
//             System.out.println(zero);
//         }
//         else if(z>0){
//             positive+=1;
//             System.out.println(positive);
//         }
//         else {
//             negative+=1;
//             System.out.println(negative);
//         }
//     }
//     return;
// }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        // printMyName(name);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // int d=sc.nextInt();
        // int s=sc.nextInt();
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        // int z=sc.nextInt();
        // int x=sc.nextInt();
        // int n=sc.nextInt();
        // String continu=sc.next();
        // float r=sc.nextInt();
        // int sum=calsum(a, b);
        // System.out.println("sum of two numbers is: "+sum);
        // int product=calproduct(c, d);
        // System.out.println("the product of the two numbers is: "+product);
        // calfactorial(n);
        // calavg(x, y, z);
        // calsumodd(s);
        // int great=calgreater(a, b);
        // float circum=calcircum(r);
        // eligvoter(x);
        // dowhil(args);
        // calpower(a, b);
        // nums(n,continu);
    }
}
