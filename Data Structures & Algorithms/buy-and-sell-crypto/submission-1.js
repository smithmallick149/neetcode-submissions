class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let minprice = prices[0] || 0;
        let max = 0;

        for(let i = 0; i < prices.length;i++){
            if(prices[i] < minprice){
                minprice = prices[i]
            }
            max= Math.max(max,prices[i] - minprice)
        }
        return max
    }
}
