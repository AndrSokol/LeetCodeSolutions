package com.easy.buddystrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BuddyStringBetterSolution {
    public static void main(String[] args) {
        String a = "ab";
        String b = "ab";

        boolean res = buddyStrings(a, b);
        System.out.println(res);
    }

    private static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())
            return false;

        HashSet<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < A.length(); i++) {
            uniqueChars.add(A.charAt(i));
        }

        if (A.equals(B)) {
            return uniqueChars.size() < A.length();
        }

        List<Integer> diffs = new ArrayList<>();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diffs.add(i);
            }
        }

        return diffs.size() == 2
                && A.charAt(diffs.get(0)) == B.charAt(diffs.get(1))
                && B.charAt(diffs.get(0)) == A.charAt(diffs.get(1));
    }
}
