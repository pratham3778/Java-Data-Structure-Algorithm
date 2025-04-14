package String;

public class LengthWOInbuiltFunc {
    public static void main(String[] args) {
        String input = "Pratham";

        //approch 1 :  convert to charArray and use func length
        int counter1;
        counter1 = input.toCharArray().length;
        System.out.println("Length of String: " + counter1);

        //approch 2 : use last index method of string class
        int counter2;
        counter2 = input.lastIndexOf("");
        System.out.println("Length of String: " + counter2);

        //approch 3 : java stream
        long counter3;
        counter3 = input.chars().count();
        System.out.println("Length of String: " + counter3);

        //approch 4 : using for each loop on char array
        int counter4 = 0;
        char[] arr  = input.toCharArray();
        for(char s : arr) {
            counter4++;
        }
        System.out.println("Length of String: " + counter4);        
    }
}
