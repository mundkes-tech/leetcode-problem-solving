class Solution {
    public int missingMultiple(int[] nums, int k) {
        int num = k;
        while(contains(nums,num)){
            num+=k;
        }
        return num;
    }

    private boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}