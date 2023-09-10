package leetcode.algocource.arraysandstrings.prefix;

public class SumOfIndexesTrueFalse {
//    For example, given nums = [1, 6, 3, 2, 7, 2], queries = [[0, 3], [2, 5], [2, 4]], and limit = 13,
//    the answer is [true, false, true]. For each query, the subarray sums are [12, 14, 12]

    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 2, 7, 2};
        int[][] queries = {{0, 3}, {2, 5}, {2, 4}};
        int limit = 13;

        boolean[] res = getResults(nums, queries, limit);
        for (boolean r : res) {
            System.out.println(r);
        }
    }

    private static boolean[] getResults(int[] nums, int[][] queries, int limit) {
        boolean[] results = new boolean[queries.length];
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int sum = prefix[y] - prefix[x] + nums[x];
            results[i] = sum < limit;
        }

        return results;
    }
}
