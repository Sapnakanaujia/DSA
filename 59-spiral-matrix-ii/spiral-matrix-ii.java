class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        
        while (num <= n * n) {
            // left → right
            for (int i = left; i <= right && num <= n * n; i++) {
                res[top][i] = num++;
            }
            top++;
            
            // top → bottom
            for (int i = top; i <= bottom && num <= n * n; i++) {
                res[i][right] = num++;
            }
            right--;
            
            // right → left
            for (int i = right; i >= left && num <= n * n; i--) {
                res[bottom][i] = num++;
            }
            bottom--;
            
            // bottom → top
            for (int i = bottom; i >= top && num <= n * n; i--) {
                res[i][left] = num++;
            }
            left++;
        }
        
        return res;
    }
}
