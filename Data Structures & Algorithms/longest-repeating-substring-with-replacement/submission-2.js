class Solution {
    /**
     * @param {string} s
     * @param {number} k
     * @return {number}
     */
    characterReplacement(s, k) {
        let charCount = {};
        let left = 0;
        let right = 0;
        let max = 0;

        while(right < s.length) {
            let char = s[right];
            charCount[char] = (charCount[char] || 0) + 1;

            if(charCount[char] > max) max = charCount[char]
            if(right - left + 1 - k > max) {
                charCount[s[left]]--
                left++
            }
            right++
        }
        return right - left
    }
}
