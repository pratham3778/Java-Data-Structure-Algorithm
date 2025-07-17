package JavaInterviewCheatSheet;

public class PrimeNum {
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }

        for(int i = 2; i<=Math.sqrt(num);i++) {
            if (num % 2 == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int num = 2;
        System.out.println(isPrime(num));

    }
}
