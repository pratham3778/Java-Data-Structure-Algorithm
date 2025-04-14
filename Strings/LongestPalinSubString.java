package String;

public class LongestPalinSubString {
    public static String longPalin(String str) {
        //edge case
        if (str.length() <= 1) {
            return str;
        }
        String LPS = "";
        for(int i=1;i<str.length();i++) {
        //consider for odd length
        int low = i;
        int high = i;

        while (str.charAt(low) == str.charAt(high)) {
            low--;
            high++;

            if (low == -1 || high == str.length()) {
                break;
            }
        }

        String Palindrome = str.substring(low+1, high);
        if (Palindrome.length() > LPS.length()) {
            LPS = Palindrome;
        }


        //COnsider for even length
        low = i-1;
        high = i;

        while (str.charAt(low) == str.charAt(high)) {
            low--;
            high++;

            if (low == -1 || high == str.length()) {
                break;
            }
        }

        Palindrome = str.substring(low+1, high);
        if (Palindrome.length() > LPS.length()) {
            LPS = Palindrome;
        }
        }
        return LPS;
    }
    public static void main(String[] args) {
        String str = "bbaba";


        System.out.println(longPalin(str));
    }
}
