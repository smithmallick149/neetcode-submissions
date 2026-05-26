class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    maxProduct(nums) {
        let max = nums[0];

        for(let i=0;i < nums.length;i++){
            let curr = nums[i];
            max = Math.max(max, curr);

            for(let j =i+1; j< nums.length;j++){
                curr *= nums[j];
                max = Math.max(max, curr);
            }
        }
        return max
    }
}
