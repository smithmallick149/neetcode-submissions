class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int [] dr = {-1,1, 0, 0};
        int [] dc = {0, 0, -1, 1};

        for(int i=0;i < m;i++) {
            for(int j=0;j < n;j++) {
                if(grid[i][j] == 0) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        while(!q.isEmpty()) {
            int [] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            for(int k=0; k <4;k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if(nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == Integer.MAX_VALUE) {
                    grid[nr][nc] = grid[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
