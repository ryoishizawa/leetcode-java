// 121. Best Time to Buy and Sell Stock
// Brute force approach
// Time Complexity: O(n^2), Space Complexity: O(1)
class Solution {
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
