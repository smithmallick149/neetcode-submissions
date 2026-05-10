class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(nums) {
        let min = Number.MAX_VALUE;
        for(let i of nums) {
            if(i < min){
                min = i
            }
        }   
        return min;
    }
}
