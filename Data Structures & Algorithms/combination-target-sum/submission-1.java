class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<List<Integer>>();
        List<Integer> ds = new ArrayList<>();
        backtrack(0, nums, target, ds);
        return result;
    }
    private void backtrack(int index, int [] nums, int target, List<Integer> ds){
        if(target == 0) {
            result.add(new ArrayList(ds));
            return;
        }
        if(target < 0 || index >= nums.length) return;
        ds.add(nums[index]);
        backtrack(index, nums, target -nums[index], ds);
        ds.remove(ds.size() - 1);
        backtrack(index+1, nums,target, ds);
    }
}
