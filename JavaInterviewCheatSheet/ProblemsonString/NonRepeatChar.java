package JavaInterviewCheatSheet.ProblemsonString;

import java.util.*;

public class NonRepeatChar {
    static Character rep(String name) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : name.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : name.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        String name = "Pratham";

        Character res = rep(name);
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("not found");
        }
    }
}
