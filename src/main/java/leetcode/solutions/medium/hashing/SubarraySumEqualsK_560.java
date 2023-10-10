package leetcode.solutions.medium.hashing;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK_560 {
    //    https://leetcode.com/problems/subarray-sum-equals-k/
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
//        int[] nums = {-1,-1,1};
//        int k = 0;
//        int[] nums = {1, 2, 1, 2, 1}; // 4
//        int k = 3;
//        int[] nums = {-2, 1, 2, -2, 5, -2, 1}; //
//        int k = 3;
        int countSumEqK = countSum(nums, k);
        System.out.println(countSumEqK);
    }


    private static int countSum(int[] nums, int k) {
        int answer = 0;
        int sum = 0;
        Map<Integer, Integer> prefixMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (prefixMap.containsKey(sum - k)){
                answer++;
            }
            prefixMap.put(sum, prefixMap.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }

//    private static int countSum(int[] nums, int k) {
//        Map<Integer, Integer> countMap = new HashMap<>();
//        countMap.put(0, 1);
//        int prefixSum = 0;
//        int answer = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            prefixSum +=nums[i];
//            answer += countMap.getOrDefault(prefixSum - k, 0);
//            countMap.put(prefixSum, countMap.getOrDefault(prefixSum, 0) + 1);
//        }
//
//        return answer;
//    }

    // Brute force
//    private static int countSum(int[] nums, int k) {
//        int answer = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int total = 0;
//            for (int j = i; j < nums.length; j++) {
//                total += nums[j];
//                if (total == k) {
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }
}

