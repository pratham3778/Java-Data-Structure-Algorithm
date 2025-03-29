package Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replace = t.charAt(i);

            if (!charMap.containsKey(original)) {
                if (!charMap.containsValue(replace)) {
                    charMap.put(original, replace);
                } else {
                    return false;
                }
            } else {
                char chart = charMap.get(original);
                if (chart != replace) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicString ans = new IsomorphicString();

        String s1 = "egg";
        String t1 = "add";
        System.out.println("Is Isomorphic: " + ans.isIsomorphic(s1, t1));

    }
}
