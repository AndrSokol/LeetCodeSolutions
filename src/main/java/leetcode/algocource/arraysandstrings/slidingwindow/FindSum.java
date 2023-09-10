package leetcode.algocource.arraysandstrings.slidingwindow;

public class FindSum {
    /*
    Let's use an integer curr that tracks the sum of the current window.
    Since the problem wants subarrays whose sum is less than or equal to k,
    we want to maintain curr <= k. Let's look at an example where
    nums = [3, 1, 2, 7, 4, 2, 1, 1, 5] and k = 8.
     */

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k = 8;
        int res = findLengthOfSubArr(nums, k);
        System.out.println(res);
    }

    private static int findLengthOfSubArr(int[] nums, int k) {
        int left = 0;
        int subArrSum = 0;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {
            subArrSum += nums[right];

            while(subArrSum > k) {
                subArrSum -= nums[left];
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
