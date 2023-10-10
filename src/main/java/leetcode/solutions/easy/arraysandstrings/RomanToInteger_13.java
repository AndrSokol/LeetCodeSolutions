package leetcode.solutions.easy.arraysandstrings;

public class RomanToInteger_13 {
    //    https://leetcode.com/problems/roman-to-integer/
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == 'M') {
                num += 1000;
            }
            if (currChar == 'D') {
                num += 500;
            }
            if (currChar == 'C') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    num += 400;
                    i++;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                    num += 900;
                    i++;
                } else {
                    num += 100;
                }
            }
            if (currChar == 'L') {
                num += 50;
            }
            if (currChar == 'X') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    num += 40;
                    i++;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    num += 90;
                    i++;
                } else {
                    num += 10;
                }
            }
            if (currChar == 'V') {
                num += 5;
            }
            if (currChar == 'I') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    num += 4;
                    i++;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                    num += 9;
                    i++;
                } else {
                    num += 1;
                }
            }
        }
        return num;
    }

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
}
