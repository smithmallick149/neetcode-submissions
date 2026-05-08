class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        const obj = {
            ']':'[',
            '}':'{',
            ')':'('
        }
        const result = [];

        for(let i =0;i < s.length;i++) {
            if(s[i] == '(' || s[i] == '{' || s[i] == '[') {
                result.push(s[i]);
            } else if(obj[s[i]]){
                if(result.length === 0 || result.pop() !== obj[s[i]]) {
                    return false;
                }
            }
        }
        return  result.length === 0;

    }
}
