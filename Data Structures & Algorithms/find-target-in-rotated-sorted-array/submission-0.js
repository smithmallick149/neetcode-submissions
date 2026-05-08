class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    search(nums, target) {
        let l = 0;
        let r  = nums.length - 1;
        while(l < r){
            const mid = Math.floor((l+r)/2)
            if(nums[mid] > nums[r]){
                l = mid + 1
            } else {
                r = mid
            }
        }
        const pivot = l;
        const result = this.binarysearch(nums, target, 0 , pivot-1)
        if(result !== -1){
            return result;
        }

        return this.binarysearch(nums, target, pivot,nums.length -1)
    }

    binarysearch(nums, target, left,right){
        while(left <= right){
            const mid = Math.floor((left + right)/2);
            if(nums[mid] === target){
                return mid
            } else if(nums[mid] < target){
                left = mid + 1
            } else {
                right = mid -1
            }
        }
        return -1
    }
}
