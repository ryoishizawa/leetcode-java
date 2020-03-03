package code121;

/**
 * @author ryoishizawa
 * 
 * 121. Best Time to Buy and Sell Stock
 */
public class BestTimeToBuyAndSellStock {

}

class Solution {
    /**
     * Brute force approach
     * Time Complexity: O(n^2), Space Complexity: O(1)
     */
    public int maxProfit(int[] prices) {
        int maxValue = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i] && prices[j] - prices[i] > maxValue) {
                    maxValue = prices[j] - prices[i];
                }
            }
        }
        return maxValue;
    }
}


/**
 * Single pass approach
 * Time Complexity: O(n), Space Complexity: O(1)
 */
class SolutionV2 {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minValue > prices[i]) {
                minValue = prices[i];
            } else if (prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }
        return maxProfit;
    }
}
