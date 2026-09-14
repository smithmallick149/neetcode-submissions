class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(strs[0]);
        for(int i=0;i < strs.length;i++) {
           int j = 0;
           while(j < sb.length() && j < strs[i].length() && sb.charAt(j) == strs[i].charAt(j)) {
            j++;
           }
        sb.setLength(j);
        }
        return sb.toString();
    }
}