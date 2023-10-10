package leetcode.algocource.arraysandstrings;

public class LongestCommonPrefix_14 {
    //    https://leetcode.com/problems/longest-common-prefix/
    public static void main(String[] args) {
        String[] strArr = {"flower", "flow", "flight"};
//        String[] strArr = {"", ""};
//        String[] strArr = {"abab","aba",""};
//        String[] strArr = {"aaa","aa","aaa"};
//        String[] strArr = {"a","b"};
//        String[] strArr = {"dog","racecar","car"};
        String commonPrefix = findCommonPrefix(strArr);
        System.out.println(commonPrefix);
    }

    private static String findCommonPrefix(String[] strs) {
        String prefixBuilder = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            boolean hasNotCommonPrefix = true;
            while (hasNotCommonPrefix) {
                if (!current.startsWith(prefixBuilder)) {
                    prefixBuilder = prefixBuilder.substring(0, prefixBuilder.length() - 1);
                } else {
                    hasNotCommonPrefix = false;
                }
            }
        }
        return prefixBuilder;
    }
    // First
    private static String findCommonPrefix2(String[] strs) {
        StringBuilder prefixBuilder = new StringBuilder();
        prefixBuilder.append(strs[0]);
        if (prefixBuilder.isEmpty()) {
            return "";
        }
        for (int i = 1; i < strs.length; i++) {
            String curr = strs[i];
            if (curr.isEmpty()) {
                return "";
            }
            for (int j = 0; j < curr.length(); j++) {
                if (prefixBuilder.length() - 1 >= j && curr.charAt(j) != prefixBuilder.charAt(j)) {
                    String currPrefix = prefixBuilder.substring(0, j);
                    prefixBuilder = new StringBuilder(currPrefix);
                    break;
                }
                if (j == curr.length() - 1) {
                    if (curr.length() < prefixBuilder.length() ) {
                        prefixBuilder = new StringBuilder(curr);
                    }
                    break;
                }
            }
        }

        return prefixBuilder.toString();
    }
}
