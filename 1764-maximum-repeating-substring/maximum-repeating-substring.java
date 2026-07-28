class Solution {
    public int maxRepeating(String sequence, String word) {
        int sl = sequence.length();
        int wl =  word.length();

        int[] dp = new int[sl+1];
        int count = 0;

        for(int i = wl;i<=sl;i++){
            if(sequence.substring(i-wl,i).equals(word)){
                dp[i] =  dp[i-wl]+1;
                count =  Math.max(dp[i],count);
            }
        }
        return count;
    }
}