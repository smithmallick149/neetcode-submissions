class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    constructor(){
        this.count = 0;
    }
    expandCenter(left, right, s) {
        while(left >= 0 && right < s.length && s[left] === s[right]) {
            this.count++;
            left--;
            right++;
        }
    }
    countSubstrings(s) {
        for(let i =0 ;i < s.length;i++) {
            this.expandCenter(i, i, s);
            this.expandCenter(i, i+1, s);
        }
    return this.count;

    }
}
