package leetcode.algocource.arraysandstrings.slidingwindow;

public class MaxConsecutiveOnesIII_703 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
//        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
//        int k = 2;
        int res = maxConsecutiveOnes(nums, k);
        System.out.println(res);
    }

    private static int maxConsecutiveOnes(int[] nums, int k) {
        int left = 0;
        int currentResult = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--;
            }
            currentResult++;

            while (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
                currentResult--;
            }

            result = Math.max(result, currentResult);
        }

        return result;
    }
}
