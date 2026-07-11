class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        const set = new Set(nums);
        let streak = 0;

        for(let num of nums){
            if(!set.has(num - 1)){
                let length = 1;
                while(set.has(num + length)){
                    length++;
                }
                streak = Math.max(streak, length)
            }
        }
        return streak;
    }
}
