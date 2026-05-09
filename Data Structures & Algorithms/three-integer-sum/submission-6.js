class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    // threeSum(nums) {
    //     let res = new Set();
    //   for(let i=0;i < nums.length;i++){
    //     for(let j =i+1; j< nums.length;j++){
    //         for(let k = j+1; k < nums.length;k++){
    //             if(nums[i] + nums[j] + nums[k] === 0){
    //                  let triplet = [nums[i], nums[j], nums[k]]
    //                         .sort((a, b) => a - b);

    //                     res.add(JSON.stringify(triplet));
    //             }
    //         }
    //     }
    //   }
    //   return Array.from(res).map((item) => JSON.parse(item));
    // }
    threeSum(nums) {
        nums.sort((a, b)=> a -b);
        const res = [];
        for(let i=0;i < nums.length;i++){
            if(nums[i] > 0) break; //checks positive
            if(i > 0 && nums[i] === nums[i-1]) continue; // skips duplicate

            let l = i+1;
            let r = nums.length - 1;

            while(l < r) {
                const sum = nums[i] + nums[l] + nums[r];
                if(sum > 0) r--;
                else if(sum < 0) l++;
                else {
                    res.push([nums[i], nums[l], nums[r]]);
                    l++;
                    r--;
                    while(l <r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return res
    }
}
