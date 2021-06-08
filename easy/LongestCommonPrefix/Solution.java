package LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }

        if(strs.length == 1) {
            return strs[0];
        }

        int minLength = Integer.MAX_VALUE;
        for(String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        String prefix = "";
        for(int i = 0; i <= minLength; i++) {
            String tmp = strs[0].substring(0, i);
            for(int j = 1; j < strs.length; j++) {
                if(!strs[j].startsWith(tmp)) {
                    return prefix;
                }
            }
            prefix = tmp;
        }
        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"abc", "abcd", "ab"}));
    }
}
