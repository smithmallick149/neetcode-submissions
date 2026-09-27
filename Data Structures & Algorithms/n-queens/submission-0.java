class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char [][] board = new char[n][n];
        for(char[] row: board) {
            Arrays.fill(row, '.');
        }
        backtrack(0, board, res);
        return res;
    }
    private boolean isSafe(int r, int c, char[][] board){
        for(int i =r-1;i>=0;i--){
            if(board[i][c] == 'Q') return false;
        }
        for(int i= r-1, j= c-1; i>=0 && j>= 0;i--,j--){
            if(board[i][j] == 'Q') return false;
        }
         for(int i= r-1, j= c+1; i>=0 && j < board.length;i--,j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }

    private void backtrack(int index, char [][] board, List<List<String>> res) {
        if(index == board.length){
            List<String> copy = new ArrayList<>();
            for(char[] r: board) {
                copy.add(new String(r));
            }
            res.add(copy);
            return;
        }
        for(int c=0; c<board.length;c++) {
            if(isSafe(index, c, board)) {
                board[index][c] = 'Q';
                backtrack(index+1, board, res);
                board[index][c] = '.';
            }
        }
    }
}
