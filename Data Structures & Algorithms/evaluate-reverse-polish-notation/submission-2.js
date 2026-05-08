class Solution {
    /**
     * @param {string[]} tokens
     * @return {number}
     */
    evalRPN(tokens) {
        let result = 0;
        let stack = [];
        if(tokens.length === 1) return parseInt(tokens[0])
        for(let i of tokens) {
            if(Number.isInteger(parseInt(i))) {
                stack.push(parseInt(i));
            } else {
                let a = stack.pop();
                let b = stack.pop();
                 if (i == '+') {
                    result = b + a;
                } else if (i == '-') {
                    result = b - a;
                } else if (i == '*') {
                    result = b * a;
                } else if (i == '/') {
                    result = Math.trunc(b / a); // truncate toward 0
                }
                stack.push(result);
            }
        }
        return result;
    }
}
