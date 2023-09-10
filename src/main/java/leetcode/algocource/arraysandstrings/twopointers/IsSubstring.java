package leetcode.algocource.arraysandstrings.twopointers;

public class IsSubstring {
    public static void main(String[] args) {
        String str = "abcde";
        String substr = "ace";

        System.out.println(isSubsequence(str, substr));
    }

    private static boolean isSubsequence(String str, String substr) {
        int pointerStr = 0;
        int pointerSubStr = 0;

        StringBuilder newStr = new StringBuilder();

        while(pointerStr < str.length()) {
            if (str.charAt(pointerStr) == substr.charAt(pointerSubStr)) {
                newStr.append(str.charAt(pointerStr));
                pointerStr++;
                pointerSubStr++;
            } else {
                pointerStr++;
            }
        }

        // It could work without StringBuilder:
//        return pointerSubStr == substr.length();
        return substr.contentEquals(newStr);
    }


}
