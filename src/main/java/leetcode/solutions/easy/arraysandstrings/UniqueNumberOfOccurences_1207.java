package leetcode.solutions.easy.arraysandstrings;

import java.util.*;

public class UniqueNumberOfOccurences_1207 {
    //    https://leetcode.com/problems/unique-number-of-occurrences/
    public static void main(String[] args) {
//        int[] arr = {1,2,2,1,1,3};
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numsFrequencies = new HashMap<>();

        for(int num : arr) {
            numsFrequencies.put(num, numsFrequencies.getOrDefault(num, 0) + 1);
        }

        Set<Integer> frequencies = new HashSet<>(numsFrequencies.values());

        return frequencies.size() == numsFrequencies.size();
    }
}
