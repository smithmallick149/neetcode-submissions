class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int j = 0; j < k; j++) {
            int maxNum = 0;
            int maxFreq = 0;
            for (int num : map.keySet()) {
                if (map.get(num) > maxFreq) {
                    maxFreq = map.get(num);
                    maxNum = num;
                }
            }
            result[j] = maxNum;
            map.remove(maxNum);
        }
        return result;
    }
}
