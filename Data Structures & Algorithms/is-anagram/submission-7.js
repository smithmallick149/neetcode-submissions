class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        let scount = {};
        let tcount = {};

        if(s.length !== t.length) return false;
        for(const num of s){
            scount[num] = (scount[num] || 0) + 1;
        }
        for(const num of t){
            tcount[num] = (tcount[num] || 0) + 1;
        }

        for(const i in scount){
            if(scount[i] !== tcount[i]){
                return false;
            }
        }
        return true;
    }
}
