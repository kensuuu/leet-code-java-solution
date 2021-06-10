package PlusOne;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int newDigits[] = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.showNums(solution.plusOne(new int[] {9,9,9,9}));
        solution.showNums(solution.plusOne(new int[] {1,2,3}));
        solution.showNums(solution.plusOne(new int[] {0}));
        solution.showNums(solution.plusOne(new int[] {8,9}));
    }

    public void showNums(int[] nums) {
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}