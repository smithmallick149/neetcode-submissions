class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    // maxProfit(prices) {
    //     let res = 0;
    //     for(let i=0;i<prices.length;i++){
    //         let buy = prices[i];
    //         for(let j=i+1;j <prices.length;j++){
    //             let sell = prices[j];
    //             res = Math.max(res, sell-buy);
    //         }
    //     }
    //     return res;
    // }
    maxProfit(prices){
        let l=0;
        let r =1;
        let max = 0;
        while( r <= prices.length){
            if(prices[r] > prices[l]){
                max = Math.max(max, prices[r] - prices[l]);
            } else {
                l = r;
            }
            r++;
        }
        return max;
    }
}
