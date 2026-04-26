import java.util.*;

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: store characters
        List<Character> list = new ArrayList<>(map.keySet());

        // Step 3: sort
        Collections.sort(list, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a); // high freq first
            }
            return a - b; // ASCII order
        });

        // Step 4: build result
        StringBuilder res = new StringBuilder();
        for (char ch : list) {
            int freq = map.get(ch);
            while (freq-- > 0) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}