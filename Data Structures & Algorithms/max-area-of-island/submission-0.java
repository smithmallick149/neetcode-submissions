public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int area = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1 && !visited[r][c]) {
                    visited[r][c] = true;
                    area = Math.max(area, dfs(grid, visited, r, c, rows, cols));
                }
            }
        }

        return area;
    }

    private int dfs(int[][] grid, boolean[][] visited, int r, int c, int rows, int cols) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int count = 1;

        for (int k = 0; k < 4; k++) {
            int nr = r + dr[k];
            int nc = c + dc[k];

            if (nr >= 0 && nr < rows &&
                nc >= 0 && nc < cols &&
                grid[nr][nc] == 1 &&
                !visited[nr][nc]) {

                visited[nr][nc] = true;
                count += dfs(grid, visited, nr, nc, rows, cols);
            }
        }

        return count;
    }
}