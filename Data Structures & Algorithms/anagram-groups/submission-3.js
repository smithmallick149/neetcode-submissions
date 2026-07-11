class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let result = {}
        for(const str of strs){
            let sort = str.split('').sort().join('')
            if(!result[sort]){
                result[sort] = []
            }
            result[sort].push(str)
        }
        return Object.values(result)
    }
}
