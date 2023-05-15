package easy.BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min < prices[i])
                max = Math.max(prices[i] - min, max);
            else
                min = prices[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(solution.maxProfit(new int[]{1, 2}));
    }
}
