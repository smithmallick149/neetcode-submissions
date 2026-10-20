class Solution {
    private void dfs(int i, int j, char [][] grid, boolean[][] visited, int rows, int cols) {
        visited[i][j] = true;
        int [] dr = {-1, 1, 0, 0};
        int [] dc = {0, 0, -1, 1};

        for(int k=0;k < 4;k++) {
            int nr = i + dr[k];
            int nc = j + dc[k];
            if(nr >= 0 && nc >= 0 && nr < rows && nc < cols && grid[nr][nc] == '1' && !visited[nr][nc]) {
                dfs(nr, nc, grid, visited, rows, cols);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean [][] visited = new boolean[rows][cols];
        int count = 0;
        for(int i=0;i < rows;i++) {
            for(int j=0;j < cols;j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    dfs(i, j, grid, visited, rows, cols);
                }
            }
        }
        return count;
    }
}
