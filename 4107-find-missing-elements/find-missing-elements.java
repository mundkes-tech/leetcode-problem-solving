class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missinglist = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[n-1];

        int[] arr = new int[max+1];
        Arrays.fill(arr,-1);

        for(int i=0;i<nums.length;i++){
            arr[nums[i]] = 0;
        }

        for(int i=min;i<=max;i++){
            if(arr[i] == -1){
                missinglist.add(i);
            }
        }
    return missinglist;
    }
}