class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
        int hi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            hi = Math.max(arr[i], hi);
        }

        int lo = 1;
        int ans = hi;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long hours = 0;

            for (int i = 0; i < n; i++) {
                hours += (arr[i] + mid - 1) / mid;  // ceil division
            }

            if (hours <= h) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
