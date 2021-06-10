package LengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) return 0;
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World"));
        System.out.println(solution.lengthOfLastWord(" "));
    }
}
