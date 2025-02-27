package CodeRush;

import java.util.Scanner;

public class Swapping {
    //without using third variable

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.println("Before Swapping: first = " + first + ", second = " + second);


        // first = first + second;
        // second = first - second;
        // first = first - second;

        //method 2 : 
        // second = first + second - (first = second);

        //method 3 :
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After Swapping: first = " + first + ", second = " + second);
    }
}
