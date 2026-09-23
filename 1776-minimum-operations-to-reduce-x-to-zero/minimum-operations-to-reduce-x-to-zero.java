class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int left = 0;

        int totalsum = 0;
        for(int num:nums){
            totalsum+=num;
        }

        int target = totalsum - x;

        if(target==0) return n;

        if(target < 0) return -1;

        int maxlen = -1;
        int currsum = 0;


        for(int right = 0;right<nums.length;right++){
            currsum+=nums[right];

            while(currsum > target && left<=right){
                currsum-=nums[left];
                left++;
            }

            if(currsum == target){
                maxlen = Math.max(maxlen,right-left+1);
            }
        }

        return (maxlen == -1) ? -1 : n - maxlen;
    }
}