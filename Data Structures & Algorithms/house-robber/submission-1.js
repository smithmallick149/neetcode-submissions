class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    rob(nums) {
        // if(nums.length === 0) return 0;
        // if(nums.length === 1) return nums[0];

        // const dp = new Array(nums.length).fill(0);
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0], nums[1]);

        // for(let i =2; i < nums.length;i++) {
        //     dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        // }
        // return dp[nums.length - 1];
        let rob1 = 0;
        let rob2 = 0;

        for(const num of nums) {
            const temp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
