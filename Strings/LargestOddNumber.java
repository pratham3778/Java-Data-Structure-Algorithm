package Strings;

public class LargestOddNumber {  
    public String largestOddNumber(String num) {
        int len = num.length() - 1;  // Step 1: Get the last index of the string

        while (len >= 0) {  // Step 2: Iterate from right to left
            int digit = num.charAt(len) - '0';  // Step 3: Convert the character to an integer
            if (digit % 2 != 0) {  // Step 4: Check if the digit is odd
                return num.substring(0, len + 1);  // Step 5: Return substring if an odd digit is found
            }
            len--;  // Step 6: Move to the previous digit
        }
        return "";  // Step 7: Return empty string if no odd digit is found
    }

    public static void main(String[] args) {
        LargestOddNumber s = new LargestOddNumber();
        
        String num1 = "35426";
        System.out.println("Largest Odd Number in " + num1 + " is: " + s.largestOddNumber(num1));
    }
}
