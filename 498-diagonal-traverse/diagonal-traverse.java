import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Store elements by sum of indices (i + j)
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map.computeIfAbsent(i + j, k -> new ArrayList<>()).add(mat[i][j]);
            }
        }

        List<Integer> res = new ArrayList<>();

        // Traverse diagonals in order
        for (int k = 0; k <= n + m - 2; k++) {
            List<Integer> diag = map.get(k);
            if (k % 2 == 0) {  // reverse every alternate diagonal
                Collections.reverse(diag);
            }
            res.addAll(diag);
        }

        // Convert list to array
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}
