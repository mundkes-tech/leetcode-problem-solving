import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, Integer> last = new HashMap<>();
        Map<Integer, Integer> secondLast = new HashMap<>();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (last.containsKey(num) && secondLast.containsKey(num)) {
                int k = i;
                int j = last.get(num);
                int x = secondLast.get(num);

                int dist = Math.abs(x - j) + Math.abs(j - k) + Math.abs(k - x);
                min = Math.min(min, dist);
            }

            if (last.containsKey(num)) {
                secondLast.put(num, last.get(num));
            }
            last.put(num, i);
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}