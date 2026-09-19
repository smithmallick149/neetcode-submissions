class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int i=0;i <nums.length;i++) {
            int sum = 0;
            for(int j=i;j <nums.length;j++) {
                sum += nums[j];

                if(sum >= target) {
                    int len = j - i+ 1;
                    min = Math.min(min, len);
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}