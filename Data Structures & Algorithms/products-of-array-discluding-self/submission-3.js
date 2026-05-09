class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    // productExceptSelf(nums) {
    //     let n = nums.length;
    //     let res = new Array(n);
    //     for(let i =0;i < n;i++){
    //         let prod = 1;
    //         for(let j=0; j < n;j++){
    //             if(i !== j){
    //                 prod = prod *  nums[j]
    //             }
    //         }
    //         res[i] = prod;
    //     }
    //     return res;
    // }
    productExceptSelf(nums){
      const n = nums.length;
      const res = new Array(n);
      const pre = new Array(n);
      const suff = new Array(n);

      pre[0] = 1;
      suff[n-1] = 1;
      for(let i=1;i < n;i++){
        pre[i] = nums[i-1] * pre[i-1];
      }
      for(let i=n-2;i >= 0;i--){
        suff[i] = nums[i+1] * suff[i+1];
      }
      for(let i =0;i<n;i++){
        res[i] = pre[i] * suff[i];
      }
      return res;
    }
}
