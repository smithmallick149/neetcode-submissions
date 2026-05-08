class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
          let freqMap = new Map();

    // Count the frequency of each number
    for (let num of nums) {
        freqMap.set(num, (freqMap.get(num) || 0) + 1);
    }

    // Sort numbers based on frequency and get the top k
    return [...freqMap.keys()]
        .sort((a, b) => freqMap.get(b) - freqMap.get(a))
        .slice(0, k);
    }
}
