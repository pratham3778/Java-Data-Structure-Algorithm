package JavaInterviewCheatSheet.ProbemsonNumber;

public class AllPalinNum {
    static boolean palin(int n) {
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev*10+digit;
            temp = temp/10;
        }

        if (n == rev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 50;

        for(int i = min;i<=max;i++) {
            if (palin(i)) {
                System.out.print(i+ " ");
            }
        }


    }
}
