class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";

        for(int i=2;i<=n;i++){
            StringBuilder temp = new StringBuilder(s);

            for(int j = s.length() - 1;j>=0;j--){
                temp.append(s.charAt(j) == '0' ? '1' : '0');
            }

            s=temp.insert(s.length(),"1").toString();
        }
        return s.charAt(k-1);
    }
} 