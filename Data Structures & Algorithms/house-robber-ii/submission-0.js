class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    rob(nums) {
        if(nums.length === 0) return 0;
        if(nums.length === 1) return nums[0];

        return Math.max(this.helper(nums.slice(1)), this.helper(nums.slice(0, -1)));
    }
    helper(nums) {
       let rob1 = 0;
       let rob2 = 0;

       for(const num of nums) {
        const newRob = Math.max(rob1 + num, rob2);
        rob1 = rob2;
        rob2 = newRob;
       }
       return rob2;
    }

}
