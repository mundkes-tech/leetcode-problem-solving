class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int minlength = Integer.MAX_VALUE;
        boolean flag = false;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                sum-=nums[i];
                minlength = Math.min(minlength,j-i+1);
                i++;
                flag = true;
            }
        }
        if(flag){
            return minlength;
        }
        return 0;
    }
}