package easy.ImplementStrStr;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } 

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("a", "a"));
        System.out.println(solution.strStr("aaaaa", "bba"));
        System.out.println(solution.strStr("", ""));
    }
}