package String;
// Java program to convert "AkShAy" to "aKsHaY"
public class ConvertLCtoUP {
    public static void main(String[] args) {
        String s = "AkShAy";
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }

        System.out.println("Converted String: " + sb.toString());
    }
}
