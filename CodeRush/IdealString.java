package CodeRush;

// Find the return minimum number of removals to achieve ideal string
// Input : XYXXYXXY
// output : 2

public class IdealString {
    public static int minRemoval(String input) {
        int removal = 0;

        for(int i=1;i<input.length();i++) {
            if(input.charAt(i) == input.charAt(i-1)) {
                removal++;
            }
        }
        return removal;
    }
    public static void main(String[] args) {
        String input = "XYXXYXXY";
        System.out.println("Minimum Removals: " + minRemoval(input));
    }
}
