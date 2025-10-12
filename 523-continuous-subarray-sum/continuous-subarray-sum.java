class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1); // remainder 0 before any element

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int rem = sum % k;
            if (rem < 0) rem += k; // handle negative remainders

            if (mp.containsKey(rem)) {
                if (i - mp.get(rem) >= 2)
                    return true;
            } else {
                mp.put(rem, i);
            }
        }
        return false;
    }
}
