class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> ns = new HashSet<>();
        for(int num: nums) {
            ns.add(num);
        }
        int longest = 0;
        for(int num: ns) {
            if(!ns.contains(num - 1)) {
                int length = 1;
                while(ns.contains(num +length)) length++;
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
