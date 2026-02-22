class Solution {
    public int binaryGap(int n) {
        int prev = -1;
        int maxgap = 0;
        int index = 0;

        while(n>0){
            if((n&1)==1){
                if(prev!=-1){
                    maxgap=Math.max(maxgap,index-prev);
                }
                prev = index;
            }
            n = n>>1;
            index++;
        }
        return maxgap;
    }
}