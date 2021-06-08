package PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) return false;
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.reverse();
        long reversedNum = Long.valueOf(sb.toString());
        if(x == reversedNum) return true;
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(-1));
        System.out.println(solution.isPalindrome(1234567899));

        System.out.println(solution.isPalindrome(0));
        System.out.println(solution.isPalindrome(11));
        System.out.println(solution.isPalindrome(111));
        System.out.println(solution.isPalindrome(222222222));
    }
}
