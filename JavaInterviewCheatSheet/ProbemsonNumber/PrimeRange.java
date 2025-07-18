package JavaInterviewCheatSheet.ProbemsonNumber;

public class PrimeRange {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } 

        if (num == 2) {
            return true;
        }

        for(int i=2;i<=Math.sqrt(num);i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

    static void printPrime(int start, int end){
        for(int i=start;i<=end;i++) {
            if (isPrime(i)) {
                System.out.print(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        int start = 2;
        int end = 10;

        printPrime(start, end);
    }
}
