package leetcode.algocource.arraysandstrings.prefix;

// https://leetcode.com/problems/running-sum-of-1d-array/description/
public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4};
        int[] nums = {1,1,1,1,1};
        int[] res = runningSum(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    private static int[] runningSum(int[] nums) {
        int[] sumArr = new int[nums.length];
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            sumArr[i] = currSum;
        }
        return sumArr;
    }
}
