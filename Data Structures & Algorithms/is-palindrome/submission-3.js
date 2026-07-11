class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
      let cleanedStr = s.replace(/[^a-zA-Z0-9]/gi, '').toLowerCase();

      let left = 0;
      let right = cleanedStr.length - 1;

      while(left < right){
         if(cleanedStr[left] !== cleanedStr[right]){
            return false;
         }
         left++;
         right--;
      }
      return true;
    }
}
