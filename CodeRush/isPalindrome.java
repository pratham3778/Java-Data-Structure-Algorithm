package CodeRush;

import java.util.Scanner;

public class isPalindrome {
    public boolean isPalin(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) { 
            return false; // Negative numbers and numbers ending with 0 (except 0 itself) can't be palindromes
        }

        int rev = 0;
        int original = x;

        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return rev == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        isPalindrome solution = new isPalindrome();
        boolean result = solution.isPalin(num);
        
        System.out.println("Is " + num + " a palindrome? " + result);
    }
}
