class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minPrice = prices[0];
        int buy = -1;
        int sell = -1;

        for(int i=0;i < prices.length;i++) {
            int profit = prices[i] - minPrice;
            if(profit > max) {
                max = Math.max(max, profit);
                sell = i;
            } else {
                if(minPrice > prices[i]) {
                    minPrice = Math.min(minPrice, prices[i]);
                    buy = i;
                }
            }
        }
        return max;
    }
}
