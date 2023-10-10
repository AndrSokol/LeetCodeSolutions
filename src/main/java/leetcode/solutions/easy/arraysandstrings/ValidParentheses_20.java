package leetcode.solutions.easy.arraysandstrings;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses_20 {
    //    https://leetcode.com/problems/valid-parentheses/
    public static void main(String[] args) {
        String s = "([)])";
        System.out.println(isValidStr(s));
    }

    private static boolean isValidStr(String s) {
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);


            if (!charStack.isEmpty()) {
                if (charStack.peek() == '(' && currentChar == ')') {
                    charStack.pop();
                    continue;
                }
                if (charStack.peek() == '{' && currentChar == '}') {
                    charStack.pop();
                    continue;
                }
                if (charStack.peek() == '[' && currentChar == ']') {
                    charStack.pop();
                    continue;
                }
            }
            charStack.push(currentChar);

        }
        return charStack.isEmpty();
    }
}
