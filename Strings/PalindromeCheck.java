package Strings;

public class PalindromeCheck {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int temp = x;
        int rev = 0;

        while(x > 0) {
            int digit = x % 10;
            rev = (rev*10) + digit;
            x = x/10;
        }
        if(rev == temp) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeCheck pal = new PalindromeCheck();

        int num1 = 121;
        System.out.println(num1 + " is palindrome: " + pal.isPalindrome(num1));

    }
}
