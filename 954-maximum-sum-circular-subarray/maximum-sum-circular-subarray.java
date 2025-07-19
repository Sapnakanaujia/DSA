class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int n= arr.length;
        int currMaxSum=0,currMinSum=0;
        int totalSum=0;
        int maxSum=arr[0],minSum=arr[0];
        for(int i=0;i<n;i++){
            currMaxSum=Math.max(currMaxSum+arr[i],arr[i]);
            maxSum=Math.max(currMaxSum,maxSum);
            currMinSum=Math.min(currMinSum+arr[i],arr[i]);
            minSum=Math.min(currMinSum,minSum);
            
            totalSum+=arr[i];
        }
        int normalSum=maxSum;
        int circularSum=totalSum-minSum;
        if(minSum==totalSum){
            return normalSum;
        }
        return Math.max(normalSum,circularSum); 
    }
}