package algocource.arraysandstrings;

public class SortedSquareArray_977 {

    // https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] resArr = squareAndSort(nums);
        for (int i = 0; i < resArr.length; i++) {
            System.out.print(resArr[i] + " ");
        }
    }

    private static int[] squareAndSort(int[] nums) {
        int pointerL = 0;
        int pointerR = nums.length - 1;

        int[] resArr = new int[nums.length];

        int i = 0;
        while (pointerL <= pointerR) {
            if (Math.abs(nums[pointerL]) > Math.abs(nums[pointerR])) {
                resArr[resArr.length - 1 - i] = nums[pointerL] * nums[pointerL];
                pointerL++;
            } else {
                resArr[resArr.length - 1 - i] = nums[pointerR] * nums[pointerR];
                pointerR--;
            }
            i++;
        }

        return resArr;
        // Brute Force
//        return Arrays.stream(nums)
//                .map(i -> i*i)
//                .sorted().toArray();
    }
}
