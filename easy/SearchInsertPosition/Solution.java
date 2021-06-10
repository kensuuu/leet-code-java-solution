package SearchInsertPosition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[] {1, 3, 5, 6}, 5));
        System.out.println(solution.searchInsert(new int[] {1, 3, 5, 6}, 2));
        System.out.println(solution.searchInsert(new int[] {1, 3, 5, 6}, 7));
        System.out.println(solution.searchInsert(new int[] {1, 3, 5, 6}, 0));
        System.out.println(solution.searchInsert(new int[] {1}, 0));
    }
}
