class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    maxProduct(nums) {
        let maxProd = nums[0]
        let minProd = nums[0]
        let result = nums[0]

        for(let i =1;i< nums.length;i++){
            let curr = nums[i]
            if(curr < 0){
                [maxProd, minProd] = [minProd, maxProd]
            }

            maxProd = Math.max(curr, curr * maxProd);
            minProd = Math.min(curr, curr * minProd);

            result = Math.max(result, maxProd)
        }
        return result
    }
}
