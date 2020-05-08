package com.easy._1431_kidscandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsCandiesSolution {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var listBoolean = new ArrayList<Boolean>();

        int max = Arrays.stream(candies).max().getAsInt();

        for(int number : candies){
            listBoolean.add(number + extraCandies >= max);
        }

        return listBoolean;
    }
}
