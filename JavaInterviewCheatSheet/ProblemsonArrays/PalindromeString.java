package JavaInterviewCheatSheet;

public class PalindromeString {
    public static boolean isPalin(String name) {
        int left = 0;
        int right = name.length()-1;

        while (left < right) {
            if (name.charAt(left) != name.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        String name = "raercar";
        isPalin(name);
        if (isPalin(name)) {
            System.out.println(name + " is a plaindrome string");
        } else {
            System.out.println(name + " is not plaindrome string");
        }
    }
}
