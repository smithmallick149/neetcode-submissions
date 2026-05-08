class Solution {
    /**
     * @param {string} s
     * @param {number} k
     * @return {number}
     */
    characterReplacement(s, k) {
        let map = new Map()
        let res = 0;

        let l = 0, maxf = 0;
        for(let r =0; r < s.length;r++){
            map.set(s[r], (map.get(s[r]) || 0) +1)
            maxf = Math.max(maxf, map.get(s[r]))

            while((r-l+1) - maxf > k){
                map.set(s[l], map.get(s[l]) - 1)
                l++
            }
            res = Math.max(res, r - l +1)
        }
    return res;
    }
}
