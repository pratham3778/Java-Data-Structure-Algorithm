package Recursion;

public class PrintNTimes {
    public static void f(int i, int n) {
        if (i > n) {
            return;
        }

        System.err.println("Pratham");
        f(i+1, n);
    }
    public static void main(String[] args) {
        int n = 3;
        f(1, n);
    }
}
