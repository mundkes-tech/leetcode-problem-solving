class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length(), m = str2.length(), L = n + m - 1;
        char[] res = new char[L];
        Arrays.fill(res, '?');

        int[] z = zFunc(str2.toCharArray());
        int last = -m;

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != 'T') continue;

            int overlap = Math.max(last + m - i, 0);
            if (overlap > 0 && z[m - overlap] < overlap) return "";

            for (int j = overlap; j < m; j++)
                res[i + j] = str2.charAt(j);

            last = i;
        }

        int[] free = new int[L];
        int lastFree = -1;
        for (int i = 0; i < L; i++) {
            if (res[i] == '?') {
                res[i] = 'a';
                lastFree = i;
            }
            free[i] = lastFree;
        }

        char[] comb = (str2 + new String(res)).toCharArray();
        int[] zc = zFunc(comb);

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != 'F') continue;

            if (zc[m + i] >= m) {
                int pos = free[i + m - 1];
                if (pos < i) return "";
                res[pos] = 'b';
                i = pos;
            }
        }

        return new String(res);
    }

    private int[] zFunc(char[] s) {
        int n = s.length, L = 0, R = 0;
        int[] z = new int[n];

        for (int i = 1; i < n; i++) {
            if (i <= R) z[i] = Math.min(R - i + 1, z[i - L]);

            while (i + z[i] < n && s[z[i]] == s[i + z[i]]) {
                L = i;
                R = i + z[i];
                z[i]++;
            }
        }
        if (n > 0) z[0] = n;
        return z;
    }
}