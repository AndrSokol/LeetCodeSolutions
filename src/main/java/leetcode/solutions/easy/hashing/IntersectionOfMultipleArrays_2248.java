package leetcode.solutions.easy.hashing;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfMultipleArrays_2248 {
    //    https://leetcode.com/problems/intersection-of-multiple-arrays/
    public static void main(String[] args) {
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
//        int[][] nums = {{1,2,3}, {4, 5, 3}};
        List<Integer> intersections = findIntersections(nums);
        System.out.println(intersections);
    }

    private static List<Integer> findIntersections(int[][] nums) {
        int numsLength = nums.length;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numsLength; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int currentNum = nums[i][j];
                if (frequencyMap.containsKey(currentNum)) {
                    frequencyMap.computeIfPresent(currentNum, (k, v) -> v + 1);
                } else {
                    frequencyMap.put(currentNum, 1);
                }
            }
        }

        frequencyMap.forEach((k, v) -> {
            if (v == numsLength) {
                result.add(k);
            }
        });
        result.sort((n1, n2) -> n1.compareTo(n2)); // ASC
//        result.sort((n1, n2) -> n2.compareTo(n1)); // DESC
        return result;
    }
}
