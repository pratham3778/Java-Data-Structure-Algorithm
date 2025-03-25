package CodeRush;

// Find the return minimum number of removals and also ideal string
// Input : XYXXYXXY
// output : 2

public class IdealString {
    public static String minRemoval(String input) {
        StringBuilder sb = new StringBuilder();
        int removal = 0;

        sb.append(input.charAt(0));

        for(int i=1;i<input.length();i++) {
            if(input.charAt(i) != input.charAt(i-1)) {
                sb.append(input.charAt(i));
            } else {
                removal++;
            }
        }
        System.out.println("Minimum Removals: " + removal);
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "XYXXYXXY";
        System.out.println("Ideal String: " + minRemoval(input));
    }
}
