package com.easy.twosum;

public class TwoSum {

    // https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum(nums, target);
        printRes(res);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if ((nums[i] + nums[j]) == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }

        return res;
    }

    public static void printRes(int[] arr) {
        System.out.print("[");
        for (int el : arr) {
            System.out.print(el + ", ");
        }
        System.out.print("]");
    }

}
