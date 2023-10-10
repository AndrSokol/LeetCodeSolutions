package other.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {6, 2, 8, 9, 6, 15, 1, 7};
        int[] res = sortedNums(nums);
        for (int num : res) {
            System.out.println(num);
        }
    }

    private static int[] sortedNums(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
