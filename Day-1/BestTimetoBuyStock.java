class Solution {
    public int maxProfit(int[] prices) {
        int Buy = prices[0];
        int max_profit = 0;

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i] < Buy)
            {
                Buy = prices[i];
            }
            else if(prices[i] - Buy > max_profit)
            {
                max_profit = prices[i] - Buy;
            }
        }

        return max_profit;
    }
}
