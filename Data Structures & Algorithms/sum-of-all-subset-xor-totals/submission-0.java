class Solution {
        int sum = 0;
    public int subsetXORSum(int[] nums) {
        backtrack(0, nums, new ArrayList<>() );
        return sum;
    }
    private void backtrack(int index, int [] nums, List<Integer> subset) {
        int xor = 0;
        for(int num: subset){
            xor ^= num;
        }
            sum += xor;

        for(int j=index;j < nums.length;j++){
            subset.add(nums[j]);
            backtrack(j+1, nums, subset);
            subset.remove(subset.size() - 1);
        }
    }
}