package leetcode.algocource.stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.println(stack.contains(2)); // true
        System.out.println(stack.peek()); // 3
        System.out.println(stack.pop()); // get 3 and remove
        System.out.println(stack.peek()); // 2
        System.out.println(stack.empty()); // false
    }
}
