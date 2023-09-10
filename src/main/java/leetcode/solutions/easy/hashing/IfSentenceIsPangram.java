package leetcode.solutions.easy.hashing;

import java.util.HashSet;
import java.util.Set;

public class IfSentenceIsPangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
//        String s = "leetcode";
        boolean res = isPangram(s);
        System.out.println(res);
    }

    private static boolean isPangram(String sentence) {
        Set<Character> characterSet = new HashSet<>();
        int engAlphabetLetterCount = 26;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (!characterSet.contains(currentChar)) {
                characterSet.add(currentChar);
                engAlphabetLetterCount--;
                if (engAlphabetLetterCount == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
