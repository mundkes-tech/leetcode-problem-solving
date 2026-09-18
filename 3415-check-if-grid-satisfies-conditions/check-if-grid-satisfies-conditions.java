class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean flag = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 < m && grid[i][j] != grid[i + 1][j]) {
                    flag = false;
                }
                if (j + 1 < n && grid[i][j] == grid[i][j + 1]) {
                    flag = false;
                }
            }
        }

        return flag;
    }
}