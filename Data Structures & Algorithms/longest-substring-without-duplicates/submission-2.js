class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        let longest = 0;
        let res = 0;
        let map = new Map();

        for(let i =0; i < s.length;i++){
            if(map.has(s[i])){
                longest = Math.max(map.get(s[i]) + 1, longest)
            }
            map.set(s[i], i);
            res = Math.max(res, i - longest + 1);
        }
        return res
    }
}
