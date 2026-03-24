class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int MOD = 12345;
        int m = grid.length, n = grid[0].length;
        int total = m * n;

        int[] prefix = new int[total + 1];
        prefix[0] = 1;

        for (int i = 0; i < total; i++) {
            int r = i / n;
            int c = i % n;
            prefix[i + 1] = (int)((long)prefix[i] * grid[r][c] % MOD);
        }

        int[][] res = new int[m][n];
        int suffix = 1;

        for (int i = total - 1; i >= 0; i--) {
            int r = i / n;
            int c = i % n;

            res[r][c] = (int)((long)prefix[i] * suffix % MOD);

            suffix = (int)((long)suffix * grid[r][c] % MOD);
        }

        return res;
    }
}