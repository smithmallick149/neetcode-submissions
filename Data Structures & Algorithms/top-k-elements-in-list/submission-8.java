class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int i=0;i <nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int num: map.keySet()) {
            int freq = map.get(num);
            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        int[] result = new int[k];
        int index = 0;

        for(int freq = bucket.length - 1; freq >= 0 && index < k; freq--) {

            if(bucket[freq] != null) {
                for(int num : bucket[freq]) {
                    result[index++] = num;

                    if(index == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
