package Strings; 

public class ReverseWordsInString {

    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() > 0) {
                sb.append(words[i]);
                sb.append(' ');
            }
        }
        return sb.substring(0, sb.length() - 1).toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString s = new ReverseWordsInString();
        String input = "  the sky is blue  ";
        String result = s.reverseWords(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
}
