package Strings;

public class RemoveOutermostParentheses {
    
    public String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')') {
                counter--;
            } 
            if(counter != 0) {
                ans.append(s.charAt(i));
            }
            if(s.charAt(i) == '(') {
                counter++;
            } 
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        String input = "(()())(())";
        String result = solution.removeOuterParentheses(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
