import java.util.*;

class Fancy {

    List<Long> list;
    long add;
    long mul;
    int mod = 1000000007;

    public Fancy() {
        list = new ArrayList<>();
        add = 0;
        mul = 1;
    }
    
    public void append(int val) {
        long x = (val - add + mod) % mod;
        x = (x * modInverse(mul)) % mod;
        list.add(x);
    }
    
    public void addAll(int inc) {
        add = (add + inc) % mod;
    }
    
    public void multAll(int m) {
        mul = (mul * m) % mod;
        add = (add * m) % mod;
    }
    
    public int getIndex(int idx) {
        if (idx >= list.size()) return -1;
        long val = list.get(idx);
        return (int)((val * mul + add) % mod);
    }

    private long modInverse(long x) {
        return pow(x, mod - 2);
    }

    private long pow(long a, long b) {
        long res = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}