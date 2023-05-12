package medium.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int max = 0;
        for (Integer i : set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                while (set.contains(++i)) {
                    count++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
