package com.easy.jewelsandstones;

import java.util.HashSet;

public class JevelsAndStones {

    // https://leetcode.com/problems/jewels-and-stones/
    public static void main(String[] args) {
//        String J = "aA", S = "aAAbbbb";
        String J = "z", S = "ZZ";

        System.out.println(numJewelsInStones(J, S));
    }

    public static int numJewelsInStones(String J, String S) {
        HashSet<Character> charList = new HashSet<>();

        for (int i = 0; i < J.length(); i++) {
            charList.add(J.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if(charList.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
