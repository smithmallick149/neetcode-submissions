class Solution {
    /**
     * @param {number} n
     * @return {number}
     */
    // climbStairs(n) {
    //    if(n <= 2) return n;
    //    let dp = new Array(n+1).fill(0);
    //    dp[1]= 1;
    //    dp[2] = 2;

    //    for(let i=3;i <=n;i++){
    //     dp[i] = dp[i-1] + dp[i-2];
    //    }
    //    return dp[n]
    // }
     climbStairs(n){
        let one =1, two=1;
        for(let i=0; i < n-1;i++){
            let temp = one;
            one = one + two;
            two = temp;
        }
        return one;
     }
}
