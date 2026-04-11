class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> positions = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            positions
                .computeIfAbsent(nums[i], k -> new ArrayList<>())
                .add(i);
        }

        int ans = Integer.MAX_VALUE;

        for (List<Integer> list : positions.values()) {
            if (list.size() < 3) continue;

            for (int i = 1; i < list.size() - 1; i++) {
                int left = list.get(i) - list.get(i - 1);
                int right = list.get(i + 1) - list.get(i);
                ans = Math.min(ans, 2 * (left + right));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}