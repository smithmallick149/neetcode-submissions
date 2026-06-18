class Solution {
    /**
     * @param {string} text1
     * @param {string} text2
     * @return {number}
     */
    // longestCommonSubsequence(text1, text2) {
    //     const dfs = (i, j) =>{
    //         if(i === text1.length || j === text2.length) return 0;

    //         if(text1[i] === text2[j]) return 1 + dfs(i+1, j+1);
    //         return Math.max(dfs(i+1, j), dfs(i, j+1));
    //     }
    //     return dfs(0,0);
    // }

    longestCommonSubsequence(text1, text2) {
        // const dp = Array(text1.length + 1).fill().map(()=> Array(text2.length + 1).fill(0));
        if(text1.length < text2.length){
            [text1, text2] = [text2, text1]
        }
        let prev = new Array(text2.length + 1).fill(0);
        let curr = new Array(text2.length +1).fill(0);
        for(let i= text1.length - 1; i>= 0;i--){
            for(let j= text2.length - 1; j >= 0;j--){
                if(text1[i] === text2[j]){
                    // dp[i][j] = 1 + dp[i+1][j+1];
                    curr[j] = 1 + prev[j+1];
                } else {
                    // dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
                    curr[j] = Math.max(curr[j+1], prev[j])
                }
            }
        [prev, curr]= [curr, prev]
        }
        return prev[0]
        // return dp[0][0];
    }
}
