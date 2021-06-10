package easy.RemoveElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,2,3};
        System.out.println(solution.removeElement(nums, 3));
    }
}
