package CodeRush;

public class Fibonacci {
    // public static void fib(int n) {
    //     int a = 0;
    //     int b = 1;
    //     int c;

    //     for(int i=0;i < n;i++) {
    //         System.out.println(a + " ");
    //         c = a + b;
    //         a = b;
    //         b = c; 
    //     }
    // }

    public static int fibo(int n) {
        if(n == 0 || n ==1) {
            return n;
        }

        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int fn = fnm1 + fnm2;

        return fn;
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

       //f.fib(10);
       int result = f.fibo(4);
       System.out.println(result);
    }
}

