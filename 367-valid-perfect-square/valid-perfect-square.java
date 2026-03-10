import java.util.*;
class Solution {
    public boolean isPerfectSquare(int num) {
        boolean flag = false;
        if(num==1){
            flag = true;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(i*i == num){
                flag = true;
                break;
            }
        }

        return flag;
    }
}