class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        
        // Step 1: Build jobs array
        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i]; // start
            jobs[i][1] = endTime[i];   // end
            jobs[i][2] = profit[i];    // profit
        }
        
        // Step 2: Sort by end time
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);
        
        // Step 3: DP array
        int[] dp = new int[n];
        dp[0] = jobs[0][2];
        
        for (int i = 1; i < n; i++) {
            int include = jobs[i][2];
            
            // Step 4: Binary search for last non-overlapping job
            int lo = 0, hi = i - 1, idx = -1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (jobs[mid][1] <= jobs[i][0]) {
                    idx = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            
            if (idx != -1) {
                include += dp[idx];
            }
            
            // Step 5: Transition
            dp[i] = Math.max(dp[i - 1], include);
        }
        
        return dp[n - 1];
    }
}