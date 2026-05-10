class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    // findMin(nums) {
    //     let min = Number.MAX_VALUE;
    //     for(let i of nums) {
    //         if(i < min){
    //             min = i
    //         }
    //     }   
    //     return min;
    // }
    // findMin(nums){
    //     let l = 0;
    //     let r = nums.length - 1;
    //     let res = nums[0];

    //     while(l <= r){
    //         if(nums[l] <= nums[r]){
    //             res = Math.min(res, nums[l]);
    //             break;
    //         }
            
    //     let m = l + Math.floor((r-l) /2);
    //     res = Math.min(res, nums[m]);
    //     if(nums[m] >= nums[l]){
    //         l = m + 1;
    //     } else {
    //         r = m -1;
    //     }
    //     }

    // return res;
    // }

    findMin(nums){
        let left = 0;
        let right = nums.length -1;
        while(left < right){
            let mid = Math.floor((left + right)/ 2);

            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
