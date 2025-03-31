package Strings;

public class NumberOfSegmentsInString {
    public int countSegments(String s) {
        // Split the string into words using spaces as separators
        String[] words = s.split(" ");
        int count = 0;

        // Count non-empty words
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOfSegmentsInString ans = new NumberOfSegmentsInString();

        String s1 = "Hello, my name is John";
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Output: " + ans.countSegments(s1)); // Expected Output: 5

        String s2 = "   "; 
        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Output: " + ans.countSegments(s2));
    }
}
