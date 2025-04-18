package Recursion;

import java.util.Scanner;

public class PrimeNum {

    static boolean prime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n%i == 0) {
            return false;
        }
        if (i*i >n) {
            return true;
        }

        return prime(n, i+1);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        /* System.out.println("Prime Number: " + n);
        for(int i=2;i<=n;i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        } */

        if (prime(n, 2)) {
            System.out.println(n + "isprime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
