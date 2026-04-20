class Solution {
    public int maxDistance(int[] colors) {
        int maxdis = 0;
        for(int i = 0;i<colors.length;i++){
            for(int j=0;j<colors.length;j++){
                if(colors[i] != colors[j]){
                    maxdis = Math.max(maxdis,Math.abs(j-i));
                }
                else{
                    continue;
                }
            }
        }
        return maxdis;
    }
}