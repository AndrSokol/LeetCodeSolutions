package leetcode.solutions.easy.arraysandstrings;

public class ShortestWordDistance {
    public static void main(String[] args) {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
//        Output: 3
        System.out.println(shortestDistance(wordsDict, word1, word2));
    }

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int first = -1;
        int second = -1;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            String currWord = wordsDict[i];
            if (currWord.equals(word1)) {
                first = i;
            }
            if (currWord.equals(word2)) {
                second = i;
            }
            if (first != -1 && second != -1) {
                if (first > second) {
                    distance = Math.min(distance, first - second);
                } else {
                    distance = Math.min(distance, second - first);
                }
            }
        }
        return distance;
    }
}

