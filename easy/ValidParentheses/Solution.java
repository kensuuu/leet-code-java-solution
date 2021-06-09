package easy.ValidParentheses;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        int len = s.length();
        if (len % 2 != 0){
            return false;
        }
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                if (stack.empty() || stack.pop() != map.get(c)) {
                    return false;
                } 
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()[]{}({[]})"));
        System.out.println(solution.isValid("(("));
        System.out.println(solution.isValid("(])]"));
    }
}