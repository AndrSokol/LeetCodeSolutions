package leetcode.solutions.medium;

public class MinimumSizeSubarraySum_209 {
    //    https://leetcode.com/problems/minimum-size-subarray-sum/
    public static void main(String[] args) {
//        int[] nums = {2,3,1,2,4,3};
//        int target = 7;
//        int[] nums = {1, 2, 3, 4, 5};
//        int target = 11;
//        int[] nums = {1,4,4};
//        int target = 4;
        int[] nums = {5,1,3,5,10,7,4,9,2,8};
        int target = 15;
        int res = getMinLength(nums, target);
        System.out.println(res);
    }

    private static int getMinLength(int[] nums, int target) {
        int currSum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) { // right =
            currSum += nums[right]; //

            while (currSum >= target) {
                minLength = Math.min(minLength, right - left + 1);

                currSum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }


//    private static int getMinLength(int[] nums, int target) {
//        int minLength = 0;
//        int currMin = 0;
//        int currSum = 0;
//        int subArrSum = 0;
//        int left = 0;
//
//        for (int right = 0; right < nums.length; right++) { //
//            currSum += nums[right]; //
//
//            if (currSum >= target) { //
//                currMin = right - left + 1;  //
//                subArrSum = currSum;
//            }
//
//            while (currSum >= target) { //
//                currSum -= nums[left]; //
//                if (currSum < subArrSum) {
//                    currMin = right - left + 1;
//                }
//                left++; //
//            }
//            minLength = Math.min(currMin, minLength);
//        }
//
//        return minLength;
//    }
}
