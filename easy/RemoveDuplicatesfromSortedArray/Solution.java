package easy.RemoveDuplicatesfromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 0;

        if (len == 0) return 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) len--;
            else {
                nums[count] = nums[i];
                count++;
            }
        }
        nums[len - 1] = nums[nums.length - 1];
        return len;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] data = new int[]{0, 1, 1, 2, 3, 3, 3};
        int len = solution.removeDuplicates(data);
        for (int i = 0; i < len; i++) {
            System.out.print(data[i] + (i == len - 1 ? "" : ", "));
        }
    }
}
