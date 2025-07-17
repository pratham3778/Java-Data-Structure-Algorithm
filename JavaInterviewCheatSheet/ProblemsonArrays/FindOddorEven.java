package JavaInterviewCheatSheet;

public class FindOddorEven {

    public static void find(int num) {
        if(num % 2 == 0) {
            System.out.println(num + " is a even number");
        } else {
            System.out.println(num + " is a odd number");
        }
    }
    
    public static void main(String[] args) {
        int num = 0;
        find(num);
    }
}
