package CodeRush;

import java.util.HashMap;
import java.util.Map;

public class LenOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        LenOfLongestSubString ans = new LenOfLongestSubString();
        
        String[] testCases = {"abcabcbb", "bbbbb", "pwwkew", "", "au", "dvdf"};
        
        for (String test : testCases) {
            System.out.println("Input: " + test + " -> Output: " + ans.lengthOfLongestSubstring(test));
        }
    }
}
