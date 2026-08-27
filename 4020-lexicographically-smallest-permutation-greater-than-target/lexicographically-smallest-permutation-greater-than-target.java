import java.util.Arrays;

class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder current = new StringBuilder();
        if (backtrack(current, count, s.length(), target, false)) {
            return current.toString();
        }
        
        return ""; 
    }
    
    private boolean backtrack(StringBuilder current, int[] count, int length, String target, boolean isAlreadyGreater) {
        if (current.length() == length) {
            return isAlreadyGreater;
        }
        
        int idx = current.length();
        char minChar = isAlreadyGreater ? 'a' : target.charAt(idx);
        
        for (char c = minChar; c <= 'z'; c++) {
            if (count[c - 'a'] > 0) {
                count[c - 'a']--;
                current.append(c);
                
                boolean nextGreater = isAlreadyGreater || (c > target.charAt(idx));
                
                if (backtrack(current, count, length, target, nextGreater)) {
                    return true;
                }
                
                current.setLength(current.length() - 1);
                count[c - 'a']++;
            }
        }
        
        return false;
    }
}
