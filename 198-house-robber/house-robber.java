class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dparr = new int[n];

        if(n==1){
            return nums[0];
        }
        dparr[0] = nums[0];
        dparr[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dparr[i] = Math.max(dparr[i-2]+nums[i],dparr[i-1]);
        }

        return dparr[nums.length-1];
    }
}