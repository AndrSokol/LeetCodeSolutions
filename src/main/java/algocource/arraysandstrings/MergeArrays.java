package algocource.arraysandstrings;

import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 7, 20};
        int[] nums2 = {3, 4, 6};

        int[] mergedArr = mergeSortedArrays(nums1, nums2);
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }

    private static int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int pointer1 = 0;
        int pointer2 = 0;

        List<Integer> resList = new ArrayList<>();

        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            if (nums1[pointer1] < nums2[pointer2]) {
                resList.add(nums1[pointer1]);
                pointer1++;
            } else {
                resList.add(nums2[pointer2]);
                pointer2++;
            }
        }

        while (pointer1 < nums1.length) {
            resList.add(nums1[pointer1]);
            pointer1++;
        }

        while (pointer2 < nums2.length) {
            resList.add(nums1[pointer2]);
            pointer2++;
        }

        int[] array = resList.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }


}
