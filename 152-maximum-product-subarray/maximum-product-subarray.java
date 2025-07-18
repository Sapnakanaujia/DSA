class Solution {
    public int maxProduct(int[] arr) {
         int n=arr.length;
        int cMin=arr[0];
        int cMax=arr[0];
        int maxProduct=arr[0];
        for(int i= 1;i<n;i++){
            int temp= cMax;
            cMax=Math.max(arr[i],Math.max(cMax*arr[i],cMin*arr[i]));
            cMin=Math.min(arr[i],Math.min(temp*arr[i],cMin*arr[i]));
            maxProduct=Math.max(cMax,maxProduct);
        }
        return maxProduct;
    }
}