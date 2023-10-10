package other.gl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaxUniqueLength {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1, 3, 4, 5, 4, 4};
        System.out.println(findMaxUniqueLength(nums));
    }

    public static int findMaxUniqueLength(int[] nums) {
        int maxUniqueLenght = 0;
        int currentUniqueLenght = 0;
        int left = 0; // 4
        int right;
        Map<Integer, Integer> numsFrequencies = new HashMap<>();

        for(right = 0; right < nums.length; right++) { // right = 6
            int curr = nums[right]; // 4
            numsFrequencies.put(curr, numsFrequencies.getOrDefault(curr, 0) + 1); // [4, 1]
            currentUniqueLenght++; // 1

            while(numsFrequencies.size() > 1) { // false
                int leftNum = nums[left]; // 3
                if (numsFrequencies.get(leftNum) > 1) { // false
                    numsFrequencies.computeIfPresent(curr, (k, v) -> v - 1); //
                } else { // true
                    numsFrequencies.remove(leftNum); //
                }
                left++; // 6
                currentUniqueLenght--; // 1
            }

            maxUniqueLenght = Math.max(maxUniqueLenght, currentUniqueLenght); // 3

        }
        return maxUniqueLenght;

    }
}
