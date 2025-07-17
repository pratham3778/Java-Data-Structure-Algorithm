package JavaInterviewCheatSheet.ProblemsonString;

public class LengthString {
    public static void main(String[] args) {
        String name = "Pratham";
        int count = 0;

        char[] ch = name.toCharArray();

        for(char s:ch) {
            count++;
        }

        //System.out.println(count);


        int counter2 = (int) name.chars().count();
        //System.out.println(counter2);

        int counter3 = 0;
        counter3 = name.lastIndexOf("");
        System.out.println(counter3);
    }
}
