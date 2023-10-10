package leetcode.solutions.medium.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfNiceSubarrays_1248 {
    //    https://leetcode.com/problems/count-number-of-nice-subarrays/
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k = 2;
//        int[] nums = {1,1,2,1,1};
//        int k = 3;
        int oddSubNums = getOddSubNums(nums, k);
        System.out.println(oddSubNums);
    }

    private static int getOddSubNums(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int ans = 0;
        int curr = 0;

        for (int num: nums) {
            curr += num % 2;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }

        return ans;
    }

    // Brute force
//    private static int getOddSubNums(int[] nums, int k) {
//        int answer = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            int oddCount = 0;
//            for (int j = i; j < nums.length; j++) {
//                int curr = nums[j]; // 1
//                if (curr % 2 != 0) {
//                    oddCount++;
//                }
//                if (oddCount == k) {
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }
}
