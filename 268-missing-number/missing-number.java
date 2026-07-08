class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        int totalsum=0;
        for(int i=1;i<=nums.length;i++){
            totalsum+=i;
        }

        int missing = totalsum - sum;

        return missing;
    }
}