package leetcode.algocource.arraysandstrings.prefix;

import java.util.Arrays;

public class NumberOfWaysToSplitArray_2270 {
    //    https://leetcode.com/problems/number-of-ways-to-split-array/
//    Input: nums = [10,4,-8,7]
//    Output: 2
    public static void main(String[] args) {
        int[] nums = {2,3,1,0};
//        int[] nums = {10,4,-8,7};
        int res = numsOfSplitsWithoutArray(nums);
//        int res = numsOfSplitsWithArray(nums);
        System.out.println(res);
    }

    private static int numsOfSplitsWithoutArray(int[] nums) {
        int length = nums.length;
        int res = 0;
        long total = Arrays.stream(nums).asLongStream().sum();

        long leftSum = 0;
        for (int i = 0; i < length - 1; i++) {
            leftSum += nums[i];
            long rightSum = total - leftSum;
            if (leftSum >= rightSum) {
                res++;
            }
        }

        return res;
    }

//    private static int numsOfSplitsWithArray(int[] nums) {
//        int length = nums.length;
//
//        int res = 0;
//        long[] prefix = new long[length];
//        prefix[0] = nums[0];
//        for (int i = 1; i < length; i++) {
//            prefix[i] = nums[i] + prefix[i - 1];
//        }
//
//        for (int i = 0; i < length - 1; i++) {
//            long leftSum = prefix[i];
//            long rightSum = prefix[length - 1] - prefix[i];
//            if (leftSum >= rightSum) {
//                res++;
//            }
//        }
//
//        return res;
//    }
}
