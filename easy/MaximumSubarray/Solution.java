package MaximumSubarray;

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int sum = nums[i - 1] + nums[i];
            if (sum > nums[i]) nums[i] = sum;
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(solution.maxSubArray(new int[] {1}));
        System.out.println(solution.maxSubArray(new int[] {5, 4, -1, 7, 8}));
    }
}