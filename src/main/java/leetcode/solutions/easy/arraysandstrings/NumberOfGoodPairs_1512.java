package leetcode.solutions.easy.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs_1512 {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums = {1,1,1,1};
//        int[] nums = {1,2,3};
        int res = numIdenticalPairs(nums);
        System.out.println(res);
    }

    private static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int ans = 0;

        for (int num: nums) {
            ans += counts.getOrDefault(num, 0);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        return ans;
    }


    // Math formula solution
    public static int numIdenticalPairs2(int[] nums) {
        int count = 0;
        int pairsCount = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            Integer v = entry.getValue();
            if (v > 1) {
                pairsCount = (v * (v - 1)) / 2;
                count = count + pairsCount;
            }
        }
        return count;
    }

    // Brute Force
    public static int numIdenticalPair1(int[] nums) {
        int count = 0;
        for (int i = 0; i<nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
