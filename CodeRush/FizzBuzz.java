package CodeRush;

import java.util.*;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        // If-Else
        /*List<String> ans = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(i%3 ==0 && i%5==0) {
                ans.add("FizzBuzz");
            }
            else if(i%3==0) {
                ans.add("Fizz");
            }
            else if(i%5==0) {
                ans.add("Buzz");
            }
            else {
                ans.add(Integer.toString(i));
            }
        }
        return ans;*/

        //Ternary Operator
        List<String> ans = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            ans.add(
                i % 15 == 0 ? "FizzBuzz" :
                i % 5 == 0  ? "Buzz" :
                i % 3 == 0  ? "Fizz" :
                String.valueOf(i)
            );
        }

        return ans;
    }

    public static void main(String[] args) {
        FizzBuzz ans = new FizzBuzz();

        int n1 = 15;
        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + ans.fizzBuzz(n1));

        int n2 = 5;
        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + ans.fizzBuzz(n2));

    }
}
