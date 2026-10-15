class Solution {
 public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new int[] {i, j});
                    visited[i][j] = true;

                    int perimeter = 0;

                    while (!q.isEmpty()) {
                        int[] cell = q.poll();
                        int r = cell[0];
                        int c = cell[1];

                        for (int k = 0; k < 4; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];

                            if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || grid[nr][nc] == 0) {
                                perimeter++;
                            } else if (!visited[nr][nc]) {
                                visited[nr][nc] = true;
                                q.offer(new int[] {nr, nc});
                            }
                        }
                    }
                    return perimeter;
                }
            }
        }
        return 0;
    }
}