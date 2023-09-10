package leetcode.solutions.easy.hashing;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
        int[] nums = {1,1,3,3,5,5,7,7};
        int res = countElementsPlusOne(nums);
        System.out.println(res);
    }

    // Solution with duplication count
    private static int countElementsPlusOne(int[] arr) {
        int count = 0;
        int duplicationCount = 0;
        Set<Integer> numsSet = new HashSet<>();
        for (int num : arr) {
            if (numsSet.contains(num)){
                duplicationCount++;
            }
            numsSet.add(num);
        }

        System.out.println("Duplication count: " + duplicationCount);

        for (int i = 0; i < arr.length; i++) {
            if (numsSet.contains(arr[i] + 1)) {
                count++;
            }
        }

        return count;
    }
}
