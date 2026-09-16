class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;

        int l= 0;
        int max = 0;
        int r = 0;
        while(r < s.length()) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0)+1);
            max = Math.max(max, count.get(s.charAt(r)));

            while((r-l+1) - max > k) {
                count.put(s.charAt(l), count.getOrDefault(s.charAt(l), 0)-1);
                l++;
            }
            res = Math.max(res, r-l+1);
            r++;
        }
        return res;
    }
}
