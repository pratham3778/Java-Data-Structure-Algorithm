package JavaInterviewCheatSheet.ProbemsonNumber;

public class Prime {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        if (num == 2) {
            return true;
        }

        for(int i=2;i<=Math.sqrt(num);i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 1438;

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is Not a Prime Number.");
        }
    }
}
