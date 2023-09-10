package leetcode.algocource.arraysandstrings.slidingwindow;

public class LongestSubArrayWithOne0 {
    /*
    Let's use an integer curr that tracks the sum of the current window.
    Since the problem wants subarrays whose sum is less than or equal to k,
    we want to maintain curr <= k. Let's look at an example where
    nums = [3, 1, 2, 7, 4, 2, 1, 1, 5] and k = 8.
     */

    public static void main(String[] args) {
//        String binaryStr = "1101100111";
        String binaryStr = "11001011";
        int res = findLengthOfLongest1WithOne0(binaryStr);
        System.out.println(res);
    }

    private static int findLengthOfLongest1WithOne0(String binaryStr) {
        int left = 0;
        int zeroCount = 0;
        int answer = 0;

        for (int right = 0; right < binaryStr.length(); right++) {
            if (binaryStr.charAt(right) == '0') {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (binaryStr.charAt(left) == '0') {
                    zeroCount--;
                }
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
