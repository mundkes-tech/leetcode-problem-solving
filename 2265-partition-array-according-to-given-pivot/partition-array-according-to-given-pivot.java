class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] resarr = new int[nums.length];
        int i = 0;
        for(int num : nums){
            if(num<pivot){
                resarr[i]=num;
                i++;
            }
        } 

        for(int num : nums){
            if(num==pivot){
                resarr[i]=num;
                i++;
            }
        } 

        for(int num : nums){
            if(num>pivot){
                resarr[i]=num;
                i++;
            }
        } 

        return resarr;
    }
}