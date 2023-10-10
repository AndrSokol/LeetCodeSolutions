package leetcode.algocource.hashing;

import java.util.*;

public class FindNPlusMinusOne {
//    Given an integer array nums, find all the numbers x in nums that satisfy the following:
//    x + 1 is not in nums, and x - 1 is not in nums

    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 5, 9, 10, 1};
        Integer[] resArr = findPlusMinusXElements(nums);
        for (int j : resArr) {
            System.out.println(j);
        }
    }

    private static Integer[] findPlusMinusXElements(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            numsSet.add(nums[i]);
        }

        List<Integer> resList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int elementPlusOne = nums[i] + 1;
            int elementMinusOne = nums[i] - 1;

            if (!numsSet.contains(elementPlusOne) && !numsSet.contains(elementMinusOne)) {
                resList.add(nums[i]);
            }
        }

        return resList.toArray(new Integer[0]);
    }
}
