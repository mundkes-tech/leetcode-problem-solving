class Solution {
    public boolean isVowels(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    };
    public int maxVowels(String s, int k) {

        int n = s.length();
        int count = 0;
        int maxcount = 0;

        int i = 0;
        int j = 0;
        while(j < s.length()){
            if(isVowels(s.charAt(j))){
                count++;
            }
            if(j-i+1 == k){
                maxcount = Math.max(count,maxcount);
                if(isVowels(s.charAt(i))){
                    count--;
                }
                i++;
            }
            j++;
        }
        return maxcount;
    }
}