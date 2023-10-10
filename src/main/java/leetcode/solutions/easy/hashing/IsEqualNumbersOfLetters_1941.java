package leetcode.solutions.easy.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IsEqualNumbersOfLetters_1941 {
    //    https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
    public static void main(String[] args) {
        String s = "abacbc";
        boolean res = hasEqualsNumberOfLetters(s);
        System.out.println(res);
    }

    private static boolean hasEqualsNumberOfLetters(String s) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charMap.containsKey(currentChar)) {
                charMap.computeIfPresent(currentChar, (key, value) -> value + 1);
            } else {
                charMap.put(currentChar, 1);
            }
        }

        int maxFrequency = 0;
        int minFrequency = Integer.MAX_VALUE;

        for (int frequency : charMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
            minFrequency = Math.min(minFrequency, frequency);
        }

        return maxFrequency == minFrequency;

// Solution with hashSet
//        Set<Integer> frequencies = new HashSet<>(charMap.values());
//        return frequencies.size() == 1;
    }
}
