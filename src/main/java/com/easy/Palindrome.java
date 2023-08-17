package com.easy;

public class Palindrome {
    ;

    public static void main(String[] args) {
        int x = -121;

        boolean isPalindrom = isPalindrom(x);
        System.out.println(isPalindrom);
    }


    public static boolean isPalindrom(int x) {
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            if (str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }


}
