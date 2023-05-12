package medium.InputArrayIsSorted;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i + 1);
        }
        for (int i = 0; i < numbers.length; ++i) {
            if (map.containsKey(target - numbers[i])) {
                return IntStream.of(i + 1, map.get(target - numbers[i]))
                        .sorted()
                        .toArray();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{-1, 0}, -1)));
    }
}
