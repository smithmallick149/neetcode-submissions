class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        let s1 = s.length;
        let t1 = t.length;

        if(s1 !== t1) return false
        const t1Obj = {};
        const s1Obj = {};

        for(const char of t){
            t1Obj[char] = (t1Obj[char] || 0) + 1;
        }
        for(const char of s){
            s1Obj[char] = (s1Obj[char] || 0) + 1;
        }

        for(const i in t1Obj){
            if(t1Obj[i] !== s1Obj[i]) return false
        }
        return true
    }
}
