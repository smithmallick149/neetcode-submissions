class Solution {
    /**
     * @param {number[][]} grid
     * @return {number}
     */
    orangesRotting(grid) {
       let queue = [], fresh = 0, minutes = 0;
    let rows = grid.length, cols = grid[0].length;
    
    for (let r = 0; r < rows; r++) {
        for (let c = 0; c < cols; c++) {
            if (grid[r][c] === 2) queue.push([r, c]);
            else if (grid[r][c] === 1) fresh++;
        }
    }
    
    const directions = [[1, 0], [-1, 0], [0, 1], [0, -1]];
    
    while (queue.length && fresh) {
        let newQueue = [];
        for (let [r, c] of queue) {
            for (let [dr, dc] of directions) {
                let nr = r + dr, nc = c + dc;
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] === 1) {
                    grid[nr][nc] = 2;
                    fresh--;
                    newQueue.push([nr, nc]);
                }
            }
        }
        queue = newQueue;
        minutes++;
    }
    
    return fresh ? -1 : minutes;
    }
}
