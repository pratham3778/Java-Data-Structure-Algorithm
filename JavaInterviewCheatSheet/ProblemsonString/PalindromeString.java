package JavaInterviewCheatSheet.ProblemsonString;

public class PalindromeString {
    static boolean isPalinString(String name) {
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

    //recursion
    static boolean isPlaind(String name, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (name.charAt(left) != name.charAt(right)) {
            return false;
        }

        return isPlaind(name, left+1, right-1);
    }
    public static void main(String[] args) {
        String name = "racecer";

        //System.out.println(isPalinString(name));
        System.out.println(isPlaind(name, 0, name.length()-1));
    }
}
