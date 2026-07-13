class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
      let map = new Set();
      let left = 0;
      let stringResult = 0;
      for(let right=0; right < s.length; right++){
         while(map.has(s[right])){
            map.delete(s[left]);
            left++;
         }
         map.add(s[right]);
         stringResult = Math.max(stringResult, right - left + 1)
      }
      return stringResult;
    }
}
