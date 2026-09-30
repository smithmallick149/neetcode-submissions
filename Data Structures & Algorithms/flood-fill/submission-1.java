class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        boolean [][] visited = new boolean[n][m];

        int original = image[sr][sc];
        int []dr = {-1, 1, 0, 0};
        int []dc ={0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        visited[sr][sc] = true;

        while(!q.isEmpty()) {
            int [] node = q.poll();
            int r = node[0];
            int c = node[1];

            image[r][c] = color;

            for(int i=0;i < 4;i++ ){
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc] && image[nr][nc] == original) {
                    visited[nr][nc] = true;
                    q.add(new int[] {nr, nc});
                }
            }
        }
        return image;
    }
}