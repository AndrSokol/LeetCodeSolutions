package leetcode.solutions.medium.hashing;

import java.util.*;

public class FindPlayersWithZeroOrOneLosses_2225 {
    //    https://leetcode.com/problems/find-players-with-zero-or-one-losses/
    public static void main(String[] args) {
//        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        int[][] matches = {{2, 3}, {1, 3}, {5, 4}, {6, 4}};

        System.out.println(findWinners(matches));
    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losesCountMap = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];

            losesCountMap.put(winner, losesCountMap.getOrDefault(winner, 0));
            losesCountMap.put(loser, losesCountMap.getOrDefault(loser, 0) + 1);
        }

        List<Integer> absWinList = new ArrayList<>();
        List<Integer> oneLoseList = new ArrayList<>();

        losesCountMap.keySet().forEach(key -> {
            if (losesCountMap.get(key) == 0) {
                absWinList.add(key);
            }
            if (losesCountMap.get(key) == 1) {
                oneLoseList.add(key);
            }
        });

        return List.of(
                absWinList.stream().sorted().toList(),
                oneLoseList.stream().sorted().toList());
    }

//    public static List<List<Integer>> findWinners(int[][] matches) {
//        Map<Integer, Integer> winFrequencyMap = new HashMap<>();
//        Map<Integer, Integer> loseFrequencyMap = new HashMap<>();
//
//        for (int[] currentPair : matches) {
//            int winner = currentPair[0];
//            int loser = currentPair[1];
//
//            // calculate one lose players
//            if (loseFrequencyMap.containsKey(loser)) {
//                loseFrequencyMap.computeIfPresent(loser, (key, value) -> value + 1);
//            } else {
//                loseFrequencyMap.put(loser, 1);
//            }
//
//            // calculate abs winners
//            if (winFrequencyMap.containsKey(winner)) {
//                winFrequencyMap.computeIfPresent(winner, (key, value) -> value + 1);
//            } else {
//                winFrequencyMap.put(winner, 1);
//            }
//        }
//
//        List<Integer> oneLosePlayerList = loseFrequencyMap.entrySet().stream()
//                .filter(pair -> pair.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .sorted()
//                .toList();
//
//        List<Integer> absWinnersList = winFrequencyMap.keySet().stream()
//                .filter(integer -> loseFrequencyMap.get(integer) == null)
//                .sorted()
//                .toList();
//
//
//        return List.of(absWinnersList, oneLosePlayerList);
//    }

//    public static List<List<Integer>> findWinners(int[][] matches) {
//        Map<Integer, Integer> winFrequencyMap = new HashMap<>();
//        Map<Integer, Integer> loseFrequencyMap = new HashMap<>();
//
//        for (int[] currentPair : matches) {
//            int winner = currentPair[0];
//            int loser = currentPair[1];
//
//            // calculate one lose players
//            if (loseFrequencyMap.containsKey(loser)) {
//                loseFrequencyMap.computeIfPresent(loser, (key, value) -> value + 1);
//            } else {
//                loseFrequencyMap.put(loser, 1);
//            }
//
//            // calculate abs winners
//            if (winFrequencyMap.containsKey(winner)) {
//                winFrequencyMap.computeIfPresent(winner, (key, value) -> value + 1);
//            } else {
//                winFrequencyMap.put(winner, 1);
//            }
//        }
//
//        List<Integer> oneLosePlayerList = loseFrequencyMap.entrySet().stream()
//                .filter(pair -> pair.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .sorted()
//                .toList();
//
//        List<Integer> absWinnersList = winFrequencyMap.keySet().stream()
//                .filter(integer -> loseFrequencyMap.get(integer) == null)
//                .sorted()
//                .toList();
//
//
//        return List.of(absWinnersList, oneLosePlayerList);
//
//    }

}
