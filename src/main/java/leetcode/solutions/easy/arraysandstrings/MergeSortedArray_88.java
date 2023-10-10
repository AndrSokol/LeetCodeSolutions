package leetcode.solutions.easy.arraysandstrings;

import java.util.Arrays;

public class MergeSortedArray_88 {
    //    https://leetcode.com/problems/merge-sorted-array/
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

//        int[] nums1 = {2, 0};
//        int[] nums2 = {1};
//        int m = 1;
//        int n = 1;

        mergeNums(nums1, nums2, m, n);
        for (int mergedNum : nums1) {
            System.out.println(mergedNum);
        }
    }

    private static void mergeNums(int[] nums1, int[] nums2, int m, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - n];
        }
        Arrays.sort(nums1);
    }

    private static void mergeNums1(int[] nums1, int[] nums2, int m, int n) {
        int temp = 0;
        int nums1Idx = 0;
        int nums2Idx = 0;

        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }

        while (nums1Idx < m + n && (m > 0 && n > 0)) {
            int curr1 = nums1[nums1Idx];

            if (nums2Idx < n) {
                int curr2 = nums2[nums2Idx];

                if (temp != 0) {
                    if (temp <= curr2) {
                        nums1[nums1Idx] = temp;
                        nums1Idx++;
                        temp = 0;
                    } else {
                        nums1[nums1Idx] = curr2;
                        nums2Idx++;
                    }
                }

                if (curr1 <= curr2 && curr1 != 0) {
                    nums1Idx++;
                } else {
                    if (curr1 != 0) {
                        temp = curr1;
                    }
                    nums1[nums1Idx] = curr2;
                    nums2Idx++;
                    nums1Idx++;
                }
            }
        }
    }
}
