class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        const scount = {}
        const tcount = {};
        if(s.length !== t.length) return false;

        for(let char of s){
            scount[char] = (scount[char] || 0 ) + 1
        }
        for(let char of t){
            tcount[char] = (tcount[char] || 0 ) + 1
        }
        
        for(const char in scount){
            if(scount[char] !== tcount[char]){
                return false;
            }
        }
        return true;
    }
}
