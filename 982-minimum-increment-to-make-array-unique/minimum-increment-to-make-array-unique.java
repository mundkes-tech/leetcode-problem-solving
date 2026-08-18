class Solution {
    public int minIncrementForUnique(int[] nums) {
        int moves = 0;
        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            while(nums[i] <= nums[i-1]){
                nums[i]++;
                moves++;
            }
            set.add(nums[i]);
        }
        return moves;
    }
}