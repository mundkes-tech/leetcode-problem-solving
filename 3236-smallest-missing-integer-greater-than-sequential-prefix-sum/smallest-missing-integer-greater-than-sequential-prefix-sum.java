class Solution {
    public int missingInteger(int[] nums) 
    {
        int sum=nums[0];
        HashSet<Integer> set = new HashSet<>();
        boolean flag = true;
        for(int j=1;j<nums.length;j++){
            if(nums[j] - nums[j-1] != 1){
                flag = false;
            };
            if(nums[j] == nums[j-1]+1 && flag == true){
                sum+=nums[j];
            }
            else if(nums[j]>=sum){
                set.add(nums[j]);
                System.out.println(nums[j]);
            };
        }
        set.add(nums[0]);
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}