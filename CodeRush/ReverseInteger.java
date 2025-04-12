package CodeRush;

// Input: x = 123
// Output: 321
// TC : 0(log10 n)
// SC : 0(1)

public class ReverseInteger {
    public static int rev(int x) {
        int result = 0;

        while (x != 0) { //x=0
            int rem = x % 10; 
            //123%10=3, 12%10=2, 1%10=1 
            int temp = (result * 10) + rem; 
            //(0*10)+3=3, (3*10)+2=32, (32*10)+1=321

            if((temp - rem) / 10 != result) { 
                //(3-3)/10 = 0, (32-2)/10=3, (321-1)/10=32
                return 0;
            }

            x = x/10; // 123/10 = 12, 12/10=1, 1/10=0
            result = temp; //321
        }
        return result; //321
    }
    public static void main(String[] args) {
        int x = 123;

        System.out.println("Result is: " + rev(x));
    }    
}
