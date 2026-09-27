class Solution {
    boolean[] col, posDialog, negDialog;
    List<List<String>> res;
    char[][] board;
    public List<List<String>> solveNQueens(int n) {
        col= new boolean[n];
        posDialog = new boolean[2 * n];
        negDialog = new boolean[2 * n];
        res = new ArrayList<>();
        board = new char[n][n];

        for(int i=0;i <n;i++) {
            for(int j=0;j <n;j++){
                board[i][j] = '.';
            }
        }
        backtrack(0, n);
        return res;
    }
    private void backtrack(int r, int n) {
        if(r == n) {
            List<String> copy = new ArrayList<>();
            for(char[] row: board) {
                copy.add(new String(row));
            }
            res.add(copy);
            return;
        }

        for(int c=0;c < n;c++) {
            if(col[c] || posDialog[r+c] || negDialog[r-c+n]) {
                continue;
            }
            col[c] = true;
            posDialog[r+c] = true;
            negDialog[r-c+n] = true;
            board[r][c]= 'Q';

            backtrack(r+1, n);
            col[c] = false;
            posDialog[r+c] = false;
            negDialog[r-c+n] = false;
            board[r][c]= '.';
        }
    }
}
