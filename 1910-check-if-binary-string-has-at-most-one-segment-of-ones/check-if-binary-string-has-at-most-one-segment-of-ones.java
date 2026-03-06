class Solution {
    public boolean checkOnesSegment(String s) {
        char prev = '1';
        boolean flag = false;
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='0' && prev == '1'){
                flag=true;
            }
            if(ch=='1' && prev == '0'){
                return false;
            }

            prev=ch;
        }
        return true;
    }
}