class Solution {
    public int findJudge(int n, int[][] trust) {
        int [] incoming = new int[n+1];

        for(int[] t: trust) {
            incoming[t[0]]--;
            incoming[t[1]]++;
        }
        for(int i=1;i <= n;i++) {
            if(incoming[i] == n-1) return i;
        }
        return -1;
    }
}