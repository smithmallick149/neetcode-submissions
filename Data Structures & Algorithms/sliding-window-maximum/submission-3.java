class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();

        for(int i =0;i <n;i++) {
            while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i >= k-1) {
                result.add(nums[dq.peekFirst()]);
            }
        }
        int [] ans = new int[result.size()];
        for(int i=0;i <result.size();i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
