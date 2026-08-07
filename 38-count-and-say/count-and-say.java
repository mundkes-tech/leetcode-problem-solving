class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String ans = "1";
        int count;
        for(int i=2;i<=n;i++){
            String temp = "";
            for(int j=0;j<ans.length();j++){
                count = 1;
                while(j<ans.length()-1 && ans.charAt(j) == ans.charAt(j+1)){
                    count++;
                    j++;
                }
                temp += count;
                temp += ans.charAt(j);
            }
            ans = temp;
        }
        return ans;
    }
}