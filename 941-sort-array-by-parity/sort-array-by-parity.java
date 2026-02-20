class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] resnums = new int[nums.length];
        int i = 0;
        for(int num:nums){
            if(num%2==0){
                resnums[i++] = num;
            }
        }

        for(int num:nums){
            if(num%2!=0){
                resnums[i++] = num;
            }
        }

        return resnums;
    }
}