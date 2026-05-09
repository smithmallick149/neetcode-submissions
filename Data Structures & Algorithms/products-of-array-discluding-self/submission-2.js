class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        let n = nums.length;
        let res = new Array(n);
        for(let i =0;i < n;i++){
            let prod = 1;
            for(let j=0; j < n;j++){
                if(i !== j){
                    prod = prod *  nums[j]
                }
            }
            res[i] = prod;
        }
        return res;
    }
}
