package leetcode.algocource.arraysandstrings.prefix;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
public class MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        int res = minStartValue(nums);
        System.out.println(res);
    }

    private static int minStartValue(int[] nums) {
        int minSumPrefix = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum += nums[i];
            minSumPrefix = Math.min(minSumPrefix, currSum);
        }

        if (minSumPrefix >= 1) {
            return 1;
        } else {
            return Math.abs(minSumPrefix) + 1;
        }
    }

    // Recall BruteForce
    private static int minStartValueBF(int[] nums) {
        int[] sumArr = new int[nums.length];
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            sumArr[i]= currSum;
        }
        Arrays.sort(sumArr);
        if (sumArr[0] < 0) {
            return Math.abs(sumArr[0]) + 1;
        } else {
            return 1;
        }
    }



    private static int minStartValue1(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        prefix[0] = nums[0];

        int minPrefix = prefix[0];
        for (int i = 1; i < length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
            minPrefix = Math.min(minPrefix, prefix[i]);
        }

        if (minPrefix >= 1) {
            return 1;
        }

        return 1 - minPrefix;
    }
}
