package leetcode.solutions.medium.hashing;

import java.util.*;

public class GroupAnagrams_49 {
    //    https://leetcode.com/problems/group-anagrams/
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> groupedWords = getGroupedWords(strs);
        System.out.println(groupedWords);
    }

    private static List<List<String>> getGroupedWords(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);

            String key = new String(charArr);

            if (!strMap.containsKey(key)) {
                strMap.put(key, new ArrayList<>());
            }

            strMap.get(key).add(str);
        }

        return new ArrayList<>(strMap.values());
    }
}
