class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for(int i=0;i < n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        int dr [] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};

        int time = 0;
        while(!q.isEmpty() && fresh > 0) {
            int size = q.size();

            for(int i=0; i< size;i++) {
                int [] node = q.poll();
            int r = node[0];
            int c = node[1];

            for(int j=0;j < 4;j++) {
                int nr = r + dr[j];
                int nc = c + dc[j];

                if(nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc] && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    visited[nr][nc] = true;
                    fresh--;
                    q.add(new int[]{nr, nc});
                }
            }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}
