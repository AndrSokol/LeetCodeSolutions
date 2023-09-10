package leetcode.solutions.easy.old.buddystrings;

import java.util.*;

public class BuddyStrings {

    //https://leetcode.com/problems/buddy-strings/

    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd";

        boolean res = checkStrings(a, b);
        System.out.println(res);
    }

       private static boolean checkStrings(String A, String B) {

        if((A.length() != B.length()) || (A.isEmpty() && B.isEmpty())){
            return false;
        }

        Map<Character, Integer> frequency = new HashMap<>();
        if(A.equals(B) && A.length() > 2){
            for (int i = 0; i < A.length(); i++) {
                if(frequency.get(A.charAt(i)) == null){
                    frequency.put(A.charAt(i), 1);
                } else {
                    frequency.put(A.charAt(i), frequency.get(A.charAt(i)) + 1);
                }
            }
            Collection<Integer> values = frequency.values();
            values.removeIf(e -> e == 1);
            if(!values.isEmpty()){
                return true;
            }
        }

        // find first diff
        int di1 = findDiffIdx(A, B, 0);
        if(di1 == -1){
            StringBuilder sb = new StringBuilder(A);
            return A.equals(sb.reverse().toString());
        }
        // find second diff
        int di2 = findDiffIdx(A, B, di1 + 1);
        // if third diff -- false
        int di3 = findDiffIdx(A, B, di2 + 1);

        if(di3 != -1){
            return false;
        }

        String swappedA = swapChars(A, di1, di2);

        return swappedA.equals(B);
    }

    private static String swapChars(String a, int idx1, int idx2){
        String newStr = "";
        for (int i = 0; i < a.length(); i++) {
            if(i == idx1){
                newStr = newStr + a.charAt(idx2);
            } else if(i == idx2) {
                newStr = newStr + a.charAt(idx1);
            }else{
                newStr = newStr + a.charAt(i);
            }
        }

        return newStr;
    }

    private static int findDiffIdx(String a, String b, int charIdx){
        for (int i = charIdx; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)){
                return i;
            }
        }

        return -1;
    }
}
