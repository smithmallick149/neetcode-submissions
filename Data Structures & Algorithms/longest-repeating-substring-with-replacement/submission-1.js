class Solution {
    /**
     * @param {string} s
     * @param {number} k
     * @return {number}
     */
    characterReplacement(s, k) {
        let left = 0;
        let right = 0;
        let count = {}
        let maxLength = 0;
        let maxf = 0;

        while(right < s.length) {
            count[s[right]] = (count[s[right]] || 0) + 1

            if(count[s[right]] > maxf) {
                maxf = count[s[right]]
            }
            if(right - left + 1 - maxf > k){
                count[s[left]]--
                left++
            }
            maxLength = Math.max(maxLength, right - left + 1)
            right++
        }
        return maxLength
    }
}
