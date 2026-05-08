class Solution {
    /**
     * @param {number} n
     * @return {string[]}
     */
    generateParenthesis(n) {
        const res = [];
        this.backtrack(0, 0,n,  res, '');
        return res;
    }
    backtrack(openN, closeN, n, res, stack) {
        if(openN === closeN && openN === n) {
            res.push(stack);
            return;
        }

        if(openN < n) {
            this.backtrack(openN + 1, closeN, n, res, stack + '(');
        }

        if(closeN < openN) {
            this.backtrack(openN, closeN + 1, n, res, stack + ')');
        }
    }
}
