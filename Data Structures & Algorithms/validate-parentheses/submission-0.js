class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        const stack = []
        const obj = {
            ')': '(',
            ']': '[',
            '}': '{'
        }
        for(let i = 0;i < s.length;i++){
           const char = s[i] 
           if(char == '(' || char == '{' || char == '['){
            stack.push(char)
           } else {
                if(stack.length === 0 || stack.pop() !== obj[char]){
                    return false
                }
           }
        }
        return stack.length === 0
    }
}
