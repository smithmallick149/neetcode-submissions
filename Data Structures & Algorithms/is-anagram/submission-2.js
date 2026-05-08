class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length !== t.length) return false;

        const countS = {}
        const countT = {}
        for(let char of s){
            countS[char] = (countS[char] || 0) + 1
        }
        for(let char of t){
            countT[char] = (countT[char] || 0) + 1
        }
        for(const num in countS){
            if(countS[num] !== countT[num]){
                return false
            }
        }
            return true

    }
}
