import java.math.*;
class Solution {
    public int numSteps(String s) {
        BigInteger n = new BigInteger(s,2);
        BigInteger two = BigInteger.valueOf(2);
        int count=0;
        while(!n.equals(BigInteger.ONE)){
            if(n.mod(two).equals(BigInteger.ZERO)){
                n=n.divide(two);
                count++;
            }
            else{
                n=n.add(BigInteger.ONE);
                count++;
                n=n.divide(two);
                count++;
            }
        }

        return count;
    }
}