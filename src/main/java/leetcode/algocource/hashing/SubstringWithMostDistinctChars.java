package leetcode.algocource.hashing;

import java.util.*;

public class SubstringWithMostDistinctChars {
//    Example 1: You are given a string s and an integer k. Find the length of the longest substring that contains at most k distinct characters.
//
//    For example, given s = "eceba" and k = 2, return 3. The longest substring with at most 2 distinct characters is "ece"

    public static void main(String[] args) {
//        String s = "eceba";
        String s = "ecebaqaaallllaayue";
        int k = 2;
        int res = getSubstringWithMostDistinctChars(s, k);
        System.out.println(res);
    }

    private static int getSubstringWithMostDistinctChars(String s, int k) {
        int maxLength = 0;
        int currLength = 0;
        int left = 0;
        Map<Character, Integer> charMap = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

//            charMap.put(currentChar, charMap.getOrDefault(currentChar, 0) + 1);
            if (charMap.containsKey(currentChar)) {
//                charMap.put(currentChar, charMap.get(currentChar) + 1);
                charMap.computeIfPresent(currentChar, (key, value) -> value + 1);
            } else {
                charMap.put(currentChar, 1);
            }

            currLength++;

            while (charMap.size() > k) {
                char leftBorderChar = s.charAt(left);
                Integer value = charMap.get(leftBorderChar);
                if (value > 1) {
                    charMap.computeIfPresent(currentChar, (key, val) -> val - 1);
                } else {
                    charMap.remove(leftBorderChar);
                }
                left++;
                currLength--;
            }

            maxLength = Math.max(maxLength, currLength);
        }

        return maxLength;
    }

//    private static int getSubstringWithMostDistinctChars(String s, int k) {
//        int maxLength = 0;  //
//        int currLength = 0; //
//        int left = 0; //
//        Set<Character> charSet = new HashSet<>(); //
//
//        for (int right = 0; right < s.length(); right++) { // i = 3
//            char currChar = s.charAt(right);  // b
//            charSet.add(currChar); // c, e, b
//            currLength++; // 4
//
//            while (charSet.size() > k) { // size = 3, condition = t
//                left++; // 1
//                charSet.remove(currChar); //
//                currLength--;
//            }
//
//            maxLength = Math.max(maxLength, currLength); // 3
//        }
//
//        return maxLength;
//    }
}
