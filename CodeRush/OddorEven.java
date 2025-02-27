package CodeRush;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        if (number % 2 ==0) {
            System.out.println("The number " + number + " is even number");
        } else {
            System.out.println("The number " + number + " is odd number");
        }
    }
}
