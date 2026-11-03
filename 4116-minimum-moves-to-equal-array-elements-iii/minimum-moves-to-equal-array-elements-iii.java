class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        int max = 0;
        for(int num:nums){
            if(num>max){
                max = num;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max){
                while(nums[i]!=max){
                    nums[i]+=1;
                    moves++;
                }
            }
        }
        return moves;
    }
}