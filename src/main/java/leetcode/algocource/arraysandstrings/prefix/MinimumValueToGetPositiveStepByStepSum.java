package leetcode.algocource.arraysandstrings.prefix;

public class MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int res = minValueToGetSumsPositive(nums);
        System.out.println(res);
    }

    private static int minValueToGetSumsPositive(int[] nums) {
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
