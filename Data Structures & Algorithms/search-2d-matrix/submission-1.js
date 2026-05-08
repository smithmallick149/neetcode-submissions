class Solution {
    /**
     * @param {number[][]} matrix
     * @param {number} target
     * @return {boolean}
     */
    searchMatrix(matrix, target) {
        let n = matrix.length;
        let m = matrix[0].length;
        let low = 0;
        let high = n * m -1
        while(low <= high){
            let mid = Math.floor((low + high)/2);
            let row = Math.floor(mid / m);
            let col = Math.floor(mid % m);

            if(matrix[row][col] == target) return true
            else if(matrix[row][col] < target) low = mid + 1
            else high = mid - 1
        }
        return false;
    }
}
