class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i =0;
        int j=0;
        HashSet<Character> hs = new HashSet<>();

        while(j < s.length()) {
            if(hs.contains(s.charAt(j))) {
                hs.remove(s.charAt(i));
                i++;
            } else {
                hs.add(s.charAt(j));
                max = Math.max(max, j-i+1);
                j++;
            }
        }
        return max;
    }
}
