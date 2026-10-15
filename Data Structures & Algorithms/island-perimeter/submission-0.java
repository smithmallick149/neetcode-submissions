class Solution {
    private int [][] grid;
    private boolean [][] visited;
    private int rows, cols;


    private int dfs(int i, int j) {
        visited[i][j] = true;
        int [] dr = {-1, 1, 0, 0};
        int [] dc = {0, 0, -1, 1};
        int perimeter = 0;

        for(int k=0;k < 4;k++) {
            int nr = i + dr[k];
            int nc = j + dc[k];
            if(nr < 0 || nc < 0 || nr >= rows || nc >= cols) {
                perimeter++;
            } else if(grid[nr][nc] == 0) {
                perimeter++;
            } else if(!visited[nr][nc]) {
                perimeter += dfs(nr, nc);
            }
        }
        return perimeter;
    }

    public int islandPerimeter(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.visited = new boolean[rows][cols];

        for(int i=0;i < rows;i++) {
            for(int j=0;j < cols;j++){
                if(grid[i][j] == 1) return dfs(i, j);
            }
        }
        return 0;
    }
}