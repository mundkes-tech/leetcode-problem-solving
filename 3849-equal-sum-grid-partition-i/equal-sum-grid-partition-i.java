class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(n == 1 && m == 1)
            return false;
        long []row = new long[n];
        long sum = 0;
        for(int i=0;i<n;i++)
        {
            long sum1 = 0;
            for(int j=0;j<m;j++)
            {
                sum1 += grid[i][j];
            }
            row[i] = sum1;
            sum += sum1;
        }
        long leftSum = 0;
        for(int i=0;i<n-1;i++)
        {
            sum -= row[i];
            leftSum += row[i];
            if(sum == leftSum)
                return true;
        }
        sum = 0;
        long []col = new long[m];
        for(int i=0;i<m;i++)
        {
            long sum1 = 0;
            for(int j=0;j<n;j++)
            {
                sum1 += grid[j][i];
            }
            sum += sum1;
            col[i] = sum1;
        }
        leftSum = 0;
        for(int i=0;i<m-1;i++)
        {
            sum -= col[i];
            leftSum += col[i];
            if(sum == leftSum)
                return true;
        }
        return false;
    }
}