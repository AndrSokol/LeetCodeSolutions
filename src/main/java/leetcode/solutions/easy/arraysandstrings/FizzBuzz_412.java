package leetcode.solutions.easy.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {
//    https://leetcode.com/problems/fizz-buzz/

    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(15));
    }

    // With String
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String curr = "";
            if (i % 3 == 0) {
                curr += ("Fizz");
            }
            if (i % 5 == 0) {
                curr += ("Buzz");
            }
            if (curr.isEmpty()) {
                curr = String.valueOf(i);
            }
            answer.add(curr);
        }
        return answer;
    }

    // With sb
    public static List<String> fizzBuzz1(int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();;
        for (int i = 1; i <= n; i++) {
            sb.setLength(0);
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.isEmpty()) {
                sb.append(i);
            }
            answer.add(sb.toString());
        }
        return answer;
    }

}
