package String;

public class RevStringByWords {
    public static String reverse(String s) {
        //trim() removes leading/trailing spaces.
        //split("\\s+") splits the string on one or more spaces (to handle multiple spaces).
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1;i>=0;i--) {
            sb.append(words[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";

        System.out.println(reverse(s));
    }
}
