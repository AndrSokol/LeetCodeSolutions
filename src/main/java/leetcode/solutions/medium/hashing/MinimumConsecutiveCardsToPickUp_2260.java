package leetcode.solutions.medium.hashing;

import java.util.HashMap;
import java.util.Map;

public class MinimumConsecutiveCardsToPickUp_2260 {
    public static void main(String[] args) {
        // Input: cards = [3,4,2,3,4,7]
        // Output: 4

//        int[] cards = {3,4,2,3,4,7}; // Output: 4
        int[] cards = {1,0,5,3}; // Output: -1
        System.out.println(getShorterDuplicateLength(cards));
    }

// [3, 0], [4, 1], [2, 2], [1, 3],

    private static int getShorterDuplicateLength(int[] cards) {
        Map<Integer,Integer> numsMap = new HashMap<>();
        int distance = Integer.MAX_VALUE;

        for (int right = 0; right < cards.length; right++) {
            int curr = cards[right];

            if (numsMap.containsKey(curr)) {
                int prevIdx = numsMap.get(curr);
                distance = Math.min(distance, right - prevIdx + 1);
            }
            numsMap.put(curr, right);

        }

        return distance == Integer.MAX_VALUE ? -1 : distance;
    }
}
