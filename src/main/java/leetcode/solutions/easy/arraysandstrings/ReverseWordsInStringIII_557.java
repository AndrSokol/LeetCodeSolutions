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

    // Recall
    private static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        char first, last;
        for (int i = 0; i < words.length; i++) {
            char[] newWord = new char[words[i].length()];

            for (int j = 0; j <= newWord.length / 2; j++) {
                first = words[i].charAt(j);
                last = words[i].charAt(newWord.length - 1 - j);
                newWord[j] = last;
                newWord[newWord.length - 1 - j] = first;
            }
            sb.append(newWord).append(" ");
        }
        return sb.toString().trim();
    }

    private static String reverseWords2(String s) {
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
