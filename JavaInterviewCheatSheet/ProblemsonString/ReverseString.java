package JavaInterviewCheatSheet.ProblemsonString;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Pratham Tanpure";
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        //System.out.println(sb);

        //using for loop
        for(int i = name.length()-1;i>=0;i--) {
            char ch = name.charAt(i);
            System.out.print(ch);
        }
    }
}
