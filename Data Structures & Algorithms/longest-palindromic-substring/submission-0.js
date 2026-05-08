class Solution {
    /**
     * @param {string} s
     * @return {string}
     */
    constructor(){
        this.maxLen = 1;
        this.start = 0;
    }
   expandCenter(left, right, s) {
    while(left >= 0 && right < s.length && s[left] === s[right]) {
        if(right - left + 1 > this.maxLen) {
            this.maxLen = right - left + 1;
            this.start = left;
        }
        left--;
        right++;
    }
   }
    longestPalindrome(s) {
        if(s.length <= 1) return s;

        for(let i =0; i < s.length;i++) {
            this.expandCenter(i, i, s);
            this.expandCenter(i, i+1, s);
        }
        return s.substring(this.start, this.start + this.maxLen);
    }
}
