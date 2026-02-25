class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int i=0;
        while(i<accounts.length){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
                max=Math.max(max,sum);
            }
            i++;
        }
        return max;
    }
}