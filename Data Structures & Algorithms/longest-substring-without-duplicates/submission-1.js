class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        const set = new Set()
        let left = 0
        let res = 0;

        for(let right=0;right <s.length;right++){
            while(set.has(s[right])){
                set.delete(s[left])
                left++
            }
            set.add(s[right])
            res = Math.max(res, right - left +1)
        }
        return res
    }
}
