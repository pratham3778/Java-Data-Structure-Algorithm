package CodeRush;

public class Fibonacci { 
    public static void main(String[] args) {
        int num = 6;


        int first = 0;
        int second = 1;
        int next;
        System.out.print("Fibonacci series is : ");
        for(int i=0;i<=num;i++) {
            System.out.print(first + " ");
            next = second + first;
            first = second;
            second = next;
        }
    }
}
