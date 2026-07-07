class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);

        int x = 0;
        int sum = 0;

        for(char ch : s.toCharArray()){
            int digit = ch - '0';

            if(digit!=0){
                x=x*10+digit;
                sum+=digit;
            }
        }
        return (long)x*sum;
    }
}
