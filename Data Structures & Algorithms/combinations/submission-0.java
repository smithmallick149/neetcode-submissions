class Solution {
    List<List<Integer>> res;
    private void backtrack(int i, int n, int k, List<Integer> ds) {
           if(ds.size() == k) {
            res.add(new ArrayList<>(ds));
            return;
           }
           for(int j =i;j <= n;j++) {
                ds.add(j);
                backtrack(j+1, n, k, ds);
                ds.remove(ds.size() -1);
           }
    }
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        backtrack(1, n, k, ds);
        return res;
    }
}