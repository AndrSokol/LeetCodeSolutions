package leetcode.solutions.easy.stack;

import java.util.Stack;

public class RemoveDuplicatesInString_1047 {
//    https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
    public String removeDuplicates(String s) {
        if (s == null) {
            return "";
        }

        Stack<Character> charStack = new Stack<>();
        charStack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!charStack.isEmpty() && charStack.peek() == curr){
                charStack.pop();
            } else {
                charStack.push(curr);
            }
        }

        StringBuilder resBuilder = new StringBuilder();

        while (!charStack.isEmpty()) {
            resBuilder.append(charStack.pop());
        }

        return resBuilder.reverse().toString();
    }
}
