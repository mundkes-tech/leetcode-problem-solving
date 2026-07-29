class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int x = Math.max(1,n-k);
        int sum = 0;

        for(int i=x;i<=n+k;i++){
            if((n & i) == 0){
                sum+=i;
            }
        }
        return sum;
    }
}