package leetcode.solutions.easy.math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SelfDividingNumbers_728 {
    public static void main(String[] args) {
//        System.out.println(12/10);
        int left = 1;
        int right = 22;
//        int left = 47;
//        int right = 85;
        List<Integer> listNums = getSelfDividingNums(left, right);
        System.out.println(listNums.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
    }

    private static List<Integer> getSelfDividingNums(int left, int right) {
        List<Integer> nums = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)){
                nums.add(i);
            }
        }
        return nums.stream().toList();
    }

    private static boolean isSelfDividing(int num) {
        int x = num;
        while(x > 0) {
            int d = x % 10;
            x = x / 10;
            if (d == 0 || num % d > 0) {
                return false;
            }
        }
        return true;
    }

    // Brute Force with String
    private static List<Integer> getSelfDividingNums1(int left, int right) {
        List<Integer> nums = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String[] digitsStr = String.valueOf(i).split("");
            int divMatchCounter = 0;
            for (String s : digitsStr) {
                int digit = Integer.parseInt(s);
                if (digit != 0 && i % digit == 0) {
                    divMatchCounter++;
                }
            }
            if (divMatchCounter == digitsStr.length) {
                nums.add(i);
            }
        }
        return nums.stream().toList();
    }


}
