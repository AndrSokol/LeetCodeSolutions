package leetcode.solutions.easy.math;

// https://leetcode.com/problems/palindrome-number/
public class PalindromNumber_9 {
    public static void main(String[] args) {
//        int num = 121;
        int num = 10;
        boolean res = isPalindrome(num);
        System.out.println(res);
    }

    private static boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();

        return numStr.equals(reversedNumStr);
    }
}
