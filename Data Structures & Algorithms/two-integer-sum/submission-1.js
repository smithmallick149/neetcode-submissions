class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const map = new Map();

        for(let i=0;i<nums.length;i++){
            const elem = target - nums[i]
            if(map.has(elem)){
                return [map.get(elem), i]
            }
            map.set(nums[i], i)
        }
        return []
    }
}
