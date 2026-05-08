class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    threeSum(nums) {
        nums = nums.sort((a, b) => a - b);
        const res = [];

        for (let i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break; // No point in continuing if the smallest number is positive
            if (i > 0 && nums[i] === nums[i - 1]) continue; // Skip duplicates for `i`

            let l = i + 1, r = nums.length - 1;
            while (l < r) {
                let sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--; // Need a smaller number
                } else if (sum < 0) {
                    l++; // Need a larger number
                } else {
                    res.push([nums[i], nums[l], nums[r]]);
                    l++;
                    r--;

                    // Skip duplicates for `l` and `r`
                    while (l < r && nums[l] === nums[l - 1]) l++;
                    while (l < r && nums[r] === nums[r + 1]) r--;
                }
            }
        }
        return res;
    }
}

