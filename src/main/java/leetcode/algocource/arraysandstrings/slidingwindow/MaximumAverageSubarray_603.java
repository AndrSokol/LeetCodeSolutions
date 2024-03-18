package leetcode.algocource.arraysandstrings.slidingwindow;

// https://leetcode.com/problems/maximum-average-subarray-i/
public class MaximumAverageSubarray_603 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double res = findAverageInSubArrLengthK(nums, k);
        System.out.println(res);
    }

    //Recall
    private static double findAverageInSubArrLengthK(int[] nums, int k) {
        double currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        double maxSum = currSum;

        for (int right = k; right < nums.length; right++) {
            currSum += nums[right] - nums[right - k];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum / k;
    }


    private static double findAverageInSubArrLengthK2(int[] nums, int k) {
        double currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }

        double maxSum = currSum;
        for (int right = k; right < nums.length; right++) {
            currSum += nums[right] - nums[right - k];
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum / k;
    }

//    private static double findAverageInSubArrLengthK(int[] nums, int k) {
//        double currAvg = findAvg(0, k - 1, k, nums);
//        double maxAvg = currAvg;
//        int left = 1;
//        for (int right = k; right < nums.length; right++) {
//            currAvg = findAvg(left, right, k, nums);
//            maxAvg = Math.max(currAvg, maxAvg);
//            left++;
//        }
//
//        return maxAvg;
//    }
//
//    private static double findAvg(int left, int right, int k, int[] nums) {
//        double currSum = 0;
//        for (int i = left; i <= right; i++) {
//            currSum += nums[i];
//        }
//        return currSum / k;
//    }
}
