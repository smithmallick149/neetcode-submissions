class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int checkLen = len /2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num: map.keySet()){
           if(map.get(num) > checkLen) return num;
        }
        return -1;
    }
}