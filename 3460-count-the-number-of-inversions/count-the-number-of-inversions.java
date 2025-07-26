import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfPermutations(int n, int[][] requirements) {
        int maxInv = 400;

        // dp[i][j] = number of permutations of length i with j inversions
        int[][] dp = new int[n + 1][maxInv + 1];
        dp[0][0] = 1;

        // Fill dp table
        for (int i = 1; i <= n; i++) {
            for (int inv = 0; inv <= maxInv; inv++) {
                for (int k = 0; k < i; k++) {
                    if (inv - k >= 0) {
                        dp[i][inv] = (dp[i][inv] + dp[i - 1][inv - k]) % MOD;
                    }
                }
            }
        }

        // requirements as map from length (i+1) to required inversion count
        int[] req = new int[n + 1];
        Arrays.fill(req, -1);
        for (int[] r : requirements) {
            req[r[0] + 1] = r[1]; // r[0] is end index, +1 to match 1-based dp index
        }

        // dp2[i][j] = valid permutations of length i with j inversions (filtered)
        int[][] dp2 = new int[n + 1][maxInv + 1];
        dp2[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int inv = 0; inv <= maxInv; inv++) {
                for (int k = 0; k < i; k++) {
                    if (inv - k >= 0) {
                        dp2[i][inv] = (dp2[i][inv] + dp2[i - 1][inv - k]) % MOD;
                    }
                }
            }

            // Filter based on requirement for prefix of length i
            if (req[i] != -1) {
                int required = req[i];
                for (int j = 0; j <= maxInv; j++) {
                    if (j != required) {
                        dp2[i][j] = 0;
                    }
                }
            }
        }

        // Final answer = sum of valid dp2[n][inv] values
        int ans = 0;
        for (int inv = 0; inv <= maxInv; inv++) {
            ans = (ans + dp2[n][inv]) % MOD;
        }

        return ans;
    }
}
