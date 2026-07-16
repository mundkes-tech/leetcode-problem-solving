class Solution {
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max = nums[0];

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            arr[i] = getGCD(max, nums[i]);
        }

        Arrays.sort(arr);

        long sum = 0;
        int left = 0, right = n - 1;

        while (left < right) {
            sum += getGCD(arr[left], arr[right]);
            left++;
            right--;
        }

        return sum;
    }
}