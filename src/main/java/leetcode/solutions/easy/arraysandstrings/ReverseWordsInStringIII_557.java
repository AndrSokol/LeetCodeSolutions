package leetcode.solutions.easy.arraysandstrings;


public class ReverseWordsInStringIII_557 {
    // Two pointers
    //    https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
//        String str = "God Ding";
        String res = reverseWords(str);
        System.out.println(res);
    }


    private static String reverseWords(String s) {
        StringBuilder resStrBuilder = new StringBuilder();

        int left = 0;
        int startNewWordIdx = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == ' ') {
                while (right > left) {
                    resStrBuilder.append(s.charAt(right - 1 - left + startNewWordIdx));
                    left++;
                }
                resStrBuilder.append(s.charAt(right));
                left++;
                startNewWordIdx = left;
            }
        }

        while (left < s.length()) {
            resStrBuilder.append(s.charAt(s.length() - 1 - left + startNewWordIdx));
            left++;
        }

        return resStrBuilder.toString();
    }
}
