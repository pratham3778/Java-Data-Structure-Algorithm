package Recursion;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        // int fnm1 = fib(n-1);
        // int fnm2 = fib(n-2);
        // int fn = fnm1 + fnm2;
        // return fn;

        return fib(n-1) + fib(n-2);
    }

    //using interative approch
    static void fibo(int n) {

    int n1 = 0;
    int n2 = 1;

    for(int i=0;i<n;i++) {
        System.out.print(n1 + " ");
        int n3 = n1+n2;
        n1 = n2;
        n2 = n3;
        }
    }
    public static void main(String[] args) {
        int n = 5;

        /* for(int i=0;i<n;i++) {
            System.out.print(fib(i)+" ");
        } */

        fibo(n);
    }
}
