class Solution {
public:
int rows, cols;
vector<vector<int>> dirs = {{1,0},{-1,0},{0,1}, {0,-1}};
vector<vector<int>> dp;

int dfs(vector<vector<int>>& matrix,int r,int c){
    if(dp[r][c] != -1)
    return dp[r][c];

    int maxLen = 1;

    for(auto& d : dirs){
        int nr = r + d[0];
        int nc = c + d[1];
        if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && matrix[nr][nc] > matrix[r][c]){
            maxLen = max(maxLen, 1 + dfs(matrix, nr, nc));
        }
    }
    return dp[r][c] = maxLen;
}
    int longestIncreasingPath(vector<vector<int>>& matrix) {
        rows = matrix.size();
        cols = matrix[0].size();
        dp.assign(rows, vector<int>(cols, -1));

        int ans = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0;j < cols; j++){
                ans = max(ans, dfs(matrix, i, j));
            }
        }
        return ans;
    }
};
