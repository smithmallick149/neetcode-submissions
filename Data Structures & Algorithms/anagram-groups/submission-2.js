class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const res = {};

        for(let i=0; i<strs.length;i++){
            let charStr = strs[i].split('').sort().join('');
            if(!res[charStr]){
                res[charStr] = []
            }
            res[charStr].push(strs[i]);
        }
        return Object.values(res);
    }
}
