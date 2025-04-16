package String;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatChar {

    public static Character nonRepeatChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        //count frequency
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String s = "pprrattham";
        Character res = nonRepeatChar(s);

        if (res != null) {
            System.out.println("First non-repeating character: " + res);
        } else {
            System.out.println("No non repeating character found");
        }
    }
}
