import java.util.*;

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];  // must be even

        Arrays.sort(changed);
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : changed) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] original = new int[n / 2];
        int idx = 0;

        for (int num : changed) {
            if (freq.get(num) == 0) continue;  // already used

            // handle case for 0 separately (because 0 * 2 = 0)
            if (num == 0) {
                if (freq.get(num) < 2) return new int[0];
                freq.put(num, freq.get(num) - 2);
                original[idx++] = num;
                continue;
            }

            // check double exists
            if (freq.getOrDefault(num * 2, 0) == 0) return new int[0];

            // use both
            freq.put(num, freq.get(num) - 1);
            freq.put(num * 2, freq.get(num * 2) - 1);
            original[idx++] = num;
        }

        return original;
    }
}
