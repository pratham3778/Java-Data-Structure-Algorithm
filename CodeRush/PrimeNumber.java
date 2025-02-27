package CodeRush;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        for(int i=2;i<= number/2;i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}