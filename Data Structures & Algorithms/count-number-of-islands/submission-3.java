class Solution {
    private void bfs(char[][] grid, int r, int c) {
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[]{r,c});

        while(!q.isEmpty()) {
            int [] node = q.poll();
            int row = node[0];
            int col = node[1];

           for(int i =0; i< 4;i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];

            if(newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == '1') {
                grid[newRow][newCol] = '0';
                q.add(new int[]{newRow, newCol});
            }
           }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;

        for(int i=0;i <n;i++) {
            for(int j=0;j < m;j++) {
                if(grid[i][j] == '1') {
                    bfs(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
}
