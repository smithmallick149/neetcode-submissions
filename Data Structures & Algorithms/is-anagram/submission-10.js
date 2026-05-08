class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        let tcount = {};
        let scount = {};
        if(s.length !== t.length) return false;

        for(const i of s){
            scount[i] = (scount[i] || 0 ) + 1;
        }
        for(const i of t){
            tcount[i] = (tcount[i] || 0 ) + 1;
        }

        for(const i in tcount){
            if(tcount[i] !== scount[i]) return false
        }
        return true;
    }
}
