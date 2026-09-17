class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int secmax = 0;
        int maxindex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                secmax = max;
                max=nums[i];
                maxindex=i;
            }
            else if(nums[i] > secmax && nums[i]!=max){
                secmax = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
        if(max>=(secmax*2)){
            return maxindex;
        }
        return -1;
    }
}