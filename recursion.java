public class recursion {
    public static int factorial(int n) {
        if (n==1) {
            return 1;
        }
        return n*factorial(n-1);

    }
    public static int  fib(int f) {
        if (f==0||f==1) {
            return f;
        }
        
        return fib(f-2)+fib(f-1);
    }
    public static int power(int x,int p) {
        if (p==0) {
            return 1;
        }
        return x*power(x, p-1);
        
    }
    public static void main(String[] args) {
        int n=6;
        int f=7;
        int x=3;
        int p=2;
        // int result =factorial(n);
        // System.out.println(result);
        // int result =fib(f);
        // System.out.println(result);
        int result =power(x,p);
        System.out.println(result);

    }
}
