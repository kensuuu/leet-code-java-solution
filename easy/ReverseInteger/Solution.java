package ReverseInteger;

class Solution {
    public int reverse(int x) {
        long tmp = x;
        tmp = Math.abs(tmp);
        StringBuilder sb = new StringBuilder();
        sb.append(tmp);
        sb.reverse();
        long ans = Long.valueOf(sb.toString());
        if(x < 0) ans *= -1;
        return ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ? 0 : (int) ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-2147483648));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(100));
        System.out.println(solution.reverse(1000000003));
    }
}
