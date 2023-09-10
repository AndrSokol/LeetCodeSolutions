package leetcode.algocource.arraysandstrings.slidingwindow;

public class SumOfASubArrWithLengthK {
    public static void main(String[] args) {
        int[] arr = {3, -1, 4, 12, -8, 5, 6};
        int k = 4;
//        answer 18
        int res = findMaxSumWithLengthOfSubArrK(arr, k);
        System.out.println(res);
    }



    private static int findMaxSumWithLengthOfSubArrK(int[] arr, int k) {

        int curr = 0;

        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }

        int maxSum = curr;
        for (int right = k; right < arr.length; right++) {
            curr += arr[right] - arr[right - k];
            maxSum = Math.max(maxSum, curr);
        }

        return maxSum;
    }
    //    my
//    private static int findMaxSumWithLengthOfSubArrK(int[] arr, int k) {
//        int maxSum = 0;
//        int left = 0;
//        int sum = 0;
//        int answer = 0;
//
//        for (int right = k - 1; right < arr.length; right++) {
//            sum = calculateSum(left, right, arr);
//
//            if (right - left > k - 1) {
//                left++;
//                int currSum = calculateSum(left, right, arr);
//                if (currSum > sum) {
//                    maxSum = currSum;
//                }
//            }
//
//            answer = Math.max(sum, maxSum);
//
//        }
//
//        return answer;
//    }
//
//    private static int calculateSum(int left, int right, int[] arr) {
//        int sum = 0;
//        for (int i = left; i <= right; i++) {
//            sum += arr[i];
//        }
//
//        return sum;
//    }
}
