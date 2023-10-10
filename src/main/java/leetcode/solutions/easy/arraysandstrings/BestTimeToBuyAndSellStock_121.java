package leetcode.solutions.easy.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStock_121 {
    //    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};
        System.out.println(getProfit(prices));
    }

    private static int getProfit(int[] prices) {
        int buyPrice = prices[0];
        int largestProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            buyPrice = Math.min(buyPrice, prices[i]);
            int currProfit = prices[i] - buyPrice;
            if (currProfit > largestProfit) {
                largestProfit = currProfit;
            }
        }

        return largestProfit;
    }

    // Brute force
    private static int getProfit1(int[] prices) {
        int profix = 0;
        for (int i = 0; i < prices.length; i++) {
            int currProfit = 0;
            for (int j = i; j < prices.length; j++) {
                currProfit = prices[j] - prices[i];
                profix = Math.max(profix, currProfit);
            }
        }

        return profix;
    }
}
