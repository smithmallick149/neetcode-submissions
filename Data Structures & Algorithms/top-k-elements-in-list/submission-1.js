class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
      let freq = {};
      for(const num of nums){
        freq[num] = (freq[num] || 0) +1
      }

      const heap = new MinPriorityQueue((x) => x[1])
      for(const [num, cnt] of Object.entries(freq)){
        heap.enqueue([num, cnt]);
        if(heap.size() > k) heap.dequeue();
      }
      const res = [];
      for(let i=0;i< k;i++){
        const [num, cnt] = heap.dequeue();
        res.push(num);
      }
      return res;
    }
}
