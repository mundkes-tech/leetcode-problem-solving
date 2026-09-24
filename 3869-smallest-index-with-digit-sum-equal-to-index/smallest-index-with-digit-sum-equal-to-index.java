class Solution {
    public int smallestIndex(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int currnum = nums[i];
            while (currnum > 0) {
                int digit = currnum % 10;
                sum += digit;
                currnum = currnum / 10;
            }
            if (i == sum) {
                return i;
            }
        }
        return -1;
    }
}