package CodeRush;

public class PrimeNum {
    public static boolean num(int n) {
        if (n <= 1) { //29(false)
            return false;
        }

        for(int i=2;i <= Math.sqrt(n);i++) { //(29) = 5.39
            if (n % i == 0) { //29 % 2 = 1, 29 % 3 = 2, 29 % 4 = 1, 29 % 5 = 4(loop end)
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 2;

        System.out.println(n+" isPrime? :  "+num(n));
    }
}
