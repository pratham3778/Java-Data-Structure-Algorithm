package Recursion;

import java.util.Scanner;

public class SumNnum {
    //approch 1 : using for loop
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        for(int i=0;i<=n;i++) {
            sum += i;
        }

        return sum;
    }

    //approch 2 : using recursion
    public static int SumRec(int n) {
        if (n == 0) {
            return 0;
        }

        return n + SumRec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Sum of" + n + " is: " + SumRec(n));
    }
}
