class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;

        int maxlength = 0;
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while (map.get(ch) > 2) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.getOrDefault(leftChar, 0) - 1);
                i++;
            }
            maxlength = Math.max(maxlength, j - i + 1);
        }
        return maxlength;
    }
}