package leetcode.algocource.arraysandstrings.slidingwindow;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
//        int[] nums = {1, 1, 1};
//        int k = 1;
//        int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
//        int k = 19;
        int res = subArrProduct(nums, k);
        System.out.println(res);
    }

    private static int subArrProduct(int[] nums, int k) {

        if (k == 0 || k == 1) {
            return 0;
        }

        int left = 0;
        int subProduct = 1;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {
            subProduct *= nums[right];

            while (subProduct >= k) {
                subProduct /= nums[left];
                left++;
            }
            answer += right - left + 1;

        }

        return answer;
    }


//    private static int subArrProduct(int[] nums, int k) {
//
//        if (k == 0 || k == 1) {
//            return 0;
//        }
//
//        int left = 0;
//        int subProduct;
//        int answer = 0;
//
//        for (int right = 0; right < nums.length; right++) {
//            if (nums[right] < k) {
//                answer++;
//            }
//            if (left != right) {
//                subProduct = productSubArray(left, right, nums);
//                while (subProduct >= k) {
//                    left++;
//                    subProduct = productSubArray(left, right, nums);
//                }
//                answer++;
//            }
//            while (left + 1 < right && right == nums.length - 1) {
//                answer++;
//                left++;
//            }
//        }
//
//        return answer;
//    }
//
//    private static int productSubArray(int left, int right, int[] nums) {
//        int product = 1;
//        for (int i = left; i < right; i++) {
//            product *= nums[i];
//        }
//        return product;
//    }
}
