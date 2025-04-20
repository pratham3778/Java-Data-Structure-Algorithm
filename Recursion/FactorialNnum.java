package Recursion;

import java.util.Scanner;

public class FactorialNnum {

    public static int fact(int n) {
        int fact = 1; 

        for(int i=1;i<=n;i++) {
            fact *= i;
        }
        return fact;
    } 

    public static int facto(int n) {
        if (n == 0) {
            return 1;
        }

        return n * facto(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        // System.out.println("Factorial of " + 1 + " is: " + fact(1));
        // System.out.println("Factorial of " + 2 + " is: " + fact(2));
        // System.out.println("Factorial of " + 3 + " is: " + fact(3));
        // System.out.println("Factorial of " + 4 + " is: " + fact(4));
        // System.out.println();


        System.out.println("Factorial of " + n + " is: " + fact(n));
    }
}
