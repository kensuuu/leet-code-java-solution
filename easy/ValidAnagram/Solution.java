package easy.ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char chars : s.toCharArray()) {
            map.put(chars, map.getOrDefault(chars, 0) + 1);
        }

        for (char chart : t.toCharArray()) {
            if (map.containsKey(chart)) {
                map.put(chart, map.get(chart) - 1);
                if (map.get(chart) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
    }
}
