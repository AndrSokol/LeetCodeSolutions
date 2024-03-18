package leetcode.solutions.easy.arraysandstrings;

public class SplitStringInBalancedString_1221 {
    public static void main(String[] args) {
        String input = "RLRRLLRLRL";
//        String input = "RLRRRLLRLL";
//        String input = "LLLLRRRR";
        int res = balancedStringSplit(input);
        System.out.println(res);
    }

    private static int balancedStringSplit(String input) {
        int balanceCounter = 0;
        int resCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'L') {
                balanceCounter++;
            } else {
                balanceCounter--;
            }
            if (balanceCounter == 0) {
                resCounter++;
            }
        }
        return resCounter;
    }

    public static int balancedStringSplit1(String s) {
        int countL = 0;
        int countR = 0;
        int balancedCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == 'L') {
                countL++;
            } else if (curr == 'R') {
                countR++;
            } else {
                throw new IllegalArgumentException("Must contain L or R");
            }

            if (countL == countR) {
                balancedCount++;
                countL = 0;
                countR = 0;
            }
        }
        return balancedCount;
    }
}
