import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> getleftMax(int[] height, int n){
        ArrayList<Integer> leftmax = new ArrayList<>();
        leftmax.add(height[0]);
        for(int i=1;i<n;i++){
            leftmax.add(Math.max(leftmax.get(i - 1), height[i]));
        }
        return leftmax;
    }
    public ArrayList<Integer> getrightMax(int[] height, int n){
        ArrayList<Integer> rightmax= new ArrayList<>();;
        for (int i = 0; i < n; i++) rightmax.add(0); // placeholder
        rightmax.set(n - 1, height[n - 1]);
        for(int i=n-2;i>=0;i--){
           rightmax.set(i,Math.max(rightmax.get(i+1), height[i]));
        }
        return rightmax;
    }
    public int trap(int[] height) {
        int n =height.length;
        if (n == 0) return 0;
        ArrayList<Integer> left = getleftMax(height, n);
        ArrayList<Integer> right = getrightMax(height, n);
        int sum=0;
        for(int i=0;i<n;i++){
            int h= Math.min(left.get(i),right.get(i))-height[i];
            sum+=h;
        }
        return sum;
    }
}