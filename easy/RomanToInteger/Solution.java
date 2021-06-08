package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int ans = map.get(s.charAt(len - 1));
        for(int i = len -2; i >= 0; --i){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                ans -= map.get(s.charAt(i));
            }else{
                ans += map.get(s.charAt(i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));// 1994
        System.out.println(solution.romanToInt("LVIII"));// 58
    }
}