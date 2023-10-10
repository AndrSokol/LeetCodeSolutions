package leetcode.solutions.easy.arraysandstrings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray_26 {
    //    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("K is: " + getCountOfUniqueNums(nums));
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static int getCountOfUniqueNums(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int insertIdx = 1;
        int curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = nums[i];

            if (curr > nums[i - 1]) {
                nums[insertIdx] = curr;
                insertIdx++;
            }
        }
        return insertIdx;
    }

    private static int getCountOfUniqueNums1(int[] nums) {
        Set<Integer> uniqueNumsSet = new HashSet<>();
        uniqueNumsSet.add(nums[0]);
        int uniqueIdx = 1;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (!uniqueNumsSet.contains(curr)) {
                uniqueNumsSet.add(curr);
                nums[uniqueIdx] = curr;
                uniqueIdx++;
            }
        }

        return uniqueNumsSet.size();
    }
}
