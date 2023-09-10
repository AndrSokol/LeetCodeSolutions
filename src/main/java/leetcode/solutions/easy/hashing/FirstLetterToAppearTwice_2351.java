package leetcode.solutions.easy.hashing;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice_2351 {
//    https://leetcode.com/problems/first-letter-to-appear-twice/

    public static void main(String[] args) {
        String str = "abcdd";
        char duplicatedChar = getFirstDuplicatedChar(str);
        System.out.println(duplicatedChar);
    }

    private static char getFirstDuplicatedChar(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charSet.contains(currentChar)) {
                return currentChar;
            }
            charSet.add(currentChar);
        }
        return ' ';
    }
}
