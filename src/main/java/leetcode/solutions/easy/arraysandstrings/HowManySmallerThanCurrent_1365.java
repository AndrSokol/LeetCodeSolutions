package leetcode.solutions.easy.arraysandstrings;

import java.util.*;
import java.util.stream.Stream;

public class HowManySmallerThanCurrent_1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] resArr = smallerNumbersThanCurrent(nums);
        for (int num : resArr) {
            System.out.print(num + ",");
        }
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> uniqueNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
                uniqueNums.add(nums[i]);
        }

        List<Integer> sorted = uniqueNums.stream().sorted().toList();
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smallerThen = sorted.indexOf(nums[i]);
            res[i] = smallerThen;
        }

        return res;
    }

    // Brute Force
    private static int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
