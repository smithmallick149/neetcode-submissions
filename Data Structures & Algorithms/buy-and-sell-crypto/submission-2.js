class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let max = 0;
        let profit = prices[0] || 0

        for(let i=1; i< prices.length;i++){
            if(prices[i] < profit){
                profit = prices[i]
            }
            max = Math.max(max, prices[i] - profit)
        }
        return max;
    }
}
