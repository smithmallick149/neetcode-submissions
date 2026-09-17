class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int m = k + 1; m < nums.length; m++) {
                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[m];
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], nums[m]);

                        if (sum == target && !set.contains(quad)) {
                            set.add(quad);
                            result.add(quad);
                        }
                    }
                }
            }
        }
        return result;
    }
}