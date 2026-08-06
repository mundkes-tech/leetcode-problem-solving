class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int gain = 0;
        int maxgain = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]>minprice){
                gain = prices[i] - minprice;
                maxgain+=gain;
            }
            minprice = prices[i];
        }
        return maxgain;
    }
}