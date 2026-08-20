import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            int ele1 = arr1.get(arr1.size() - 1);
            int ele2 = arr2.get(arr2.size() - 1);

            if(ele1 > ele2){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int[] resarr = new int[arr1.size() + arr2.size()];
        int index = 0;

        for (int num : arr1) {
            resarr[index++] = num;
        }

        for (int num : arr2) {
            resarr[index++] = num;
        }

        return resarr;

    }
}