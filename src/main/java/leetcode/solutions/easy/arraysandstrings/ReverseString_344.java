package leetcode.solutions.easy.arraysandstrings;

// https://leetcode.com/problems/reverse-string/
public class ReverseString_344 {
    public static void main(String[] args) {
//        char[] s = {'h','e','l','l','o'};
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }
    }

    private static void reverseString(char[] s) {
        char temp = ' ';
        for (int i = 0; i < s.length / 2; i++) {
            char curr = s[i];
            char last = s[s.length - 1 - i];
            temp = curr;
            s[i] = last;
            s[s.length - 1 - i] = temp;
        }
    }
}
