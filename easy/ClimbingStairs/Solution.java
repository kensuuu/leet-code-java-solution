package easy.ClimbingStairs;

class Solution {
    // public int climbStairs(int n) {
    //     // brute force
    //     return climb_Stairs(0, n);
    // }

    // public int climb_Stairs(int i, int n) {
    //     if (i > n) {
    //         return 0;
    //     }
    //     if (i == n) {
    //         return 1;
    //     }
    //     return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    // }
    // public int climbStairs(int n) {
    //     int memo[] = new int[n + 1];
    //     return climb_Stairs(0, n, memo);
    // }

    // public int climb_Stairs(int i, int n, int memo[]) {
    //     if (i > n) {
    //         return 0;
    //     }
    //     if (i == n) {
    //         return 1;
    //     }
    //     if (memo[i] > 0) {
    //         return memo[i];
    //     }
    //     memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
    //     return memo[i];
    // }

    public int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        // indexがn-1とn-2を足した値が�?�るnに入�?
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.climbStairs(45));
        System.out.println(solution.climbStairs(5));
        System.out.println(solution.climbStairs(45));
    }
}