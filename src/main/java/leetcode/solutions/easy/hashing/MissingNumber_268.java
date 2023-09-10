package leetcode.solutions.easy.hashing;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber_268 {

//    https://leetcode.com/problems/missing-number/description/
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int missingNum = findMissingNumber(nums);
        System.out.println(missingNum);
    }

    private static int findMissingNumber(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        for (int i = 0; i < nums.length + 1; i++) {
            if (!numsSet.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    // With sorting
//    private static int findMissingNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] - nums[i - 1] > 1) {
//                return nums[i] - 1;
//            }
//        }
//
//        return nums[0] == 0 ? nums[nums.length - 1] + 1 : 0;
//    }


    // Bubble sort
//    private static int[] sortArr(int[] nums) {
//        int temp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (nums[j - 1] > nums[j]) {
//                    temp = nums[j - 1];
//                    nums[j - 1] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//        return nums;
//    }
}
