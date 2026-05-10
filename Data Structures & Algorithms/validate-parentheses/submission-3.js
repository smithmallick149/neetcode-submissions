class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    // isValid(s) {
    //     while(s.includes('()') || s.includes('{}') || s.includes('[]')){
    //         s = s.replace('()', '');
    //         s = s.replace('{}', '');
    //         s = s.replace('[]','');
    //     }
    //     return s === '';
    // }
    isValid(s){
        let obj = {
            ')':'(',
            '}':'{',
            ']':'['
        }
        const stack = [];
        for(let i of s){
            if(i == '(' || i =='{' || i == '['){
                stack.push(i)
            } else if(obj[i]){
                if(stack.length === 0 || stack.pop() !== obj[i]){
                    return false
                }
            }
        }
        return stack.length === 0;
    }
}
